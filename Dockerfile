#From jdk
FROM eclipse-temurin:17-jdk-jammy

WORKDIR /opt/app

RUN touch /opt/app/dummy_file

COPY . .
RUN ls -l /opt/app/build/libs

CMD ["gradle","build"]

FROM eclipse-temurin:17-jre-jammy

WORKDIR /opt/app

COPY --from=0 /opt/app/build/libs/covid-api-0.0.1-SNAPSHOT.jar /app.jar

CMD ["java","-jar","/app.jar"]
#copy -- from  multistage build

