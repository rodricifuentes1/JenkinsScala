import AssemblyKeys._

name := "Jenkins-SBT"

organization := "co.s4n"

version := "1.0"

scalaVersion := "2.10.3"

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"
 
libraryDependencies ++= {
  Seq(
"org.scalatest" % "scalatest_2.10" % "2.0" % "test",
"junit" % "junit" % "4.8.1" % "test"
  )
}

assemblySettings

mainClass in assembly := Some("Main")

jarName in assembly := "Calculadora.jar"
