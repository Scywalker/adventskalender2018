// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/LucasWeidner/Play/play-adventskalender/conf/routes
// @DATE:Sat Dec 01 00:03:56 CET 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
