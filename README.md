# Java-SpringBoot-Angular-UserCreationApp

Instruction:
Executing the file
1. Open the command line terminal and point it to the directory: Java-SpringBoot-Angular-UserCreationApp\UserCreationApp\target
2. Enter this command to run the jar file:      java -jar ./UserCreationApp-0.0.1-SNAPSHOT.jar
3. It takes a few seconds to load the file.
4. Type the url http://localhost:8080/ or http://localhost:8080/users into a web browser to visit the homepage.

Database access
1. Type the url http://localhost:8080/h2-console to access the H2 database.
2. To log in, enter the following credentials:
   Driver Class: org.h2.Driver
   JDBC URL: jdbc:h2:mem:jdbcdb
   User Name: sa
   (Leave the password field empty)
3. Press the "Connect" button.
4. Execute the SQL statement "SELECT * FROM USERS" to see the data in the Users table.
5. Please note that two entries are loaded to the table after starting the application for demonstration purposes.

Adding a new user
1. The http://localhost:8080/users url directs you to a page with a registration form.
2. Enter the first name and last name of a new user, then click the submit button.
3. You can view the data on the next page.

Retrieve a user info by id
1. The http://localhost:8080/users/{id} directs you to a page with the info of a particular user with the same id.
