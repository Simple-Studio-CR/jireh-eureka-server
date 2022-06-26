FROM openjdk:11
VOLUME /tmp
EXPOSE 8761
ADD ./target/app-simplestudio-eureka-server-0.0.1.jar eureka-server.jar
ENTRYPOINT ["java", "-jar", "eureka-server.jar"]
