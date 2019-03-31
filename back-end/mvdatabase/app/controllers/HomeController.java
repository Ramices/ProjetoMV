package controllers;

import interceptor.ApiInterceptor;
import play.libs.Json;
import play.mvc.*;

@play.mvc.With({ ApiInterceptor.class })
public class HomeController extends Controller {


    public Result index() {
        return ok(Json.toJson("Bom dia"));
    }

}
