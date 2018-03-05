cd D:\SeleniumKothrud\TestNGBatchExecution
set ProjectPath=D:\SeleniumKothrud\TestNGBatchExecution
echo %ProjectPath%
set classpath=%ProjectPath%\bin;%ProjectPath%\lib\*
echo %classpath%
java org.testng.TestNG %ProjectPath%\testng.xml