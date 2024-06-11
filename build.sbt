ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.4.2"

ThisBuild / organization := "nl.hsleiden"

lazy val root = (project in file("."))
  .settings(
    name := "ICPT_les",
    libraryDependencies ++= Seq(
      "org.scalactic" %% "scalactic" % "3.2.18",
      "org.scalatest" %% "scalatest" % "3.2.18" % "test"
    )
  )
