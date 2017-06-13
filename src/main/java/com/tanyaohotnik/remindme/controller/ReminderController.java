package com.tanyaohotnik.remindme.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by TanyaOhontik on 13.06.2017.
 */
@Controller
@RequestMapping("/reminder")
public class ReminderController {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @ResponseBody
    public String sayHello(ModelMap model){
        return "Hello";
    }
}
