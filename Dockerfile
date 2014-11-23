FROM ubuntu:14.04

MAINTAINER Benoit Sautel

RUN apt-get update

RUN apt-get install -y python3

RUN mkdir /webapp

ADD index.html /webapp/
ADD bower_components/ /webapp/bower_components/
ADD css/ /webapp/css/
ADD images/ /webapp/images/

EXPOSE 8000

ENTRYPOINT cd /webapp && ls && python3 -m http.server
