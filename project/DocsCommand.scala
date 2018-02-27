package sbtdocs

import sbt._
import Keys._

object DocsPlugin extends AutoPlugin {
  object autoImport {
    val docsMain = settingKey[Option[String]](None)
  }

  override lazy val projectSettings = Seq(commands += generateDocsCommand)
  lazy val generateDocsCommand =
    Command.command("generateDocs") { (state: State) =>
      println("Generate documentation")
      mainClass := docsMain
      (run in Compile).evaluated
      state
    }
}
