# BrainFuck-DSL
Here is the repo for our versions of both an Internal and an External Brainfuck dsl in scala.
Team Members:

Jordan Howe

Adam Poncher

Scott Miles

Luke Heytens

The version presented in class is the internal DSL which is CrazyiDSL.scala. You can check the
bfdsl.KeywordObjects.scala for all the currently implemented operations. Optimizations are applied automatically. 

Presentation URL: https://docs.google.com/presentation/d/1G5EntuBDODrvGqxAxl_5Q1T4ty12x6OUa3sKI6ZTI0o/edit#slide=id.p

The other version is RuntimeCompilation.scala. This is an external DSL which implements functions correctly and uses
the scala toolbox to parse and evaluate scala source code that has the same behavior as the brainfuck program. Optimizations are included.
Due to this version recieving significatly less time investement things may still be messy, however it should work.
