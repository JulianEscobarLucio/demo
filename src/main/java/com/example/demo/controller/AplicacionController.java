package com.example.demo.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.*;


@Controller
@SpringBootApplication
public class AplicacionController {

    @RequestMapping("/")
    @ResponseBody
    String home() {
      return "Hello World!";
    }
}
