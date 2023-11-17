#From jdk
FROM eclipse-temurin:17 as jre-build

RUN mkdir /opt/app


COPY covid-api/build/libs/covid-api-0.0.1-SNAPSHOT.jar /opt/app/

CMD ["java", "-jar", "/opt/app/covid-api-0.0.1-SNAPSHOT.jar"]

#copy -- from  multistage build