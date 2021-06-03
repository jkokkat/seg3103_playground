# seg3103_playground
# Lab 03

| Outline | Value |
| --- | --- |
| Course | SEG 3103 |
| Date | Summer 2021 |
| Professor | Andrew Forward, aforward@uottawa.ca |
| TA | Nazanin Bayati Chaleshtari, nbaya076@uottawa.ca |
| Team | Jasmine Kokkat 300115249<br> |

## Exercise 1
Derive a test suite for 100% X coverage for class Date: statement coverage, branch coverage, condition coverage, and condition/branch coverage.

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

![image](https://user-images.githubusercontent.com/55165117/120688465-16ee5a00-c471-11eb-9840-4d332e8921ed.png)

![image](https://user-images.githubusercontent.com/55165117/120688589-38e7dc80-c471-11eb-93e8-f9ae434bfe0b.png)


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

##### After Further Coverage Testing

![image](https://user-images.githubusercontent.com/55165117/120692690-1d330500-c476-11eb-8d41-e25a0f5130e4.png)

I achieved 100% coverage for the method isThirtyDayMonth() because it did not include September for a test case, which is a thirty day month. I added the following test case:
```bash
@Test
void nextDate_9month() {
      Date today = new Date(1901, 9, 1);
      Date expectedDayAfter = new Date(1901, 9, 2);
      assertEquals(expectedDayAfter, today.nextDate());
}
```
I also achieved 100% coverage for the method isLeapYear(). The initial test suite did not have a test where the year was a century year divisible by 400. So, we added the following test case, where the year is 2000 (which is a century year divisible by 400):
```bash
 @Test 
  void nextDate_leapYear(){
      Date today = new Date(2000, 1, 1);
      Date expectedDayAfter = new Date(2000, 1, 2);
      assertEquals(expectedDayAfter, today.nextDate());
  }
  ```
Then, I improved the coverage for the method isEndOfMonth(). The initial test suite did not include a test where the year is not a leap year, the month is February (2), and the day is the 28th. As well, it did not include a test where the year is a leap year, the month is February (2), and the day is the 28th. I added these tests, as shown below:
```bash
@Test
void nextDate_endOfMonth(){
    Date today = new Date(2021, 2, 28);
    Date expectedTomorrow = new Date(2021, 3, 1);
    assertEquals(expectedTomorrow, today.nextDate());
}

@Test
void nextDate_endOfMonth2(){
    Date today = new Date(2020, 2, 28);
    Date expectedTomorrow = new Date(2020, 2, 29);
    assertEquals(expectedTomorrow, today.nextDate());
}
```
However, it is not possible to obtain 100% coverage because it is impossible for the month of February to have 29 days if it is not a leap year, so the branch with this condition cannot be covered.

Furthermore, I achieved 100% coverage for the equals(Object) method. The initial test suite did not include tests where a date was compared to an object. The equals() method should return False in this case. I also added tests to compare dates where the year, month, and day vary between the two dates. These tests are shown below:
```bash
 @Test
  void nextDate_equals(){
      Object obj = new Object();
      Date date = new Date(2021,5,27);
      assertFalse(date.equals(obj));
  }

  @Test
  void nextDate_equals2(){
      Date date = new Date(2021,5,27);
      Date date2 = new Date(2020,4,26);
      assertFalse(date.equals(date2));
  }

  @Test
  void nextDate_equals3(){
      Date date = new Date(2021,5,27);
      Date date2 = new Date(2021,4,26);
      assertFalse(date.equals(date2));
  }

  @Test
  void nextDate_equals4(){
      Date date = new Date(2021,4,26);
      Date date2 = new Date(2021,4,25);
      assertFalse(date.equals(date2));
  }
```
Next, I achieved full coverage for the toString() method by adding these tests:

```bash
 @Test
  void nextDate_toString(){
      Date date = new Date(2021,7,27);
      assertEquals("2021/July/27",date.toString());
  }
```
Lastly, I achieved full coverage for the setDay(int) method by adding the following tests where the day is greater than 31, the day is greater than 30 for a 30-day month, and where the day is greater than 29 in February in a leap year.

```bash
@Test
 @Test
  void nextDate_invalid_setDay() {
    assertThrows(
      IllegalArgumentException.class,
      () -> new Date(1975, 8, 33)
    );
  }

  @Test
  void nextDate_invalid_setDay2() {
    assertThrows(
      IllegalArgumentException.class,
      () -> new Date(2010, 4, 31)
    );
  }
   @Test
  void nextDate_invalid_setDay3() {
    assertThrows(
      IllegalArgumentException.class,
      () -> new Date(2020, 2, 30)
    );
  }
```
I am not able to achieve 100% coverage for Date.java because in the setMonth() method, the month cannot be less than 1 and greater than 12 at the same time. This is why only 3 out of 4 branches (75%) can be covered by the provided test cases.

## Exercise 2
Refactoring 


