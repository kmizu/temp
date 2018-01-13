object StaticForwarder {
  def outF(): Unit = {
    println("outF")
  }
  object Inner {
    def inF(): Unit = {
      println("inF")
    }
  }
}

