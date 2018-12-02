// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/LucasWeidner/Play/play-adventskalender/conf/routes
// @DATE:Sat Dec 01 00:03:56 CET 2018

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseImageController ImageController = new controllers.ReverseImageController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseImageController ImageController = new controllers.javascript.ReverseImageController(RoutesPrefix.byNamePrefix());
  }

}
