FROM java:8-jre

MAINTAINER Yassine ZOUGAGH <y.zougagh@piman-group.fr>

ADD ./target/project-service.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/project-service.jar"]

EXPOSE 7001