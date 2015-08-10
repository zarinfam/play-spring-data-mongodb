package controllers;

import models.User;
import play.libs.F;
import play.mvc.*;

import play.mvc.Controller;
import services.UserService;
import views.html.*;

import javax.inject.Inject;
import javax.inject.Named;


@Named
public class Application extends Controller {

    @Inject
    private UserService userService;

    public Result index() {
        userService.addUser(new User("Saeed", "Zarinfam", "zarin"));
        return ok("insert user saeed successfully!");
    }

}
