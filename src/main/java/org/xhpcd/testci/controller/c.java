package org.xhpcd.testci.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class c {
    @RequestMapping("/a")
    public String test(){
        return "nihao";
    }

}
