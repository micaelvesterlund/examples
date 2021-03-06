name := "dfdl-xslt-csv"

organization := "com.example"

version := "0.0.1"

scalaVersion := "2.12.11"

libraryDependencies ++= Seq(
  "org.apache.daffodil" %% "daffodil-japi" % "2.7.0",
  "com.novocode" % "junit-interface" % "0.11" % "test",
  "junit" % "junit" % "4.12" % "test",
)

testOptions += Tests.Argument(TestFrameworks.JUnit, "-v")
