#From jdk
FROM eclipse-temurin:17 as jre-build

RUN mkdir /opt/apppppppp


COPY build/libs/covid-api-0.0.1-SNAPSHOT.jar /opt/apppppppp/


CMD ["java", "-jar", "/opt/app/covid-api-0.0.1-SNAPSHOT.jar"]
