# seg3103_playground
# Lab 03

| Outline | Value |
| --- | --- |
| Course | SEG 3103 |
| Date | Summer 2021 |
| Professor | Andrew Forward, aforward@uottawa.ca |
| TA | Nazanin Bayati Chaleshtari, nbaya076@uottawa.ca |
| Team | Jasmine Kokkat 300115249<br> |


## Compilation and Running of Code


First I compiled and ran all code in both of the computation and date directory. 
To compile the application:
```bash
      javac -encoding UTF-8 --source-path src -d dist src/*.java
```

To compile the tests

```bash
javac -encoding UTF-8 --source-path test -d dist -cp lib/junit-platform-console-standalone-1.7.1.jar test/*.java src/*.java
```
To run the agent

```bash
java -javaagent:lib/jacocoagent.jar -jar lib/junit-platform-console-standalone-1.7.1.jar --class-path dist --scan-class-path
```
To generate a report
```bash
java -jar lib/jacococli.jar report jacoco.exec --classfiles dist --sourcefiles src --html report
```



To open the report
```bash
  ./report/index.html
```
### Initial Jacoco Reports

#### Computation
![image](https://user-images.githubusercontent.com/55165117/120685972-79922680-c46e-11eb-8d68-ac22169705fd.png)

![image](https://user-images.githubusercontent.com/55165117/120687411-fffb3800-c46f-11eb-952a-3cdbbcd1c209.png)

#### Date

![image](https://user-images.githubusercontent.com/55165117/120687751-50729580-c470-11eb-9231-428d3f181325.png)



