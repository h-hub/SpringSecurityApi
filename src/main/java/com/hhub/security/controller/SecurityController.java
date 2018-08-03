package com.hhub.security.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/users")
public class SecurityController {

    @RequestMapping(method = RequestMethod.GET, value = "/count")
    @ResponseBody
    @ResponseStatus(value = HttpStatus.OK)
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
