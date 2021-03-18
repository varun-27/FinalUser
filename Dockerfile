FROM openjdk:11.0
VOLUME /tmp
COPY /target/UserMS-0.0.1-SNAPSHOT.jar /usr/app/
WORKDIR /usr/app
EXPOSE 8300
ENV JAVA_OPTS=""
RUN sh -c "touch UserMS-0.0.1-SNAPSHOT.jar"
ENTRYPOINT [ "java", "-jar", "UserMS-0.0.1-SNAPSHOT.jar" ]
