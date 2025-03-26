# syntax=docker/dockerfile:1
FROM quay.io/centos/centos:stream9
RUN yum -y update
RUN yum install -y java-21-openjdk java-21-openjdk-devel

COPY ./target/MS-Mocks-1.0-SNAPSHOT.jar /home
RUN mkdir /src
COPY ./src /src
CMD ["java", "-version"]
CMD ["java", "-jar", "/home/MS-Mocks-1.0-SNAPSHOT.jar"]
