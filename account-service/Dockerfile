FROM java:8-jre
MAINTAINER Yassine ZOUGAGH <y.zougagh@piman-group.fr>

ADD ./target/account-service.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/account-service.jar"]

EXPOSE 6000