runshotra stands for Running Shoes Tracker.


This quick guide will take you through creating a "Welcome Runner!" RESTful web service with Spring Boot:

$ curl http://localhost:8090/user

The response is the following JSON:

{
 "id":1,
 "message":"Welcome, Runner!"
}



To start your service, run this command:

$ ./gradlew clean build && java -jar build/libs/runshotra-0.1.0.jar



