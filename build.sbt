val Organization = "com.github.mrkm4ntr"
val Name = "gitbucket-network-plugin"
val Version = "1.5"

organization := Organization
name := Name
version := Version
scalaVersion := "2.12.4"
gitbucketVersion := "4.19.2"

libraryDependencies += "joda-time" % "joda-time" % "2.9.9"

scalacOptions := Seq("-deprecation", "-feature", "-language:postfixOps")
