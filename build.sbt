name := "pikarto"

version := "1.0-SNAPSHOT"

scalaVersion := "2.11.7"

routesGenerator := StaticRoutesGenerator

testOptions in Test := Seq(Tests.Argument(TestFrameworks.JUnit, "-a"))

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

//unmanagedJars in Compile += file(Path.userHome+"/truprojects/trucommon/tru-proto/repos/in.trujobs.proto/tru-proto/1.0.0/tru-proto-1.0.0.jar")

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs,
  filters,
  "mysql" % "mysql-connector-java" % "5.1.27",
  "org.scalatestplus.play" %% "scalatestplus-play" % "1.5.0" % "test",
  "junit" % "junit" % "4.12",
  "com.novocode" % "junit-interface" % "0.11" % "test",
  "com.amazonaws" % "aws-java-sdk" % "1.3.11"
  )

libraryDependencies += "com.google.api-client" % "google-api-client" % "1.20.0"

libraryDependencies += "com.google.apis" % "google-api-services-sheets" % "v4-rev9-1.22.0"

libraryDependencies += "com.google.oauth-client" % "google-oauth-client-jetty" % "1.22.0"

libraryDependencies += "com.google.apis" % "google-api-services-drive" % "v3-rev32-1.22.0"

libraryDependencies += "com.google.protobuf" % "protobuf-java" % "3.0.0-beta-2"

libraryDependencies += "net.sf.opencsv" % "opencsv" % "2.3"

libraryDependencies += "com.typesafe.play" % "play-json_2.11" % "2.5.0"

libraryDependencies += "org.mockito" % "mockito-core" % "1.10.19"

libraryDependencies += "org.json"%"org.json"%"chargebee-1.0"

libraryDependencies += evolutions
