FROM java:8-jre
MAINTAINER Yassine ZOUGAGH <y.zougagh@piman-group.fr>

ADD ./target/statistics-service.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/statistics-service.jar"]

EXPOSE 7000