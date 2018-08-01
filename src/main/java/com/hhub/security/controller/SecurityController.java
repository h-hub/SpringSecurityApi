package com.hhub.security.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/users")
public class SecurityController {

    @RequestMapping(method= RequestMethod.GET, path="/create" )
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public String testRoute(){
        try {
            return "testRoute";
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }
}
