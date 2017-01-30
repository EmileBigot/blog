package controller;

import domain.User;
import services.UserService;

import static spark.Spark.get;

public class UserController {

    public UserController(final UserService userService) {

        get("/home", (request, response) -> "<h1>Welkom bij de spark workshop</h1>");

        get("/allusers", (request, response) -> userService.getAllUsers());

        get("/login/:username/:password", (request, response) -> {
                User u = userService.loginUser(request.params("username"), request.params("password"));
                if(u != null)
                {
                    request.session().removeAttribute("currentUser");
                    request.session().attribute("currentUser", u.getUsername());
                    return "Login succesful";
                } else {
                    return "Wrong login credentials";
                }
            }
        );

        get("/logout", (request, response) ->{
            request.session().removeAttribute("currentUser");
            return "Logout succesful";
        });

        get("/register/:username/:password/:name", ((request, response) -> "The following user is succesful registered: " +
                userService.registerUser(request.params("username"), request.params("password"),
                        request.params("name")).toString()));

        get("/postblog/:posttitle/:content", ((request, response) ->  "Posted blog: " +
                userService.postBlog(request.params("posttitle"), request.params("content"),
                        request.session().attribute("currentUser"))));

        get("/addcomment/:posttitle/:comment", (request, response) -> "Post with added comment: " +
                userService.commentOnBlog(request.params("posttitle"), request.params("comment"),
                        request.session().attribute("currentUser")));

        get("/allposts", (request, response) -> "All the posts with comments: " + userService.getAllPosts());
    }
}