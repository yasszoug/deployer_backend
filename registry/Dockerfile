FROM java:8-jre
MAINTAINER Yassine ZOUGAGH <y.zougagh@piman-group.fr>

ADD ./target/registry.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/registry.jar"]

EXPOSE 8761