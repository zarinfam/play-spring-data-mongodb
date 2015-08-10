name := """play-spring-data-mongodb"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  "org.springframework" % "spring-context" % "4.0.4.RELEASE",
  "javax.inject" % "javax.inject" % "1",
  "org.springframework.data" % "spring-data-mongodb" % "1.7.2.RELEASE",
  "org.springframework" % "spring-test" % "4.0.4.RELEASE" % "test"
)

fork in Test := false