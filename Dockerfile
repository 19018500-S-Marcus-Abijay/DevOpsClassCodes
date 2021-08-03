FROM tomcat:latest
COPY addressbook.war /usr/local/tomcat/webapps/
EXPOSE 8085
CMD ["catalina.sh", "run"]rt 8080
