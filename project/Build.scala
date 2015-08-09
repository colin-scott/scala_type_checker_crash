import sbt._
import sbt.Keys._

object STS2Application extends Build {
  lazy val sets2app = Project(
    id = "randomSearch",
    base = file("."),
    settings = Defaults.defaultSettings ++ Seq(
      organization := "com.typesafe.sbt.aspectj",
      version := "0.1",
      scalaVersion := "2.11.0",
      libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.3.6"
    )
  )
}
