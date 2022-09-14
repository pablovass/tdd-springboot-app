package com.pablovass.controller;

import com.pablovass.model.User;
import com.pablovass.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/test/mongo/save", method = RequestMethod.POST, consumes = "application/json")
    public String saveData(@RequestBody User user) {
        User u = null;

        try {
            userService.save(user);
        } catch (Exception e) {
            return e.getMessage();
        }

        return "Success !";
    }


    @RequestMapping(value = "/test/mongo/search", method = RequestMethod.GET, consumes = "application/json")
    public List<User> searchData() {
        List<User> users = null;

        try {
            users = userService.search();
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (users.size() != 0) {
            return users;
        } else {
            return null;
        }
    }

    @RequestMapping(value = "/test/mongo/update", method = RequestMethod.PUT, consumes = "application/json")
    public String updateData(@RequestBody User users) {
        boolean b = false;

        try {
            b = userService.update(users);
        } catch (Exception e) {
            return e.getMessage();
        }

        if (b){
            return "Success !";
        }else {
            return "Error !";
        }
    }

    @RequestMapping(value = "/test/mongo/remove", method = RequestMethod.DELETE, consumes = "application/json")
    public String removeData(@RequestParam  String id) {
        boolean b = false;

        try {
            b = userService.remove(id);
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (b){
            return "Success !";
        }else {
            return "Error !";
        }
    }

}
