---
title: Advice On Creating Objectdraw Reference Tests
---
## Please edit system and help pages ONLY in the moinmaster wiki! For more
## information, please see [Moin Master](MoinMaster.html):MoinPagesEditorGroup.
##acl [Moin Pages Editor Group](MoinPagesEditorGroup.html):read,write,delete,revert All:read
##master-page:[Help Template](HelpTemplate.html)
##master-date:Unknown-Date
#format wiki
#language en

## Creating Objectdraw Reference Tests for Web-CAT: Some Friendly Advice 

### Introduction 

Students have many luxuries when using the Web-CAT system.  They are testing THEIR code to make sure that it works.  They know how their code works and they know the "ins and outs" of how to test it.  In a system where students are dealing with more complex objects, such as the shapes in the objectdraw program, it can quickly become difficult to create tests that will work _for all_ students.  This Wiki page is here to suggest some core principles on creating reference tests, as well as give the reader some examples as to how to proceed with creating reference tests.

### Core Principles 

To begin with, let us develop a set of principles to go by in creating a reference test class:

1. Do **not** create a reference test that tests some element of functionality that isn't _explicitly_ in the Program Spec.
2. Write tests that emphasize the objectives of the assignment.
3. Do not write tests that "nitpick".  That is, do not write tests that test functionality that, while it is there in the spec, would ultimately not require a significant change to the program and, at the same time, penalizes the student severely.
4. With the above 3 principles, you can derive the corollary that your reference tests should sufficiently test the students code while not making the student feel like they're being subjected to bureaucratic overload.
5. Make your test methods "implementation independent".  In other words, do not write test cases that will behave differently for two equally-acceptable implementations.
5. Do **_not_** create a reference test that tests some element of functionality that isn't _explicitly_ in the Program Spec.  (It's important, so it's repeated.)

### Examples 

Let's take, for example, the case of an invisible squares game.  There are three boxes on the screen, small, bigger, biggest that are differently-colored are kept hidden on the screen.  A player clicks on the screen and the user is given feedback based on how close to the box they were able to click.  Close clicks get a "HOT" message displayed that is the same color as the box.  There is a scoring system depending on which square(s) are clicked and when the mouse exits the screen, the final score is displayed.  When the mouse reenters the game board, the board is reset to random positions for each of the squares.  This is a fairly complicated lab to test, so it will give us plenty of opportunities to show what to do and what not to do.

#### Example 1: Something that isn't in the spec 

What do you believe is wrong with the following test?  With the brief sketch of the assignment above, and our operating principles, try to determine where there can be changes.

~~~ java
// Tests the state of the program when it first starts.

    public void testInitialState()
{
        x.assert[Exist Text](ExistText.html)(5.0, 55.0);
        x.assert[Correct Text](CorrectText.html)(x.getHintMessage(), "");
x.assertColor(x.getSmallBox(), Color.GRAY);
x.assertColor(x.getMediumBox(), Color.CYAN);
x.assertColor(x.getLargeBox(), Color.MAGENTA);
        x.assertInvisible(x.getSmallBox());
x.assertInvisible(x.getMediumBox());
x.assertInvisible(x.getLargeBox());
    }
~~~

Look at Line 4.  There are 2 text boxes that we need to deal with in this assignment.  The score text box and the hint text box.  There is nothing in our brief write-up of the assignment that says that a text box _has_ to be at location (5, 55.0).  We only know that there are 2 text boxes and _they may not even be initialized until they're needed_ making an assertion about whether or not an object exists unless it's _explicitly_ indicated is a no-no.

Look at Line 6.  The hint message box, according to this line of code should have the empty string.  Is this absolutely necessary?  While it would make sense to have it empty, some student may put a message in there.  It wouldn't hurt the outcome of the program and it isn't explicitly in the spec that it's there so there _should_ instead just be a check to see if a hint box exists.

Look at lines 7-9.  This is a _clear_ no-no.  Our specification does not state that they have to be gray, cyan, and magenta, only that they are "differently-colored".  This should be replaced so that it more closely reflects what we are trying to test.

Here is some revised code that is probably a bit closer to what needs to be tested.

~~~ java

    // Tests the state of the program when it first starts.
public void testInitialState()
{
        assert[Hint Is](HintIs.html)( null );
        assertTrue( !x.getSmallBox().getColor().equals( x.getMediumBox().getColor() ) );
assertTrue( !x.getSmallBox().getColor().equals( x.getLargeBox().getColor() ) );
assertTrue( !x.getMediumBox().getColor().equals( x.getLargeBox().getColor() ) );
        x.assertInvisible(x.getSmallBox());
x.assertInvisible(x.getMediumBox());
x.assertInvisible(x.getLargeBox());
    }
    private void assert[Hint Is](HintIs.html)( String value )
{
        Text hint = x.getHintMessage();
String hintMsg = hint.getText();
if ( value == null ) // Interpret a null hint as "blank"
{
            assertTrue( hint.isHidden()                  // most common
                || hintMsg == null               // unlikely?
|| hintMsg.matches( "^\\s*$" )   // any invisible white space
            );
        }
else
{
            // A case-insensitive search for a word
assertTrue( hintMsg.matches( "(?i)\\b" + value + "\\b" ) );
        }
    }
~~~

This implementation guarantees that only what was written in the specification is there.  It also gives us a "helper" assert method that we can use in comparing the text of the hint message in other tests.

#### Example 2:  Differing implementations 

Consider the following code: 

~~~ java

    public void testMediumLargeBoxClicked()
{
        prepareNewNonOverlappingSquareGame();
Location clickLocation = new Location(x.getLargeBox().getX() + 1.0,
            x.getLargeBox().getY() + 1.0);
        x.on[Mouse Click](MouseClick.html)(clickLocation);
clickLocation = new Location(x.getMediumBox().getX() + 1.0,
            x.getMediumBox().getY() + 1.0);
        x.on[Mouse Click](MouseClick.html)(clickLocation);
x.on[Mouse Exit](MouseExit.html)(new Location(10.0, 10.0));
        assert[Right Score Click](RightScoreClick.html)(x.getScoreMessage().getText(), 108, 2);
    }
        private void prepareNewNonOverlappingSquareGame()
{
            x.on[Mouse Enter](MouseEnter.html)(new Location(10.0, 10.0));
x.getLargeBox().moveTo(10, 10);
x.getMediumBox().moveTo(150, 150);
x.getSmallBox().moveTo(0, 200);
        }
~~~

Everything should look pretty good here.  We are getting the results strictly from the student's accessor methods.  We are not testing things that are not in the specification.  Any idea what the problem could be?  Look at prepareNewNonOverlappingSquareGame().  We move the boxes on our own.  How do we know that by moving the boxes, we aren't impacting how the distance between the click location and the box is calculated and whether or not it's close or not.  (As it turns out, we don't.)  One student may implement all of those calculations when the mouse click occurs (which our reference tests would accept).  Other students may set up some sort of "click field" with another square that wouldn't be moved when we move the small, medium and large box.  This our reference tests would _not_ accept.  The solution here is to try to stay closer to the expected behavior of the program as a whole.

Regard this modified version of the prepareNewNonOverlappingSquareGame()
~~~ java

    private int prepareNewNonOverlappingSquareGame()
{
        Location small[Hot Point](HotPoint.html);
Location med[Hot Point](HotPoint.html);
Location large[Hot Point](HotPoint.html);
Location smallMiddle;
Location medMiddle;
Location largeMiddle;
int      unmovedCount = 0;
        /[/ Hot](/Hot.html) spot location to be clicked is one spot away from the origin.
small[Hot Point](HotPoint.html) = new Location(x.getSmallBox().getLocation().getX()-1.0, x.getSmallBox().getLocation().getY());
med[Hot Point](HotPoint.html) = new Location(x.getMediumBox().getLocation().getX()-1.0, x.getMediumBox().getLocation().getY());
large[Hot Point](HotPoint.html) = new Location(x.getLargeBox().getLocation().getX()-1.0, x.getLargeBox().getLocation().getY());
        /[/ Compute](/Compute.html) the center of the box.
smallMiddle = new Location(x.getSmallBox().getLocation().getX() + 15.0, x.getSmallBox().getLocation().getY()+15.0);
medMiddle = new Location(x.getMediumBox().getLocation().getX() + 22.5, x.getMediumBox().getLocation().getY() + 22.5);
largeMiddle = new Location(x.getLargeBox().getLocation().getX() + 40.0, x.getLargeBox().getLocation().getY() + 40.0);
        /[/ While](/While.html) the distances from the desired spot to be considered as the "hot point" and the 
//differently-shaped boxes are smaller than the largest of the two boxes being evaluated,
/[/ Randomly](/Randomly.html) create a new game by going off the canvas and back onto the canvas.
while(  (small[Hot Point](HotPoint.html).distanceTo(medMiddle) < 22.5)
            ||(small[Hot Point](HotPoint.html).distanceTo(largeMiddle) < 40.0)
||(med[Hot Point](HotPoint.html).distanceTo(smallMiddle) < 22.5)
||(med[Hot Point](HotPoint.html).distanceTo(largeMiddle) < 40.0)
||(large[Hot Point](HotPoint.html).distanceTo(smallMiddle) < 40.0)
||(large[Hot Point](HotPoint.html).distanceTo(medMiddle) < 40.0))
        {
            x.on[Mouse Exit](MouseExit.html)(new Location(10, 10));
x.on[Mouse Enter](MouseEnter.html)(new Location(10, 10));
Location oldSHP = small[Hot Point](HotPoint.html);
Location oldMHP = med[Hot Point](HotPoint.html);
Location oldLHP = large[Hot Point](HotPoint.html);
small[Hot Point](HotPoint.html) = new Location(x.getSmallBox().getLocation().getX()-1.0, x.getSmallBox().getLocation().getY());
med[Hot Point](HotPoint.html) = new Location(x.getMediumBox().getLocation().getX()-1.0, x.getMediumBox().getLocation().getY());
large[Hot Point](HotPoint.html) = new Location(x.getLargeBox().getLocation().getX()-1.0, x.getLargeBox().getLocation().getY());
smallMiddle = new Location(x.getSmallBox().getLocation().getX() + 15.0, x.getSmallBox().getLocation().getY()+15.0);
medMiddle = new Location(x.getMediumBox().getLocation().getX() + 22.5, x.getMediumBox().getLocation().getY() + 22.5);
largeMiddle = new Location(x.getLargeBox().getLocation().getX() + 40.0, x.getLargeBox().getLocation().getY() + 40.0);
            /[/ Students](/Students.html) were told to move the boxes after each iteration.  Some students aren't and they're getting "timeouts" on
//this method call.
if ( small[Hot Point](HotPoint.html).equals( oldSHP )
                && med[Hot Point](HotPoint.html).equals( oldMHP )
&& large[Hot Point](HotPoint.html).equals( oldLHP ) )
            {
                unmovedCount++;
assertTrue( "hint: boxes are not reset to new positions after mouse exit/entry",
                    unmovedCount < 3 );
            }
else
{
                unmovedCount = 0;
            }
        }
return 0;
    }

}}}While not nearly as nice as the previous implementation, this has the benefit of more closely following the specification of the assignment.  If students are complying with the specification,
then this private method should correctly set up a new game that would work for any implementation.  Another cardinal rule of writing test cases--reference tests aren't always pretty.

#### Example 3: Nitpicking 

Consider the following test case:
~~~ java

    public void testSmallAndMediumBoxesClicked()
{
        prepareNewNonOverlappingSquareGame();
Location clickLocation = new Location(x.getSmallBox().getX() + 1.0,
            x.getSmallBox().getY() + 1.0);
        x.on[Mouse Click](MouseClick.html)(clickLocation);
clickLocation = new Location(x.getMediumBox().getX() + 1.0,
            x.getMediumBox().getY() + 1.0);
        x.on[Mouse Click](MouseClick.html)(clickLocation);
x.on[Mouse Exit](MouseExit.html)(new Location(10.0, 10.0));
        assert[Right Score Click](RightScoreClick.html)(x.getScoreMessage().getText(), "Your score was: 148 with: 2 clicks");
    }
~~~

Look at the last line.  Is it ok?  The programming assignment write-up actually has this text for students to use.  Do we _really_ want students to fail the test because they didn't capitalize "Your"?  Probably not.  A better implementation would probably be something more like this:

~~~ java

    public void testSmallAndMediumBoxesClicked()
{
        prepareNewNonOverlappingSquareGame();
Location clickLocation = new Location(x.getSmallBox().getX() + 1.0,
            x.getSmallBox().getY() + 1.0);
        x.on[Mouse Click](MouseClick.html)(clickLocation);
clickLocation = new Location(x.getMediumBox().getX() + 1.0,
            x.getMediumBox().getY() + 1.0);
        x.on[Mouse Click](MouseClick.html)(clickLocation);
x.on[Mouse Exit](MouseExit.html)(new Location(10.0, 10.0));
        assert[Right Score Click](RightScoreClick.html)(x.getScoreMessage().getText(), 148, 2);
    }
        private void assert[Right Score Click](RightScoreClick.html)(String scoreDisplay, int score, int clicks)
{
            int findCount = 0;
Pattern pattern = Pattern.compile("[0-9]+");
Matcher matcher = pattern.matcher(scoreDisplay);
assertTrue("hint: cannot find score in score message",
                matcher.find() );
            assertEquals("hint: incorrect scoring", score, Integer.parseInt(matcher.group()));
assertTrue("hint: cannot find click count in score message",
                matcher.find() );
            assertEquals("hint: incorrect click count", clicks, Integer.parseInt(matcher.group()));
        }
~~~

This results in _just_ the score and the number of clicks being critiqued. Everything else is parsed out.  This gives the students a little more flexibility in what they write and how it ends up being tested and students aren't driven crazy by missing periods or misspelled words that aren't really relevant to whether or not they understand how to compute the score and the right number of clicks.

### Conclusions 

This should be a good introduction to the concept of creating reference tests for objectdraw programming assignments.  Really, the same principles apply for other types of reference tests, as well.  As more examples come along, this page will be updated to show you what to do and what not to do when creating your own tests for you students.
