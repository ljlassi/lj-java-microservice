What started of as a Java microservice project got a bit too big to be called a microservice (in my opinion), as can happen a bit too easily. The idea is that this would eventually communicate with one of my PHP applications through some API.

Very much work in progress, by the time I'm writing this, has a functional user model, loads local config file with DB credentials, connects to a MySQL database, is able to add a user to database and is also able to receive and send HTTP POST requests.

I have yet to add unit tests etc.

USAGE AND DEPLOYMENT:

I'm using Eclipse for coding and Maven for compiling the program into a usable standalone JAR-file. Please either use Eclipse and Maven - or edit the code to work with e.g. IntelliJ.
