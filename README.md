# Installation
The simplest way to get started with Akka and SBT is to check out the Akka/SBT template project.

Summary of the essential parts for using Akka with SBT:

SBT installation instructions on [https://github.com/harrah/xsbt/wiki/Setup](https://github.com/harrah/xsbt/wiki/Setup)

`build.sbt` file:


```
name := "My Project"
 
version := "1.0"
 
scalaVersion := "2.11.7"
 
libraryDependencies +=
  "com.typesafe.akka" %% "akka-actor" % "2.4.1"
```

Note: the libraryDependencies setting above is specific to SBT v0.12.x and higher. If you are using an older version of SBT, the libraryDependencies should look like this:

```
libraryDependencies +=
  "com.typesafe.akka" % "akka-actor_2.11" % "2.4.1"
```

For snapshot versions, the snapshot repository needs to be added as well:

```
resolvers += "Akka Snapshot Repository" at "http://repo.akka.io/snapshots/"
```

# Import to IntelliJ
File > Import Project > <Click on SBT>
