FROM java:8-alpine
MAINTAINER Your Name <you@example.com>

ADD target/uberjar/tryapp.jar /tryapp/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/tryapp/app.jar"]
