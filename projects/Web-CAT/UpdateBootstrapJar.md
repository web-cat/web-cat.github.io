---
title: Update Bootstrap Jar
---
## Problem 

A new version of Web-CAT's Bootstrap.jar file has been released, and you want to update
your local server to use the latest version.

## Solution 

Download the latest version of the jar from here:

http://web-cat.cs.vt.edu/updates/Bootstrap.jar

Stop your local Web-CAT server so you can modify its local files.  Use the appropriate steps for your
servlet container (Tomcat, JBOSS, etc.) to stop the instance.

Copy the new Bootstrap.jar file into your local Web-CAT distribution.  You need to locate the unpacked files
from the Web-CAT.war distribution, which will be found where ever your servlet container places such files.
You need to copy the new Bootstrap.jar file into the _<servlet-deployment-dir>_`[/ Web](/Web.html)-CAT/WEB-INF/lib`
directory, overwriting the older version that is already there.

Now restart Web-CAT.

## Discussion 

The Bootstrap.jar file provides the core automatic update features for Web-CAT.  When Web-CAT first starts
up, only code from this jar is needed.  The Bootstrap loader checks all Web-CAT subsystems for updates,
downloads any new versions, and installs them.  Finally, it dynamically generates the full classpath used by
the application, creates a new classloader with this classpath, and starts up the application proper.

Unfortunately, the Bootstrap.jar cannot update itself, due to the limitations of various JVMs, even those
that support some forms of hot code swapping, and also due to the limitations of differing servlet
containers on varying OSes, where files opened for classpath loading may be locked against writing.

As a result, when a new version of the Bootstrap.jar file is available, it must be updated manually.
Fortunately, such updates are relatively rare.  Also, the latest version of the [Core Subsystem](CoreSubsystem.html)
allows Web-CAT to detect when a newer version of the Bootstrap.jar is available.  If a newer
version is detected, although it cannot be automatically installed, Web-CAT will still e-mail the
server administrator a request to manually update the jar (with a link to these instructions).

### A Tomcat Example 

The location where the Bootstrap.jar file needs to be placed depends on the servlet container
you are using for deployment.  As a concrete example, suppose you are using
[Apache Tomcat](http://tomcat.apache.org).  Tomcat stores all of its deployed web applications
as subdirectories under _<tomcat-home>_`/webapps`.  Thus, you should download the
Bootstrap.jar file and place it in this location, overwriting the existing file:

```
<nowiki><tomcat-home>/webapps/Web-CAT/WEB-INF/lib/Bootstrap.jar</nowiki>
```

## Comments 

This page is editable on github. To make corrections or improve these
pages, login to github and use the edit icon/link at the end of the
page title for this page.
