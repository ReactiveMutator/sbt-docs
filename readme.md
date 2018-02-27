# SBT Docs

SBT plugin for generating documentation from special source code.

Write this in `project/sbtdocs.sbt`:

```scala
addSbtPlugin("com.github.reactivemutator" % "sbt-docs" % "0.0.1-SNAPSHOT")
```

Insert this in `build.sbt`:

```scala
docsMain := Some(projectRoot.docs.main)
```

where `projectRoot.docs.main` is an entry to your special documentation source code.
