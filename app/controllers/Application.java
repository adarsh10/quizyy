package controllers;

import play.api.Play;
import play.mvc.Controller;
import play.mvc.Result;

public class Application extends Controller {

    private static boolean isDevMode = Play.isDev(Play.current());

    public static Result index() {
        String sessionId = session().get("sessionId");
        if (sessionId != null) {
            return redirect("/dashboard");
        }
        return ok(views.html.index.render());
    }
}