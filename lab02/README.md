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


![image](https://user-images.githubusercontent.com/55165117/119879921-bbb0ea80-bef9-11eb-94a4-b288086f4746.png)


![image](https://user-images.githubusercontent.com/55165117/119879951-c4092580-bef9-11eb-83a5-9e71260d8de1.png)

Test 2 and Result

![image](https://user-images.githubusercontent.com/55165117/119880241-0af71b00-befa-11eb-8e93-01b04bfeaaaa.png)


![image](https://user-images.githubusercontent.com/55165117/119880270-12b6bf80-befa-11eb-8ca5-41c0e7318b69.png)


Test 3 and Result

![image](https://user-images.githubusercontent.com/55165117/119880470-498cd580-befa-11eb-9c84-bd1c707a5eef.png)



![image](https://user-images.githubusercontent.com/55165117/119880501-50b3e380-befa-11eb-81b6-eb86b2c38387.png)


Test 4 and Result

![image](https://user-images.githubusercontent.com/55165117/119880562-5f9a9600-befa-11eb-918e-aeff4ffb0342.png)



![image](https://user-images.githubusercontent.com/55165117/119880589-66c1a400-befa-11eb-8a77-7a939bc81bef.png)


Test 5 and Result

![image](https://user-images.githubusercontent.com/55165117/119880693-8062eb80-befa-11eb-8dff-76c245a2cd21.png)


![image](https://user-images.githubusercontent.com/55165117/119880753-8f499e00-befa-11eb-8c06-21b3b437680c.png)


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


Explicit tests: 
For this section, I implemented all the test cases (given in the tutorial) as explicit JUnit tests in the DateTest.java file.

Compilation of tests:
![image](https://user-images.githubusercontent.com/55165117/119877348-ec435500-bef6-11eb-8367-b0aeb725206b.png)

Parameterized tests:
I then wrote tests for the DateNextDateOkTest test suite and DateNextDateExceptionTest test suite.
![image](https://user-images.githubusercontent.com/55165117/119878444-1d705500-bef8-11eb-9c2f-673a1c180720.png)


Running the tests:
![image](https://user-images.githubusercontent.com/55165117/119878050-b652a080-bef7-11eb-8370-c6bfd85126db.png)
![image](https://user-images.githubusercontent.com/55165117/119877917-96bb7800-bef7-11eb-93d7-f8095d84347d.png)

The results of all the test cases: 
![image](https://user-images.githubusercontent.com/55165117/119878686-6f18df80-bef8-11eb-9f7b-1d78652c5142.png)

