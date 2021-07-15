# seg3103_playground
## Lab 06

Outline | Value
--------|-------
Course | SEG3103
Date | July 15, 2021
Professor | Andrew Forward aforward@uottawa.ca
TA | Zahra Kakavand, zkaka044@uottawa.ca
Team | Jasmine Kokkat 300115249


### Part 1: Prequisites
Before I started the lab, I installed Maven successfully as shown in the image below when using the command `mvn --version`. 
![image](https://user-images.githubusercontent.com/55165117/125734370-69770d9b-9424-4e7e-babf-1dd5ffd076ef.png)


### Part 2: Initial Compilations and Testing
After extracting the zip file for BookstoreApp, I ran `mvn compile` as shown in the image below. 
![image](https://user-images.githubusercontent.com/55165117/125734546-a73c33cd-05ba-435f-80c6-b3a660d193f6.png)


I then ran `mvn package -DskipTests` which compiled all the tests without running them as shown in the following iamge. 
![image](https://user-images.githubusercontent.com/55165117/125735091-ec5938ce-c9af-4a03-958b-227098ae42d8.png)


Next, I ran `java -jar ./target/BookstoreApp-0.1.0.jar`.
The terminal when running this command is shown below.
![image](https://user-images.githubusercontent.com/55165117/125735166-bb73a9c5-da9b-4038-b401-fbe2a231fd21.png)


The application running is shown in the following image.
![image](https://user-images.githubusercontent.com/55165117/125735271-21c8e8b0-8eaa-4cb4-9819-3c9ac1f37eeb.png)

I ran the initial three tests as seen in the following screenshot here using the command `mvn test`.
![image](https://user-images.githubusercontent.com/55165117/125735865-5189c41d-5625-47c2-a2ce-df2da22944f9.png)





