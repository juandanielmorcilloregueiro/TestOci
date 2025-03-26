# syntax=docker/dockerfile:1
FROM quay.io/centos/centos:stream9
RUN dnf update
RUN dnf install jdk-22-headful

COPY ./target/MS-Mocks-1.0-SNAPSHOT.jar /home
RUN mkdir /src
COPY ./src /src
CMD ["java", "-version"]
CMD ["java", "-jar", "/home/MS-Mocks-1.0-SNAPSHOT.jar"]
