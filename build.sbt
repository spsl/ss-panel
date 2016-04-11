name := """ss-panel"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs,
  javaJpa,
  "mysql" % "mysql-connector-java" % "5.1.35",
  "org.hibernate" % "hibernate-entitymanager" % "5.1.0.Final",
  "com.fasterxml.jackson.core" % "jackson-databind" % "2.7.3"

)

routesGenerator := InjectedRoutesGenerator

PlayKeys.externalizeResources := false
