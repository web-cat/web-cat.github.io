---
title: Install Web Cat
---
## Problem 

You want to install Web-CAT on your own server.

## Solution 

Be sure you understand the [System Requirements](SystemRequirements.html) and that your server has the appropriate software installed.

Download the latest version of the Web-CAT servlet (distributed as a single WAR file) from our
[SourceForge download page](http://sourceforge.net/project/showfiles.php?group_id=142064).

Rename the downloaded WAR file to **Web-CAT.war** before you install it.  For example, rename it from
`Web-CAT_1.2.2.war` to `Web-CAT.war`.

Follow your servlet container's installation instructions for deploying a new web application.  If you are using Tomcat, we
strongly recommend that you **do not** just copy the WAR file into your webapps directory while Tomcat is running live (or use any similar deployment strategy on other application servers).  The reason why is that Web-CAT's war is pretty big--over 30 Mb.  Often, Tomcat will start to deploy the application before the file has been completely copied to the webapps directory, which will give you a partial (broken) installation.  Instead, use Tomcat's Deployer, or shut down Tomcat, copy the WAR file into Tomcat's webapps directory, and then restart Tomcat.  For other web application servers, consult your application server's documentation for WAR installation instructions.

Identify your connection URL, which will differ depending on how your server is set up and which servlet container you are using.  For Tomcat, your connection URL might be something like this:

    http://myhost.mydomain:8080/Web-CAT

When you first hit this URL, it will automatically forward you to Web-CAT's front page, which should be at an address similar to this one:

    http://myhost.mydomain:8080/Web-CAT/WebObjects/Web-CAT

Note that there may be a substantial delay (up to several minutes) before this page appears while Web-CAT downloads and self-installs any available updates.  This is a normal part of Web-CAT's startup process, and will occur each time Web-CAT starts.  The delay is typically much smaller after installation is complete, but there may be a large number of updates available
for a brand new installation.  Be patient, and the first page of the installation wizard will eventually appear.

From there, follow the instructions in the [Installation Walkthrough](InstallationWalkthrough.html) movie (29Mb, 7min).

## Discussion 

If you already know something about managing web applications, you might be interested in further configuring the way Web-CAT is deployed.  You might consider using [mod_jk](http://tomcat.apache.org/connectors-doc/) to route application requests through your existing web server, if you also have Apache installed.  You might also consider using SSL to protect student connections, either directly through Tomcat or indirectly through Apache if you are using mod_jk.  You might even wish to offload the work of serving images and other static resources from your web application server and let another web server perform that work.

If you are interested in more information on any of these topics, please [ask our development team](mailto:edwards@cs.vt.edu).

## See Also 

## This section lists other related recipes (delete this section if there aren't any related recipes)

## Comments 

This page is editable on github. To make corrections or improve these
pages, login to github and use the edit icon/link at the end of the
page title for this page.
