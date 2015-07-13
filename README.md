# CommandLineRunner
Example Spring Boot project to demonstrate the command line runner

This is just a very simple example on how to use properties in Spring,
how to inject them into your instance variables and then how to overrride
them using different mechanisms.

For example, the name property is defaulted in the application.properties
file that is picked up by default by Spring.

You can then override this by providing another application.properties file 
in the same folder as your jar file and launching the app using 

java -jar commandlinedemo-0.0.1-SNAPSHOT.jar

and finally, you can add the property to the command line using --propertyname 

e.g.
java -jar commandlinedemo-0.0.1-SNAPSHOT.jar --name="Command Line Property"
