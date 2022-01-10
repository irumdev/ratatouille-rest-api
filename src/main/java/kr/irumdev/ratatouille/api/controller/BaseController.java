package kr.irumdev.ratatouille.api.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController implements ErrorController {

    @GetMapping("/")
    public String root(){
        return "index";
    }

    @RequestMapping("/error")
    public String error() {
        return "error";
    }
}
