SET SUITE=

REM Remove results dir if present
IF NOT EXIST %RESULTS% GOTO NORESULTS
RMDIR /S /Q %RESULTS%

:NORESULTS
md %RESULTS%

java -jar C:\rcp-tt\rcptt.runner-2.5.1\eclipse\plugins\org.eclipse.equinox.launcher_1.5.700.v20200207-2156.jar ^
 -autVMArgs -Xmx4096m;-XX:MaxHeapSize=512m ^
 -data %RUNNER_WORKSPACE% ^
 -aut %AUT% ^
 -autWsPrefix %SAMPLE_PROJECT%^
 -autConsolePrefix %RESULTS%/aut-output ^
 -htmlReport %RESULTS%/report.html ^
 -junitReport %RESULTS%/report.xml ^
 -import %PROJECT% ^
 -suites %SUITE% ^
 -reuseExistingWorkspace
