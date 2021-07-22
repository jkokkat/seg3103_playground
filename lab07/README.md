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

This is a screenshot of the fixed bug.

![image](https://user-images.githubusercontent.com/55165117/126614251-0430a4a5-8902-4654-a650-42d3855829c9.png)


### Bug 2: Certain swing methods needs to be invoked in Swing thread
Below is a screenshot of the first bug before making the changes:
![image](https://user-images.githubusercontent.com/55165117/126614648-6820cd45-8a33-4a4b-bc9c-cf5b07969920.png)

This is a screenshot of the fixed bug.
![image](https://user-images.githubusercontent.com/55165117/126616192-0d7d62f4-9c14-4985-abc2-9cd66e3bdd7a.png)

In the main method, the isVisible() Swing method is being called which could cause deadlocks or other threading issues since Java Swing components are not thread-safe in Java. The SwingUtilities.invokeLater() method delays the GUI creation task until the initial thread's tasks have been completed and will then ensure the GUI creation takes place inside the method for the thread.


### Bug 3: Could be refactored into a named static inner class
Below is a screenshot of the first bug before making the changes:
![image](https://user-images.githubusercontent.com/55165117/126669963-d0cbd46d-e384-4d28-bd9e-353793eb9313.png)

To fix the code, I would create a WindowAdapter class within the CalCFrame class and in the CalCFrame method would call WindowAdapter.WindowClosing(WindowEvent e), passing in a WindowEvent as as argument, instead of creating a new WindowAdapter.
### Bug 4: Private method is never called
Below is a screenshot of the first bug before making the changes:
![image](https://user-images.githubusercontent.com/55165117/126683519-ca44c8eb-c380-446f-a9e2-790df1530c42.png)

This is a screenshot of the fixed bug.
![image](https://user-images.githubusercontent.com/55165117/126683764-e3e74db3-2d9e-4c96-981e-84d6e90ec815.png)

### Bugs 5 and 6: Boxing/unboxing to parse a primitive
Below is a screenshot of the bugs before making the changes:
![image](https://user-images.githubusercontent.com/55165117/126682872-8acb0a62-791a-4b3c-ab80-eec92a26e5db.png)

![image](https://user-images.githubusercontent.com/55165117/126686888-feb87621-37d5-43a8-8154-8384a659b34e.png)

This is a screenshot of the fixed bugs.
![image](https://user-images.githubusercontent.com/55165117/126688224-c52a5b65-5d6f-4b69-b9cb-4ac402802fce.png)

![image](https://user-images.githubusercontent.com/55165117/126688418-dca7f8f2-9378-4672-90c0-e8f8117108af.png)

### Bugs 7-12: Unread field: should this field be static?:
Below is a screenshot of the first bug before making the changes:
![image](https://user-images.githubusercontent.com/55165117/126689158-0a2082d8-ee63-484f-b93f-dfeca18c69bd.png)

This is a screenshot of the fixed bug.
![image](https://user-images.githubusercontent.com/55165117/126689664-9432140e-7e67-4832-8bd7-6142956d1fa5.png)

### Bug 13 Method uses the same code for two branches:
Below is a screenshot of the first bug before making the changes:
![image](https://user-images.githubusercontent.com/55165117/126689900-73980e47-d104-4fe8-8d4e-5b219da09d48.png)

These are screenshots of the fixed bug.
![image](https://user-images.githubusercontent.com/55165117/126690205-8b693b40-e1de-4235-93a8-8e2d19ae1e7a.png)


### Bug 14: Switch statement found where default case is missing
Below is a screenshot of the first bug before making the changes:

This is a screenshot of the fixed bug.
### Bugs 15-18: Condition has no effect
Below is a screenshot of the first bug before making the changes:
![image](https://user-images.githubusercontent.com/55165117/126692766-e676e2ed-e584-4ef8-b7c5-2cc8d1f65cf4.png)

These are screenshots of the fixed bugs.
![image](https://user-images.githubusercontent.com/55165117/126692473-6500a57f-40f9-4877-a19f-4a1b19456edd.png)

![image](https://user-images.githubusercontent.com/55165117/126693125-1c9544cb-8123-405e-a8b7-4e914fb956d5.png)


```
@
```


