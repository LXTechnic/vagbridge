name := """vagbridge"""
organization := "io.veeshan.lxtech"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

// addSbtPlugin("org.scala-debugger" % "sbt-jdi-tools" % "1.0.0")

scalaVersion := "2.12.8"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "4.0.1" % Test

libraryDependencies += "tech.sparse" %%  "toml-scala" % "0.2.0"

libraryDependencies += "org.scala-debugger" %% "scala-debugger-api" % "1.1.0-M3"

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "io.veeshan.lxtech.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "io.veeshan.lxtech.binders._"
