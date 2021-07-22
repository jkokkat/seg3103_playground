# seg3103_playground
## Lab 07

Outline | Value
--------|-------
Course | SEG3103
Date | July 22, 2021
Professor | Andrew Forward aforward@uottawa.ca
TA | Henry Chen, zchen229@uottawa.ca
Team | Jasmine Kokkat 300115249


## Static Analysis with SpotBugs
Before I started the lab, I compiled the java files using the commands `javac -encoding UTF-8 --source-path src -d dist src/*.java.` and `javac -encoding UTF-8 --source-path test -d dist -cp dist:lib/junit-platform-console-standalone-1.7.1.jar test/*.java`. I ran the application with the command `java -cp ./dist Main`
and `java -jar ./lib/spotbugs/lib/spotbugs.jar`.

These commands being run are shown in the image below.
![image](https://user-images.githubusercontent.com/55165117/126611567-f997977f-213b-4dd4-b295-15342af60224.png)

The image below shows when the application is running:
![image](https://user-images.githubusercontent.com/55165117/126612026-c60a8746-d85e-492f-9fb8-75c47c0dfe41.png)

The screenshot below shows SpotBugs with a total of 18 tests:
![image](https://user-images.githubusercontent.com/55165117/126612312-2e653cec-17c1-42d7-afd4-46195580c933.png)


### Bug 1: Comparison of String parameter using == or !=

Below is a screenshot of the first bug before making the changes:
![image](https://user-images.githubusercontent.com/55165117/126612312-2e653cec-17c1-42d7-afd4-46195580c933.png)
```
@
```


