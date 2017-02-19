# loggingtest
Test project for redirecting jul logging to slf4j

Don't forget to add -Djava.util.logging.config.file=./target/classes/logging.properties to the console application to load a custom jul logging configuration

For tomcat add -Djava.util.logging.config.file=./target/classes/logging.properties to JAVA_OPTS to load the logback config. The jul logging config is loaded by default.
