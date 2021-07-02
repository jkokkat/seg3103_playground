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

The image below shows the stubbed code working for the web application.

After replacing the stubbed code with the Assignment 2 implementation, this error in the screenshot below was seen when attempting to run the application. There is an arithmetic error when I input grades into the application because the numbers are strings instead of integers, which causes an error when being passed into the methods of Grades.Calculator which calculates the final grade using only integers.

### Part 2: Mocks

For this section, I implemented four missing test cases in the TwitterTest.java file. 
These are the results when running the tests:
