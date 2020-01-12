---
title: Dereferee Toolkit
---
Dereferee is a C++ template library intended for introductory C++ students learning about manual memory management and pointers. It provides a pointer template class that is instrumented to give highly detailed diagnostics about memory leaks, pointer-related errors that would normally cause a program crash, and other unwise behavior that may not cause an immediate failure but lead to one further down the line.

Unlike other pointer templates, such as **std::auto_ptr** and Boost's wide array of pointer templates, Dereferee's checked pointer does not to any memory management of its own--it will not fix problems, but merely report them so that the student can fix them on his or her own.

## Publications 

Anthony Allevato and Stephen H. Edwards. _Dereferee: Instrumenting C++ pointers with meaningful runtime diagnostics._ Poster presented at the 39th SIGCSE Technical Symposium on Computer Science Education, Portland, OR, 2008.  <a href="attachments/dereferee-poster.pdf">dereferee-poster.pdf</a>

Anthony Allevato and Stephen H. Edwards. _Dereferee: Exploring pointer mismanagement in student code_. In _Proceedings of the 40th SIGCSE Technical Symposium on Computer Science Education_. ACM Press, New York, NY, 2009.  <a href="attachments/dereferee-sigcse09.pdf">dereferee-sigcse09.pdf</a>

## Features 

Dereferee detects and logs the following kinds of errors or other poor programming practices:

* Calling the incorrect version of `delete` (that is, `delete` on an array allocated with `new[]` or `delete[]` on memory allocated with `new`)
* Deleting or dereferencing an uninitialized pointer
* Deleting or dereferencing memory that has already been freed
* Dereferencing a null pointer
* Memory leaks caused by the last valid pointer to a live block of memory going out of scope or being overwritten
* Performing a comparison with a pointer that has been deleted, is out of scope, or is uninitialized
* Using the array index operator on a pointer that was not allocated using `new[]`
* Referencing an array index that is outside the bounds used when allocating the array with `new[]`
* Invalid use of pointer arithmetic

Dereferee can also optionally pad the ends of allocated memory blocks with "safety bytes" that are checked upon deletion to determine if bad pointer usage has caused any buffer underflows/overflows.

By default, the Dereferee memory manager will output at the end of execution a block of summary test that includes the size and location of any leaked memory blocks, as well as statistics about the number of calls made to `new`/`delete` and the amounts of memory used during execution.

## Download 

The Dereferee toolkit can be downloaded [here](http://sourceforge.net/project/showfiles.php?group_id=142064&package_id=223268) from our [SourceForge Project](SourceForgeProject.html).

This ZIP file contains the Dereferee source code, makefiles to support building a link library on a variety of platforms, a small demo application, and a comprehensive set of unit tests to ensure the consistency of Dereferee's diagnostics.

## Requirements 

Dereferee requires a C++ compiler with a very high level of standards-compliance, due to significant use of features like partial template specializations. Dereferee is currently known to work under the following compilers and platforms:

* gcc 3.4 (Cygwin)
* gcc 4.0+ (Mac OS X, Linux)
* Microsoft Visual C++ 2005

Furthermore, to support determining the source file location of errors that occur at runtime, we require that it be possible to collect a backtrace at runtime and examine the symbol table of an executable. Pre-written modules have been written to support the following platforms:

* **gcc_macosx_platform**: gcc under Mac OS X
* **gcc_bfd_platform**: gcc under any platform that supports the BFD library and the `/proc` filesystem (Cygwin and various Linuxes)
* **msvc_win32_platform**: Microsoft Visual C++ 2005 under Windows

When building the Dereferee library, choose the appropriate platform for your platform. (See "BUILDING DEREFEREE" below.)

New platforms can be supported by writing a platform module that provides the appropriate lower-level functionality for that platform. New listeners can also be written to customize the manner by which Dereferee outputs its diagnostic messages.

## Contents 

This kit is structured in the following manner:

* `demo/` -- A small program used to demonstrate Dereferee
* `include/` -- Header files required for client code to use Dereferee
* `listeners/` -- A set of pre-written listener modules that interface with Dereferee
* `platforms/` -- A set of pre-written platform modules that interface with Dereferee
* `src/` -- The Dereferee library source code
* `tests/` -- A set of unit tests that can be used to verify Dereferee proper behavior on various platforms

## Building Dereferee 

You can use Dereferee either by including its source tree directly in the build process of your project, or separately compile it into a static library that can be linked into your project.

The Dereferee kit contains GNU makefiles for Cygwin, Mac OS X, and Unix platforms, and `nmake` makefiles for Visual C++. The makefile targets are as follows:

* `all`: build all of the following targets
* `listener`: compile a listener module into an object file, specified by the `LISTENER` variable
* `platform`: compile a platform module into an object file, specified by the `PLATFORM` variable
* `libs`: compile the Dereferee library source and link it into a static library. You can specify a `LISTENER` and `PLATFORM` variables on the command line to pre-link specific listener and platform modules into the library. If any of these variables are left undefined, then the GNU makefiles will omit the listener and/or platform from the library and you will need to link these later; the Visual C++ makefiles will include `msvc_win32_platform` and/or `msvc_debugger_listener` by default
* `tests`: compile the test suite and link it into a `run-tests` executable (do not use the `LISTENER` or `PLATFORM` variables here; the test runner provides its own)
* `demo`: compile the demo and link it into a `run-demo` executable (the `LISTENER` and `PLATFORM` variables apply here as well)

The value of the `LISTENER` variable described above is the name of the listener module object file, without a path or extension. The `PLATFORM` variable is likewise the name of a platform module object file, without a path or extension.

You can also use the `run-tests` and `run-demo` targets to automatically run the respective executable after it has been built.

For example, to build `libdereferee.a` on Mac OS X, you can run

~~~
    make libs PLATFORM=gcc_macosx_platform LISTENER=stdio_listener
~~~

This will generate `libdereferee.a` in the `Dereferee/build` directory. For Microsoft Visual C++, you can run

~~~
    nmake /F Makefile.mak libs PLATFORM=msvc_win32_platform LISTENER=msvc_debugger_listener
~~~

This will generate `Dereferee.lib` in the `Dereferee/build-msvc` directory. This library is compiled with the `[/ M Dd](/MDd.html)` option to use the multithreaded debug DLL version of the Visual C++ C runtime library.

## Usage 

To use Dereferee in your own code, you must first prepare your project:

1. Place the `Dereferee/include` directory in your project's include path.
1. Include `<dereferee.h>` in any source or header file that will declare or use checked pointers.
1. Link to the Dereferee static library (or include the source code for the library in your build process). Likewise, if you have not already linked a listener module object file into the static library itself, link to it as well.
1. Use `checked(T*)` in lieu of `T*` when declaring pointers to heap memory in your code. This applies to variables, function arguments, and structure or class fields. Pointers to memory not allocated on the heap (such as stack memory) should remain as `T*`; a runtime error will result if a checked pointer is assigned to memory that was not allocated on the heap.

**Note:** Since in C++, the declaration `const T*` means "a pointer to a const object of type T", the analogous Dereferee declaration is `checked(const T*)`, **not** `const checked(T*)`. The following table shows the correct translations:

||**Original declaration**||**Dereferee declaration**||
||`T*`||`checked(T*)`||
||`const T*`||`checked(const T*)`||
||`T* const`||`checked(T* const)`||
||`const T* const`||`checked(const T* const)`||

In other words, `checked` wraps the entire pointer type, including `const` modifiers.

The main design goal of the Dereferee toolkit is transparency; since this code was designed to be used by students who are just learning C++, it was highly desirable to make the functionality as unobtrusive as possible. Through C++ templates, operator overloading, and a minimal set of preprocessor macros, the Dereferee kit provides the `checked(T*)` syntax that can be used almost anywhere that a standard C++ heap pointer could be used. Only the declaration of the pointer need change; almost any other usage of the pointer (including calls to `new`/`delete`) will work as expected without modification.

## Known Issues 

* Dereferee only monitors pointers to memory allocated with the C++ `new` or `new[]` operator. An attempt to set a checked pointer to point to any other memory (such as stack space or otherwise dynamically allocated memory, for instance `malloc`) will cause Dereferee to log an error at runtime. This behavior is currently by design and is unlikely to change.
* There may still be one or two lingering issues with compilation ambiguities caused by the checked pointer template in more complex use cases. We have created what we believe to be a reasonably comprehensive suite of test cases to try to verify that all of the usual C++ constructs work with checked pointers substituted for raw pointers. However, it is possible that we have missed something. Any input from users with a great deal of expertise in esoteric C++ template constructs is always welcome.
