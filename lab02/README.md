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
