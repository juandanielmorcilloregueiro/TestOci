# syntax=docker/dockerfile:1
FROM centos:7
RUN yum -y update
RUN yum -y remove java
RUN yum install -y \
       java-1.8.0-openjdk \
       java-1.8.0-openjdk-devel

COPY ./target/MS-Mocks-1.0-SNAPSHOT.jar /home
RUN mkdir /src
COPY ./src /src
CMD ["/usr/bin/java", "-jar", "/home/MS-Mocks-1.0-SNAPSHOT.jar"]
