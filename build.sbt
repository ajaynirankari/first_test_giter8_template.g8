enablePlugins(ScriptedPlugin)
name := "My Template Project"
addCommandAlias("test","g8Test")
scriptedLaunchOpts ++= Seq(
  "-Xms1024m", 
  "-Xmx1024m", 
  "-XX:ReservedCodeCacheSize=128m", 
  "-Xss2m", 
  "-Dfile.encoding=UTF-8"
  )