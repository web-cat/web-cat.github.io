---
title: 'JavaTddPlugin: Hint Control'
---
**Plug-in:** [JavaTddPlugin](index.html)

## JUnit 4.0  

In v3.0.0 of the [JavaTddPlugin](index.html), we added support for JUnit 4.x test cases.  Since the 4.x releases of JUnit still include the older 3.8-compatible classes, older test cases will still run as well.

For more information, read
[Get Acquainted with the New Advanced Features of JUnit 4](http://www.devx.com/Java/Article/31983) or
[JUnit 4.0 in 10 minutes](http://www.instrumentalservices.com/index.php?option=com_content&amp;task=view&amp;id=45&amp;Itemid=52).

## New  1.5-Enabled Features 

In v3.0.0 of the [JavaTddPlugin](index.html), we added support for better control over "hinting" and test case scoring.  We did this by adding our own Java annotations.

In earlier versions of the [JavaTddPlugin](index.html), instructors could provide hints to students by adding string messages to their test case assertions (the optional first argument in each `assert*()` method).  The advantage this provides is that instructors have complete control over the hints produced for students, and can reveal as much (or as little) detail as they wish.  There are several disadvantages, however:

* It requires extra effort on the part of instructors to insert hint messages--the default behavior is to provide no hints.
* It requires instructors to apply a great deal of forethought, including hints in as many assertions as possible.
* It makes it difficult to provide hints for errors during execution (unexpected exceptions, for example).
* It does not readily address potential errors in `setUp()` or `tearDown()` methods.

We believe these issues can be resolved (and some new features added) by redesigning the hint gathering engine for the plug-in.  So we did.  As part of this, we took advantage of the annotations introduced in Java 1.5.  In the prior version of the plug-in (and using JUnit 3.8.x), instructors would declare test methods inside a test class like this:

~~~ java
public void testFooBar()
{
    // do some actions
    assertEquals("hint: a message for students", a, b);
}
~~~

Using JUnit 4.x, the same test case instead can be written like this:

~~~ java
@Test
public void fooBar()
{
    // do some actions
    assertEquals("hint: a message for students", a, b);
}
~~~

The `@Test` annotation indicates that this is a test method.
An optional `timeout` parameter to the `@Test` annotation allows you to specify
individual timeout requirements on a test method-by-test method basis.  An optional
`expected` parameter to the `@Test` annotation allows you to specify the class
of an exception that you expect to be thrown by that test method (eliminating the
need for a try/catch block with an empty catch body, for example).

JUnit 4.0 also provides `@Before` to mark one (or more) methods that are called before each test (taking the place of `setUp()`), `@After` to mark `tearDown()`-like methods, `@[Before Class](../BeforeClass.html)` and `@[After Class](../AfterClass.html)` to mark once-per-class setup/teardown methods, and `@Ignore` to mark test cases that should not be executed.

We have built in better hint building behavior, and also added five new annotations to control the hinting behavior for individual methods: `@Hint`, `@[Hint Prefix](../HintPrefix.html)`, `@[Only Explicit Hints](../OnlyExplicitHints.html)`, `@[Scoring Weight](../ScoringWeight.html)`, and `@[No Stack Traces](../NoStackTraces.html)`.  To use these features, **be sure to `import net.sf.webcat.annotations.*;`.**

### Default Hinting Behavior 

V3.0.0 of the [JavaTddPlugin](index.html) provides "default" hints for all test methods (rather than a default of no hints).  The default hint message for a test method named `fooBar()` would be `foo bar`.  If this test method failed, the plug-in would generate the following feedback for the student:

~~~
The following hint(s) may help you locate some ways in which your solution and your testing
may be inproved:

foo bar
~~~

If you are using the older naming convention, `testFooBar()`, the initial `test` would be removed from the name to generate the default hint.

The default hint for the method would be used whenever any failure (that is, violated test case assertion) or error (that is, an unexpected exception) occurs within that test method.

Individual assertions inside a test case method no longer need string arguments--the default hint will be used instead, if no string argument is provided.  If an assertion within a test case method _does_ contain a string argument, the contents of that string would be used as the hint message if that particular assertion failed.

~~~ java
@Test
public void fooBar()
{
    // an exception below  produces the hint "foo bar"
    FooClass foo = new Foo();
    // do some actions
    // a failure here produces the hint "method b()"
    assertEquals("method b()", a, foo.b());
    // an exception here produces the hint "foo bar"
    assertEquals(a, foo.b());
}
~~~

Sometimes, you might even want to include a specific method name (from the code under test) in your default hint.  You can do that using an "_m" in your method name, like this:

~~~ java
@Test
public void emptyStringIn_mFooBar()
{
    // a failure produces the hint "empty string in fooBar()"
}

@Test
public void mFooBar2_onAnEvenNumber()
{
    // a failure produces the hint "fooBar2() on an even number"
}

@Test
public void mAnotherMethod()
{
    // a failure produces the hint "anotherMethod()"
}
~~~

### @Hint 

You can override the default hint for a method (based on
the method name) using the `@Hint` annotation:

~~~ java
@Test
@Hint("place your desired default hint here")
public void anObscureMethodName()
{
    ...
}
~~~

### @HintPrefix 

Sometimes, a hint message like "foo bar" is a bit cryptic, and you may want something a
bit longer.  Earlier versions of the plug-in always inserted a fixed text string in front of each
hint, like this:

~~~
hint: your code/tests do not correctly cover foo bar
~~~

Of course, different people write their hint strings in different ways, so this fixed prefix
was not appropriate for everyone.  The 2.x versions of the [JavaTddPlugin](index.html) did not
use a fixed prefix at all, and instead used the text parameter provided in the assertion
message (after stripping the leading "hint: " prefix).

In v3.0.0, you can provide your own fixed prefix for all your
hints using the `@HintPrefix` annotation:

~~~ java
@HintPrefix("incomplete coverage of behavior: ")
public class MyTests
{

    @Test
    public void featureOne()
    {
        ...
    }

    @Test
    @HintPrefix("be careful about ")
    public void featureTwo()
    {
        ...
    }

}
~~~

If you specify the `@HintPrefix` annotation for an entire test class, then each hint
generated for that class would include the specified prefix before the hint itself.
Similarly, by including the annotation on an individual method, you can specify
the prefix to be used for hints within that method:

~~~
incomplete coverage of behavior: feature one
be careful about feature two
~~~

A global "set and forget"
configuration parameter for the entire plug-in will also be provided as part of the
plug-in's reusable configuration options.

### @OnlyExplicitHints 

If you specify the `@OnlyExplicitHints` annotation for an entire test class, then
**no hints** will be generated at all, except those that come directly from the
string messages provided to test case assertions.  This would restore to older
behavior, where the default is no information, but on a class-by-class basis.

You can also specify this annotation on a single test method to turn off
default messaging behavior on a method-by-method basis.

~~~ java
@OnlyExplicitHints
public class MyTests
{
    ...
}
~~~

A global "set and forget"
configuration parameter for the entire plug-in will also be provided as part of the
plug-in's reusable configuration options.

### @ScoringWeight 

In the 2.x versions of the [JavaTddPlugin](index.html), all test methods in all test
case classes were weighted equally when it comes to scoring.  If there are
25 test case methods (over all test classes together), and only 20 of
them pass, the student receives 80% credit.

To address this, we have added a `@ScoringWeight` annotation that takes
a single float parameter.  Test methods have a default weight of
1.0, and instructors can now specify different weights on individual
classes or test case methods.

~~~ java
@ScoringWeight(2.0)
public class MyTests
{
    @Test
    public void featureOne()
    {
        ...
    }

    @Test
    @ScoringWeight(0.5)
    public void featureTwo()
    {
        ...
    }

}
~~~

### @NoStackTraces 

The 2.x versions of the [JavaTddPlugin](index.html) provided no calling sequence information for failed
reference tests.  Often, this is the preferred behavior, such as when a test case
fails because of a test case assertion (i.e., a method produces the wrong behavior).
However, in other situations, such as when a student-written assert fails inside student
code, or when an unexpected exception occurs, some stack tracing may be beneficial
in some circumstances.

In v3.0.0, we have added limited stack trace generation to go along with the corresponding
hint text for errors (e.g., unexpected exceptions) that occur during test case execution.

Instructors can use the `@NoStackTraces` annotation on an entire test class or on
individual test case methods to suppress this behavior.  A global "set and forget"
configuration parameter for the entire plug-in will also be provided as part of the
plug-in's reusable configuration options.

## Public Test Suites 

As a final addition, we are also considering adding support for a set of "plubic" reference tests,   At present, students
write their own tests, and instructors can (optionally) provide a set of "hidden" reference tests.
Students do not see results from hidden reference tests--the only feedback they receive is
the percentage passed, and any "hint" text that is provided.

"Public" reference tests are tests that are visible to students (say, posted as part of the
assignment specification), and for which students see all results.  We will add support
for optional instructor-provided public reference tests.  If omitted, behavior will remain
unchanged.  If provided, the public reference tests will be run against student code and
counted in scoring, just like the hidden tests, but students will see full output produced
by running the public reference tests, and will also be able to download the public
tests themselves via a download link next to the output in their graded feedback.

This will allow instructors to choose any combination of hidden reference tests, public
reference tests, and required or optional student-written tests.
