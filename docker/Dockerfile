FROM ubuntu:14.04

MAINTAINER Benoit Sautel

RUN apt-get update

RUN apt-get install -y npm nodejs-legacy python3

RUN npm install -g bower

RUN bower install

EXPOSE 8080

ENTRYPOINT python -m SimpleHTTPServer 8080
