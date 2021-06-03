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

      javac -encoding UTF-8 --source-path src -d dist src/*.java
To compile the tests

javac -encoding UTF-8 --source-path test -d dist -cp lib/junit-platform-console-standalone-1.7.1.jar test/*.java src/*.java
To run the agent

java -javaagent:lib/jacocoagent.jar -jar lib/junit-platform-console-standalone-1.7.1.jar --class-path dist --scan-class-path
