package controller;

import domain.User;
import services.UserService;

import static spark.Spark.get;

public class UserController {

    public UserController(final UserService userService) {

        get("/users", (request, response) -> userService.getAllUsers());

        get("/login/:username/:password", (request, response) -> {
                User u = userService.loginUser(request.params("username"), request.params("password"));
                if(u != null)
                {
                    request.session().attribute("currentUser", u.getUsername());
                    return "Login succesful :)";
                } else {
                    return "Wrong login credentials :(";
                }
            }
        );

        get("/register/:username/:password/:name", ((request, response) -> "The following user is succesful registered: " +
                userService.registerUser(request.params("username"), request.params("password"),
                        request.params("name")).toString()));

        get("/postblog/:title/:content", ((request, response) ->  "The following blog is posted succesfully: " +
                userService.postBlog(request.params("title"), request.params("content"),
                        request.session().attribute("currentUser"))));

        get("/allposts", (request, response) -> "This are all the posts with their comments " + userService.getAllPosts());
    }
}