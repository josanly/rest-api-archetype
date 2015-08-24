import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {
  play.Project.playJavaSettings
  val core = Project("rest-api-generic-core", file("rest-api-generic-core"))
  .settings(
    version := Pom.version(baseDirectory.value),
    libraryDependencies ++= Pom.dependencies(baseDirectory.value))


  val appDependencies = Seq(
    // Add your project dependencies here,
    javaCore,
    javaJdbc,
    javaEbean
  )

  val root = play.Project("rest-api-generic-interface", appDependencies, path = file("rest-api-generic-interface"))
    .dependsOn(core)
    .settings(
      version := Pom.version(baseDirectory.value),
      libraryDependencies ++= Pom.dependencies(baseDirectory.value).filterNot(d => d.name == core.id))

  override def rootProject = Some(root)

}
