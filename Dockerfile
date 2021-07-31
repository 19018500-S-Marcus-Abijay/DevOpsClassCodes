
FROM ubuntu:latest
RUN apt-get -y update && apt-get -y upgrade
RUN apt-get -y install openjdk-8-jdk wget
RUN mkdir /usr/local/tomcat
RUN wget https://mirrors.estointernet.in/apache/tomcat/tomcat-8/v8.5.69/bin/apache-tomcat-8.5.69.tar.gz -O /tmp/tomcat.tar.gz
RUN cd /tmp && tar xvfz tomcat.tar.gz
RUN cp -Rv /tmp/apache-tomcat-8.5.69/* /usr/local/tomcat/
ADD addressbook.war /usr/local/tomcat/webapps/addressbook.war
EXPOSE 8085
CMD /usr/local/tomcat/bin/catalina.sh run

#docker build --no-cache -t tomcat -f tomcat.dockerfile .
#docker run -d -p 8085:8080 --name tomcat tomcat
#http://127.0.0.1:8085/addressbook

#3 get updates
#4 install and get jdk
#5 create directory
#6 get apache tomcat from their website
#7 chanfe directory
#8 copy file to
#9 copies addressbook.war into 
#10 exposes port 8080
