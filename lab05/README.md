# seg3103_playground
## Lab 05

Outline | Value
--------|-------
Course | SEG3103
Date | July 2, 2021
Professor | Andrew Forward aforward@uottawa.ca
TA | Henry Chen
Team | Jasmine Kokkat 300115249


### Part 1: Stubs
I compiled and ran the grade and twitter files prior to starting the lab. I then stubbed the three methods in Grades.Calculator ( percentage_grade, letter_grade, and numeric_grade) as shown below.
![image](https://user-images.githubusercontent.com/55165117/124314690-c84fe080-db40-11eb-8bab-0ddad225900e.png)

The image below shows the stubbed code working for the web application.
![image](https://user-images.githubusercontent.com/55165117/124314802-efa6ad80-db40-11eb-890e-26bf99002ff9.png)


After replacing the stubbed code with the Assignment 2 implementation, this error in the screenshot below was seen when attempting to run the application. There is an arithmetic error when I input grades into the application because the numbers are strings instead of integers, which causes an error when being passed into the methods of Grades.Calculator which calculates the final grade using only integers.
![image](https://user-images.githubusercontent.com/55165117/124314883-0d741280-db41-11eb-8642-855a971306a4.png)

### Part 2: Mocks

For this section, I implemented four missing test cases in the TwitterTest.java file. 
These are the intial results when running the tests:
![image](https://user-images.githubusercontent.com/55165117/124314950-30062b80-db41-11eb-8ae3-5e1fe17127e2.png)
