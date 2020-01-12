---
title: System Requirements
---
## Problem 

You are thinking about installing your own copy of Web-CAT, but do not know what other software
you must have installed to get it to run.

## Solution 

Web-CAT runs as a servlet in an appropriate servlet container, and it also is built on top of a few other software packages.  Here is the complete list of requirements for what you have to have available on your server before installing Web-CAT:

1. **Java 1.5.x or newer** for running Web-CAT.  We recommend using Sun's JDK.  Many linux users have reported that Web-CAT will **not run using gcj** (see [Switch To Sun Jdk](SwitchToSunJdk.html)).
1. **A servlet container** for hosting servlet-based web applications.  We use [Apache Tomcat](http://tomcat.apache.org/) at Virginia Tech, but [JBOSS](http://www.jboss.org/), [BEA WebLogic](http://www.bea.com/framework.jsp?CNT=index.htm&FP=/content/products/weblogic), [WebSphere](http://www.ibm.com/websphere), or another appropriate J2EE application server platform should also work.
1. **[MySQL](http://www.mysql.com/)** for database support.  Web-CAT's architecture allows other JDBC-compatible databases to be used for the underlying relational database layer, but we don't have drivers for them included in our basic distribution.  If you want to adapt Web-CAT for another RDBMS, please contact our development team via our [SourceForge Project](SourceForgeProject.html)--we'd love the help!
1. **A recent Perl distribution** for supporting instructor-provided grading plug-ins written in Perl.  Plug-ins can be written in virtually any language supported on your server, but most of the pre-provided plug-ins are written in Perl.
  1. Be sure you have the HTML::Parser module installed with your Perl distribution.
  1. Be sure you have the XML::Parser module installed with your Perl distribution.

## Discussion 

We recommend that institutions dedicate a specific server for running
Web-CAT, since grading student work does necessarily involve running
student-provided code on a server.  Although student code is appropriately
sandboxed, using a separate server for Web-CAT will minimize any potential
risks to other server-side applications you may also be running.

If you are planning to deploy Web-CAT on an existing web server at your institution, chances are good that you've already got an appropriate servlet container or application server running, and also probably have a recent version of Perl installed.  You might even have a [My SQL](MySQL.html) server available (it needn't be on the same machine that Web-CAT will be on, as long as your admin can create an appropriate account with the right permissions to allow non-local access).

However, if you are starting from scratch, be aware that there are a number of tools available to help you set up your server for applications like this.  If you are planning to deploy Web-CAT on a Windows XP (or 2000) server, you might want to look at http://www.devside.net/.  Their Web-Developer Server Suite is a preconfigured bundle that includes Apache, Tomcat, [My SQL](MySQL.html), and Perl.  It also includes PHP, optional SSL support, and a number of other features.  It is a great way to get an appropriate server environment up and running quickly.  There are several other distributions like this available.  Generically, they are often called WAMP (for Windows Apache + [My SQL](MySQL.html) + Perl distributions) or WAMPP (with PHP, too) distributions, and you can find many alternatives by googling this term.

If you are setting up your own server from scratch on a different OS, similar bundles may also be available.  Search the web for LAMP (the Linux equivalent) or XAMP (the OS X equivalent).

**Note: A separate [Web Objects](WebObjects.html) deployment license is no longer required to run Web-CAT**.  Older versions of Web-CAT required you to have a [Web Objects](WebObjects.html) deployment license in order to install and run the servlet.  Due to [changes in Apple's licensing terms for WebObjects](http://www.darcynorman.net/2005/11/10/webobjects-officially-cross-platform-again), the Web-CAT WAR distribution now includes a no-cost deployment license, allowing it to be installed for free on any platform.

### Installing Perl Modules 

Make sure your Perl installation includes both HTML::Parser and XML::Parser already.  Read this entry in the CPAN FAQ if you want to find out what Perl modules you currently have installed: [How do I find out what modules are already installed on my system?](http://www.cpan.org/misc/cpan-faq.html#How_installed_modules).

If you need to install these modules and you are using a linux flavor that supports rpms, you can use your package manager to install them directly.  The two rpms to install are **perl-HTML-parser** and **perl-XML-parser**.  Debian users can use apt-get.  If you are using the ![Active State](ActiveState.html) Perl distribution on Windows, you can use the included Perl Package Manager (ppm) to install these modules.  Otherwise, read this CPAN FAQ entry: [How do I install Perl modules?](http://www.cpan.org/misc/cpan-faq.html#How_install_Perl_modules).

## See Also 

[Install Web Cat](InstallWebCat.html) <br/>
[Installation Walkthrough](InstallationWalkthrough.html)

## Comments 

This page is editable on github. To make corrections or improve these
pages, login to github and use the edit icon/link at the end of the
page title for this page.
