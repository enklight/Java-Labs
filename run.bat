@echo off
chcp 65001 >nul
javac -encoding UTF-8 -sourcepath src -d out src\Main.java
if errorlevel 1 (
    echo Compile error!
    pause
    exit /b 1
)
java -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -cp out Main
pause
