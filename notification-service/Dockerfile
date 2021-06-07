FROM java:8-jre
MAINTAINER Yassine ZOUGAGH <y.zougagh@piman-group.fr>

ADD ./target/notification-service.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/notification-service.jar"]

EXPOSE 8000