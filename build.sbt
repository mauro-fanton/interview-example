lazy val root = (project in file(".")).
settings(
  name := "Scala interview pairing",
  version := "1.0",
  scalaVersion := "2.13.3"
)

excludeFilter in unmanagedSources := HiddenFileFilter || "*.java*"

Compile / javaSource := baseDirectory.value / "not-here"

Test / javaSource := baseDirectory.value / "not-here"

target := file("scala_target")

val scalaTest = "org.scalatest" %% "scalatest" % "3.2.0" % "test"

libraryDependencies ++= Seq(
  scalaTest
)
