FROM eclipse-temurin:17
COPY target/awstsss.jar  awstsss.jar
CMD [ "java","-jar","awstsss.jar" ]