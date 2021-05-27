# Lab 02

| Outline | Value |
| --- | --- |
| Course | SEG 3103 |
| Date | Summer 2021 |
| Professor | Andrew Forward, aforward@uottawa.ca |
| TA | Henry Chen, zchen229@uottawa.ca |
| Team |Jasmine Kokkat 300115249<br>|


The first step was to make sure the code compiles and runs without any errors.

To compile the application, I used the command
```bash
javac -encoding UTF-8 --source-path src -d dist src/*.java
```
To compile the tests, I used the command
```bash
javac -encoding UTF-8 --source-path test -d dist -cp lib/junit-platform-console-standalone-1.7.1.jar test/*.java src/*.java
``` 

To run the application, I used the command
```bash
java --add-opens java.base/java.lang=ALL-UNNAMED -jar  user-registration-app-0.1.0.jar
```
To run the tests, I used the command
```bash
java -jar lib/junit-platform-console-standalone-1.7.1.jar --class-path dist --scan-class-path
```


Here is the view when running the application.
![image](https://user-images.githubusercontent.com/55165117/119868541-2871b800-beed-11eb-9acd-892fc2301910.png)

Here is the view through the link http://localhost:8080/.
![image](https://user-images.githubusercontent.com/55165117/119871175-3117bd80-bef0-11eb-837c-4f2be346dee3.png)

Below there is a screenshot of the initial running tests.
![image](https://user-images.githubusercontent.com/55165117/119871524-82c04800-bef0-11eb-8d37-8685e98266ec.png)

# Exercise 1

In this section, I used the test cases provided in the tutorial and manually ran the tests on the application. The results
are noted in the table below.

Test Case |  Expected Results             | Actual Results                   | Verdict(Pass, Fail, Inconclusive)
----------|-------------------------------|----------------------------------|----------------------------------
1         | registration request accepted | registration request accepted    | Pass
2         | registration request accepted | registration request accepted    | Pass
3         | registration request accepted | registration request accepted    | Pass
4         | registration request accepted | registration request accepted    | Pass
5         | Err1                          | Err1 and Err3                    | Fail
6         | Err3                          | Err1 and Err3  and Err6          | Fail
7         | Err3                          | Err3                             | Pass
8         | Err1                          | Err1                             | Pass

Test 1 and Result

Test 2 and Result


Test 3 and Result


Test 4 and Result


Test 5 and Result


Test 6 and Result



Test 7 and Result


Test 8 and Result




Note: I used the error message table below as provided in the tutorial.
![image](https://user-images.githubusercontent.com/55165117/119874518-b05ac080-bef3-11eb-820c-014c2311ebfe.png)

# Exercise 2

For the tests, I used Junit 5. This is the command I used for compiling the tests:

    javac -encoding UTF-8 --source-path test -d dist -cp lib/junit-platform-console-standalone-1.7.1.jar test/*.java src/*.java

This is the command used for running the tests:

    java -jar lib/junit-platform-console-standalone-1.7.1.jar --class-path dist --scan-class-path           

For this section, I implemented all the test cases (given in the tutorial) as explicit JUnit tests in the DateTest.java file.

Explicit tests:
Compilation of tests:
