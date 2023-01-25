FROM amazoncorretto:11-alpine-jdk

MAINTAINER noe

COPY target/SBoot1-0.0.1-SNAPSHOT.jar noeprueba.jar

ENTRYPOINT ["java","-jar","/noeprueba.jar"]
