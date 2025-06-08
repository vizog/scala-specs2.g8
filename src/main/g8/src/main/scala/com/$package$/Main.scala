package com.$package$

object Main extends App {
  println(makeWelcome(args))

  def makeWelcome(args: Seq[String]) = {
    s"Welcome! \${args.mkString(", ")}"
  }
}
