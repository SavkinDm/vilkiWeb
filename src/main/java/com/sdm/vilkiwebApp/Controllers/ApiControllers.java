package com.sdm.vilkiwebApp.Controllers;


import com.sdm.vilkiwebApp.Domain.User;
import com.sdm.vilkiwebApp.Domain.Vilka;
import com.sdm.vilkiwebApp.Repos.UserRepo;
import com.sdm.vilkiwebApp.Service.UserService;
import com.sdm.vilkiwebApp.Service.VilkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("api")
public class ApiControllers {

    @Autowired
    UserService userService;

    @Autowired
    VilkaService vilkaService;

    @GetMapping("/time")
    public String getTime() {

        return String.valueOf(System.currentTimeMillis());
    }

    @GetMapping("/getVilkas")
    public List<Vilka> getVilkas(@RequestHeader(name = "login") String login, @RequestHeader(name = "apiKey") String apikey) {


        return null;
    }


    @Autowired
    UserRepo userRepo;

    @GetMapping("/test")
    public String test() {
        userRepo.save(new User("test", "test"));

        return "allok";
    }

}
