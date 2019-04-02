package interceptor;
import java.util.concurrent.CompletionStage;

import play.mvc.Action;
import play.mvc.Http;
import play.mvc.Http.Context;
import play.mvc.Result;

public class ApiInterceptor extends Action.Simple{
    @Override
    public CompletionStage<Result> call(Context ctx) {
        Http.Response response = ctx.response();
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "GET,PUT,POST,DELETE,OPTIONS");
	response.setHeader("Access-Control-Max-Age", "3600");
 	response.setHeader("Access-Control-Allow-Headers", "x-requested-with");
        return delegate.call(ctx); 
    }
}