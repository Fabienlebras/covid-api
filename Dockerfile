#From jdk
FROM eclipse-temurin:17 as jre-build

RUN mkdir /opt/app

RUN ls -l 

<<<<<<< HEAD

COPY build/libs/covid-api-0.0.1-SNAPSHOT.jar /opt/app/
=======
COPY ..
>>>>>>> be165abaa9caf407ba0902b700d1ace1d14e72f3


CMD ["java", "-jar", "/opt/app/covid-api-0.0.1-SNAPSHOT.jar"]

#copy -- from  multistage build

