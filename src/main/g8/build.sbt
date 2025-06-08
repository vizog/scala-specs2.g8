lazy val dependencies = Seq(
  "org.specs2" %% "specs2-core"       % "4.20.5" % "test",
  "org.specs2" %% "specs2-scalacheck" % "4.20.5" % "test",
  "org.specs2" %% "specs2-mock"       % "4.20.5" % "test"
)

lazy val commonSettings = Seq(
  organization        := "com.$package$",
  scalaVersion        := "$scala_version$",
  name                := "$name$",
  libraryDependencies ++= dependencies
)

lazy val template = (project in file(".")).settings(commonSettings)
