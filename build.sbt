lazy val commonSettings = Seq(
  organization := "net.nomadicalien",
  version := "0.1.0-SNAPSHOT",
  scalaVersion := "2.12.0",
  addCompilerPlugin("org.psywerx.hairyfotr" %% "linter" % "0.1.17")
)

lazy val librarySettings = Seq(
  "org.scalaz"     %% "scalaz-core"       % "7.2.8",
  "org.scalaz"     %% "scalaz-concurrent" % "7.2.8",
  "org.specs2"     %% "specs2-core"       % "3.8.6" % Test,
  "org.specs2"     %% "specs2-scalacheck" % "3.8.6" % Test,
  "org.scalacheck" %% "scalacheck"        % "1.13.4" % Test
)

lazy val root = (project in file("."))
  .settings(name := "functional-and-reactive-programming-aggregate")
  .settings(commonSettings: _*)
  .aggregate(chapter1)
  .aggregate(chapter2)
  .aggregate(chapter3)
  .aggregate(chapter4)
  .aggregate(chapter5)
  .aggregate(chapter6)
  .aggregate(chapter7)
  .aggregate(chapter8)
  .aggregate(chapter9)
  .aggregate(chapter10)

lazy val chapterSettings = Seq(
  libraryDependencies ++= librarySettings,
  scalacOptions ++= Seq("-unchecked", "-deprecation", "-Xlint"),
  scalacOptions in Test ++= Seq("-Yrangepos", "-Xlint")
)

lazy val chapter1 =
  (project in file("chapter1"))
    .settings(name := "functional-and-reactive-programming-chapter1")
    .settings(commonSettings: _*)
    .settings(chapterSettings: _*)

lazy val chapter2 =
  (project in file("chapter2"))
    .settings(name := "functional-and-reactive-programming-chapter2")
    .settings(commonSettings: _*)
    .settings(chapterSettings: _*)

lazy val chapter3 =
  (project in file("chapter3"))
    .settings(name := "functional-and-reactive-programming-chapter3")
    .settings(commonSettings: _*)
    .settings(chapterSettings: _*)

lazy val chapter4 =
  (project in file("chapter4"))
    .settings(name := "functional-and-reactive-programming-chapter4")
    .settings(commonSettings: _*)
    .settings(chapterSettings: _*)

lazy val chapter5 =
  (project in file("chapter5"))
    .settings(name := "functional-and-reactive-programming-chapter5")
    .settings(commonSettings: _*)
    .settings(chapterSettings: _*)

lazy val chapter6 =
  (project in file("chapter6"))
    .settings(name := "functional-and-reactive-programming-chapter6")
    .settings(commonSettings: _*)
    .settings(chapterSettings: _*)

lazy val chapter7 =
  (project in file("chapter7"))
    .settings(name := "functional-and-reactive-programming-chapter7")
    .settings(commonSettings: _*)
    .settings(chapterSettings: _*)

lazy val chapter8 =
  (project in file("chapter8"))
    .settings(name := "functional-and-reactive-programming-chapter8")
    .settings(commonSettings: _*)
    .settings(chapterSettings: _*)

lazy val chapter9 =
  (project in file("chapter9"))
    .settings(name := "functional-and-reactive-programming-chapter9")
    .settings(commonSettings: _*)
    .settings(chapterSettings: _*)

lazy val chapter10 =
  (project in file("chapter10"))
    .settings(name := "functional-and-reactive-programming-chapter10")
    .settings(commonSettings: _*)
    .settings(chapterSettings: _*)
