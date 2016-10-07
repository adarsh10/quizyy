
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/dodo/project/quizyy/conf/routes
// @DATE:Fri Oct 07 23:00:09 IST 2016


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
