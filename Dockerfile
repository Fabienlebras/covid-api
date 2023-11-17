#From jdk
FROM eclipse-temurin:17 as jre-build

RUN mkdir /opt/apppppppppp


COPY build/libs/covid-api-0.0.1-SNAPSHOT.jar /opt/apppppppppp/


CMD ["java", "-jar", "/opt/app/covid-api-0.0.1-SNAPSHOT.jar"]
