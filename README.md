

This quick guide will take you through creating a "Hello Attacker" RESTful web service with Spring Boot:

$ curl http://localhost:8090/user

The response is the following JSON:

{
 "id":1,
 "message":"Hello, Attacker!"
}


To start your service, run this command:

$ ./gradlew clean build && java -jar build/libs/gameover-0.1.0.jar



