
name := """mvdatabase"""
organization := "com.mv"

version := "1.0-SNAPSHOT"

lazy val myProject = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

scalaVersion := "2.12.8"
libraryDependencies += guice

libraryDependencies ++= Seq(

 javaJdbc,
 javaJpa,
 cache,
 filters,
 evolutions,
 javaWs,
 "org.simpleframework" % "simple-xml" % "2.7.1",
 "br.com.moip" % "java-sdk" % "4.2.0",
 "mysql" % "mysql-connector-java" % "5.1.27"
)