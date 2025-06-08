package com.$package$

import org.specs2.ScalaCheck
import org.specs2.mutable.Specification

class MainSpec extends Specification with ScalaCheck {

  "Main should" >> {
    "say welcome!" >> {
      Main.makeWelcome(Seq("hello")) must startWith("Welcome!")
    }

    "return the names" >> prop { names: Seq[String] =>
      val welcomeMsg = Main.makeWelcome(names)
      names.map(welcomeMsg must contain(_))
    }
  }
}
