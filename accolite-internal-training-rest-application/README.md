# To execute follow the instruction:

1. Goto target directory (exist within the zip file)
2. execute the command: java -jar  accolite-internal-training-rest-application-0.0.1-SNAPSHOT.jar

3. Open the browser/postman
4. Open the URL: localhost:8080/

you will see the help message which will show the service available.

Ex: output of localhost:8080/

[ {
  "requestMapping" : "/youtube/getAll",
  "message" : "fetch all the records from DB and returns"
}, {
  "requestMapping" : "/youtube/get/{numberOfRecords}",
  "message" : "Returns X records from DB, where X is numberOfRecords"
}, {
  "requestMapping" : "/youtube/get/id/{number}",
  "message" : "Returns the record by id = number"
}, {
  "requestMapping" : "/youtube/get/count",
  "message" : "Returns the count of records present in DB"
} ]

Hence, to see the total records available:

Open the URL: http://localhost:8080/youtube/get/count
Response:
{
  "recordsCount" : 206818
}

Note: You can open the H2 console by going to URL (after the jar is executed)
URL: http://localhost:8080/console

Set following:

Driver Class: org.h2.Driver
JDBC URL: jdbc:h2:mem:testdb
Username: sa
Password: <Leave Blank>
