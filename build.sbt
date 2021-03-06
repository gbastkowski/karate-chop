name := "Karate Chop Kata"

libraryDependencies ++= Seq(
  "org.apache.logging.log4j"   %% "log4j-api-scala"             % "11.0",
  "org.apache.logging.log4j"    % "log4j-api"                   % "2.11.1",
  "org.apache.logging.log4j"    % "log4j-core"                  % "2.11.1",
  "org.scalatest"              %% "scalatest"                   % "3.0.5"       % Test
)

scalaVersion := "2.12.6"
