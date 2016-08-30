
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/adarsh/Documents/pp/pixserver/conf/routes
// @DATE:Tue Aug 30 16:19:24 IST 2016


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
