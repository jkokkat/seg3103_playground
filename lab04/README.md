Outline | Value
--------|-------
Course | SEG-3103
Date | June 10, 2021
Professor | Andrew Forward aforward@uottawa.ca
TA | Nazanin Bayati Chaleshtari nbaya076@uottawa.ca
Team | Jasmine Kokkat 300115249


# Prequisite Step
I compiled and ran the tic and fizzbuzz files prior to starting the lab. 
![image](https://user-images.githubusercontent.com/55165117/121583092-d4db9000-c9fd-11eb-8baf-5da7bb008867.png)

# Testing FizzBuzz in JAVA
I chose to work on the FizzBuzz project and implemented FizzBuzzTest.java

To compile it, I run 
```bash
 javac -encoding UTF-8 --source-path test -d dist -cp dist:lib/junit-platform-console-standalone-1.7.1.jar test/*.java
```
 
To run the tests, I use this command:
```bash
 java -jar lib/junit-platform-console-standalone-1.7.1.jar --class-path dist --scan-class-path
```

I implemented the fizzBuzz(int num) method with 5 commit groups since I worked individually. This method returns a string based on the number being passed in. For example, if 3 is passed, the string "Fizz" will be returned. If 15 is passed, "FizzBuzz" will be returned. Each commit group contains a failed test and a passed test. The groups of commits are shown in the images below. The method is quite simple in terms of its code, so it did not require extensive refactoring. Refactoring was done for both Tests 1 and 2 to pass, for Test 5 to pass with the previous tests, and Test 15 to pass with the previous tests.

# Commit Group 1
![image](https://user-images.githubusercontent.com/55165117/121585256-5d5b3000-ca00-11eb-8c76-1042cbda24c0.png)


# Commit Group 2
![image](https://user-images.githubusercontent.com/55165117/121585315-706e0000-ca00-11eb-8742-f93c4c285d41.png)


# Commit Group 3
![image](https://user-images.githubusercontent.com/55165117/121585367-8085df80-ca00-11eb-9587-e9ca7edbca52.png)

# Commit Group 4
![image](https://user-images.githubusercontent.com/55165117/121585420-8f6c9200-ca00-11eb-98c9-a7ee2106f88e.png)

# Commit Group 5
![image](https://user-images.githubusercontent.com/55165117/121585465-9e534480-ca00-11eb-8134-1497a6cd2c80.png)

