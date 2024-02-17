FROM eclipse-temurin:17
COPY target/sampledevops.jar devops.jar
CMD [ "java","-jar","devops.jar" ]