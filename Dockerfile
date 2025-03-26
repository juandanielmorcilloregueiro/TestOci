# syntax=docker/dockerfile:1
FROM quay.io/centos/centos:stream9
RUN yum -y upgrade
RUN yum -y update
RUN yum install -y jdk-23-headful

COPY ./target/MS-Mocks-1.0-SNAPSHOT.jar /home
RUN mkdir /src
COPY ./src /src
CMD ["java", "-version"]
CMD ["java", "-jar", "/home/MS-Mocks-1.0-SNAPSHOT.jar"]
