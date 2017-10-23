@echo off

set JAVA_HOME=C:\Program Files\Java\jdk1.8.0_121
set M2_HOME=C:\Program Files\Apache Software Foundation\apache-maven-3.3.9
set PATH=%JAVA_HOME%\bin;%M2_HOME%\bin;%PATH%

call mvn.cmd %*