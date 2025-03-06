# syntax=docker/dockerfile:1
FROM quay.io/centos/centos:stream9
RUN yum -y update

COPY ./target/MS-Mocks-1.0-SNAPSHOT.jar /home
RUN mkdir /src
COPY ./src /src
CMD ["/usr/bin/java", "-jar", "/home/MS-Mocks-1.0-SNAPSHOT.jar"]
