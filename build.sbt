name := """Student-Management-System"""
organization := "com.example"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava,PlayEbean)

scalaVersion := "2.13.5"

libraryDependencies += guice
libraryDependencies += javaJdbc

resolvers += "jitpack" at "https://jitpack.io"

libraryDependencies += "mysql" % "mysql-connector-java" % "5.1.21"

libraryDependencies += "com.github.thibaultmeyer" % "play-rabbitmq-module" % "release~20.08"

libraryDependencies +="com.rabbitmq" % "amqp-client" % "2.8.1",


