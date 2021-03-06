organization := "ch.firsts"
description := "An SBT dependency resolver and publisher for Google Artifact Registry Maven repositories"
scalaVersion := "2.12.11"
homepage := Some(url("https://github.com/suprafii/sbt-google-artifact-registry"))
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
scmInfo := Some(ScmInfo(
  browseUrl = url("https://github.com/suprafii/sbt-google-artifact-registry"),
  connection = "scm:git:git@github.com:suprafii/sbt-google-artifact-registry.git"
))
publishMavenStyle := false
bintrayRepository := "sbt-plugins"
bintrayVcsUrl := Some("git@github.com:suprafii/sbt-google-artifact-registry.git")
bintrayOrganization in bintray := None

libraryDependencies += "com.google.cloud.artifactregistry" % "artifactregistry-maven-wagon" % "2.0.1"

enablePlugins(SbtPlugin)
