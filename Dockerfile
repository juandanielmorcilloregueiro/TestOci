# syntax=docker/dockerfile:1
FROM centos:7
RUN yum -y update

COPY ./target/MS-Mocks-1.0-SNAPSHOT.jar /home
RUN mkdir /src
COPY ./src /src
CMD ["/usr/bin/java", "-jar", "/home/MS-Mocks-1.0-SNAPSHOT.jar"]
