// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Admin/Documents/codes/ITSD-DT2022-Template/conf/routes
// @DATE:Tue Jan 31 02:49:53 GMT 2023


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
