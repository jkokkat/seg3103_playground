# seg3103_playground
## Lab 05

Outline | Value
--------|-------
Course | SEG3103
Date | July 2, 2021
Professor | Andrew Forward aforward@uottawa.ca
TA | Henry Chen zchen229@uottawa.ca
Team | Jasmine Kokkat 300115249


### Part 1: Stubs
I compiled and ran the grade and twitter files prior to starting the lab. I then stubbed the three methods in Grades.Calculator ( percentage_grade, letter_grade, and numeric_grade) as shown below.
![image](https://user-images.githubusercontent.com/55165117/124314690-c84fe080-db40-11eb-8bab-0ddad225900e.png)

The image below shows the stubbed code working for the web application.
![image](https://user-images.githubusercontent.com/55165117/124314802-efa6ad80-db40-11eb-890e-26bf99002ff9.png)


After replacing the stubbed code with the Assignment 2 implementation, this error in the screenshot below was seen when attempting to run the application. There is an arithmetic error when I input grades into the application because the numbers are strings instead of integers, which causes an error when being passed into the methods of Grades.Calculator which calculates the final grade using only integers.
![image](https://user-images.githubusercontent.com/55165117/124315166-8a9f8780-db41-11eb-9780-1a5f82cc1eec.png)

### Part 2: Mocks

For this section, I implemented four missing test cases in the TwitterTest.java file. 
These are the intial results when running the tests:
![image](https://user-images.githubusercontent.com/55165117/124315909-bb33f100-db42-11eb-8b9f-16357ef78675.png)

By looking at the code of the isMentionned method in Twitter.java, it is evident why the two tests failed. I modified the code as shown in the image below of isMentionned to handle when the tweet is null, and when finding a matching substring in the tweet should not return true. The actual_call is not dynamic so it will sometimes pass and sometimes fail, since it not designed like the mocks.


```
public boolean isMentionned(String name) {
    String tweet = loadTweet();
    if (tweet==null){
      return false;
    }
    int indexOne = tweet.indexOf("@");
    int indexTwo = tweet.indexOf(" ",indexOne);
    if (indexTwo==-1){
      tweet = tweet.substring(indexOne);
    }else{
      tweet = tweet.substring(indexOne,indexTwo);
    }
    return tweet.equals("@" + name); 
  }
```

The following image shows the results of the test cases after making modifications to the isMentionned method, with all the tests passing successfully.
![image](https://user-images.githubusercontent.com/55165117/124316511-af94fa00-db43-11eb-8c11-dac5bbc20a1c.png)
