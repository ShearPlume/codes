// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/18309/Documents/codes/ITSD-DT2022-Template/conf/routes
// @DATE:Fri Feb 10 14:53:06 GMT 2023


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
