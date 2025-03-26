# syntax=docker/dockerfile:1
FROM openjdk:23-jdk

COPY ./target/MS-Mocks-1.0-SNAPSHOT.jar /home
RUN mkdir /src
COPY ./src /src
CMD ["java", "-version"]
CMD ["java", "-jar", "/home/MS-Mocks-1.0-SNAPSHOT.jar"]