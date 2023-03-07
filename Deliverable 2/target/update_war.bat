@echo off

set source=BinaryCalculatorWebapp.war
set destination="C:\Program Files\Apache Software Foundation\Tomcat 9.0\webapps\BinaryCalculatorWebapp.war"

echo Copying %source% to %destination%...

xcopy /y %source% %destination%

echo Done!
pause
