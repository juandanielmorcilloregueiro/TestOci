# syntax=docker/dockerfile:1
FROM oraclelinux:9
RUN yum -y upgrade
RUN yum -y update
RUN yum -y search openjdk
RUN yum install -y java-22-openjdk java-22-openjdk-devel

COPY ./target/MS-Mocks-1.0-SNAPSHOT.jar /home
RUN mkdir /src
COPY ./src /src
CMD ["java", "-version"]
CMD ["java", "-jar", "/home/MS-Mocks-1.0-SNAPSHOT.jar"]
