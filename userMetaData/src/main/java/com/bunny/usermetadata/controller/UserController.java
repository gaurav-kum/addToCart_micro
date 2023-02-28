package com.bunny.usermetadata.controller;

import com.bunny.usermetadata.entity.UserMetaData;
import com.bunny.usermetadata.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
// controller url
@RequestMapping("/amazon/users/")
public class UserController {

    @Autowired
    UserService userService;

    // service url
    @PostMapping("/saveUserDetails")
    public UserMetaData saveUserDetails(@RequestBody UserMetaData userData) {
        UserMetaData user = userService.saveUserMetaDataToDb(userData);
        return user;
    }

    @GetMapping("/getUserDetails/{userId}")
    public UserMetaData getUserDetails(@PathVariable String userId) {
        UserMetaData user = userService.getUserDetailsFromDb(userId);
        return user;
    }
}
