FROM java:8
VOLUME /tmp
ADD target/docker-demo-0.0.1-SNAPSHOT.jar demo-microservice.jar
RUN bash -c 'touch /demo-microservice.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/demo-microservice.jar"]