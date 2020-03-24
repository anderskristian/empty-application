# Empty Spring Boot application

This application demonstrates an empty Main application based ready with Spring Boot Application features

The objective is to clarify that NO dependencies are added event that a big evil parent dependency is used

```
mvn clean package

# Linux / Macos / git Bash
java -cp target/my-empty-application-0.0.1-SNAPSHOT.jar springboot.Main


# Windows
java -cp target\my-empty-application-0.0.1-SNAPSHOT.jar springboot.Main

```

## Expected result

It is a huge quality of Spring Boot's spring-boot-starter-parent - that there is NO dependencies added by the parent

```
starting query maven
calling maven completed
[INFO] Scanning for projects...
[INFO] 
[INFO] --------------------< dk.bank:my-empty-application >--------------------
[INFO] Building my-empty-application 0.0.1-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-dependency-plugin:3.0.2:tree (default-cli) @ my-empty-application ---
[INFO] dk.bank:my-empty-application:jar:0.0.1-SNAPSHOT
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  0.871 s
[INFO] Finished at: 2020-03-24T14:50:13+01:00
[INFO] ------------------------------------------------------------------------

```

## Result with dependencies

Uncomment the two dependencies in pom.xml

Rebuild and run again


```
starting query maven
calling maven completed
[INFO] Scanning for projects...
[INFO] 
[INFO] --------------------< dk.bank:my-empty-application >--------------------
[INFO] Building my-empty-application 0.0.1-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-dependency-plugin:3.0.2:tree (default-cli) @ my-empty-application ---
[INFO] dk.bank:my-empty-application:jar:0.0.1-SNAPSHOT
[INFO] +- junit:junit:jar:4.12:test
[INFO] |  \- org.hamcrest:hamcrest-core:jar:1.3:test
[INFO] \- org.springframework.boot:spring-boot-starter-web:jar:2.0.3.RELEASE:compile
[INFO]    +- org.springframework.boot:spring-boot-starter:jar:2.0.3.RELEASE:compile
[INFO]    |  +- org.springframework.boot:spring-boot:jar:2.0.3.RELEASE:compile
[INFO]    |  +- org.springframework.boot:spring-boot-autoconfigure:jar:2.0.3.RELEASE:compile
[INFO]    |  +- org.springframework.boot:spring-boot-starter-logging:jar:2.0.3.RELEASE:compile
[INFO]    |  |  +- ch.qos.logback:logback-classic:jar:1.2.3:compile
[INFO]    |  |  |  +- ch.qos.logback:logback-core:jar:1.2.3:compile
[INFO]    |  |  |  \- org.slf4j:slf4j-api:jar:1.7.25:compile
[INFO]    |  |  +- org.apache.logging.log4j:log4j-to-slf4j:jar:2.10.0:compile
[INFO]    |  |  |  \- org.apache.logging.log4j:log4j-api:jar:2.10.0:compile
[INFO]    |  |  \- org.slf4j:jul-to-slf4j:jar:1.7.25:compile
[INFO]    |  +- javax.annotation:javax.annotation-api:jar:1.3.2:compile
[INFO]    |  +- org.springframework:spring-core:jar:5.0.7.RELEASE:compile
[INFO]    |  |  \- org.springframework:spring-jcl:jar:5.0.7.RELEASE:compile
[INFO]    |  \- org.yaml:snakeyaml:jar:1.19:runtime
[INFO]    +- org.springframework.boot:spring-boot-starter-json:jar:2.0.3.RELEASE:compile
[INFO]    |  +- com.fasterxml.jackson.core:jackson-databind:jar:2.9.6:compile
[INFO]    |  |  +- com.fasterxml.jackson.core:jackson-annotations:jar:2.9.0:compile
[INFO]    |  |  \- com.fasterxml.jackson.core:jackson-core:jar:2.9.6:compile
[INFO]    |  +- com.fasterxml.jackson.datatype:jackson-datatype-jdk8:jar:2.9.6:compile
[INFO]    |  +- com.fasterxml.jackson.datatype:jackson-datatype-jsr310:jar:2.9.6:compile
[INFO]    |  \- com.fasterxml.jackson.module:jackson-module-parameter-names:jar:2.9.6:compile
[INFO]    +- org.springframework.boot:spring-boot-starter-tomcat:jar:2.0.3.RELEASE:compile
[INFO]    |  +- org.apache.tomcat.embed:tomcat-embed-core:jar:8.5.31:compile
[INFO]    |  +- org.apache.tomcat.embed:tomcat-embed-el:jar:8.5.31:compile
[INFO]    |  \- org.apache.tomcat.embed:tomcat-embed-websocket:jar:8.5.31:compile
[INFO]    +- org.hibernate.validator:hibernate-validator:jar:6.0.10.Final:compile
[INFO]    |  +- javax.validation:validation-api:jar:2.0.1.Final:compile
[INFO]    |  +- org.jboss.logging:jboss-logging:jar:3.3.2.Final:compile
[INFO]    |  \- com.fasterxml:classmate:jar:1.3.4:compile
[INFO]    +- org.springframework:spring-web:jar:5.0.7.RELEASE:compile
[INFO]    |  \- org.springframework:spring-beans:jar:5.0.7.RELEASE:compile
[INFO]    \- org.springframework:spring-webmvc:jar:5.0.7.RELEASE:compile
[INFO]       +- org.springframework:spring-aop:jar:5.0.7.RELEASE:compile
[INFO]       +- org.springframework:spring-context:jar:5.0.7.RELEASE:compile
[INFO]       \- org.springframework:spring-expression:jar:5.0.7.RELEASE:compile
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  0.760 s
[INFO] Finished at: 2020-03-24T14:51:39+01:00
[INFO] ------------------------------------------------------------------------

```
