
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/adarsh/truprojects/truserver/conf/routes
// @DATE:Tue Aug 30 16:09:15 IST 2016


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
