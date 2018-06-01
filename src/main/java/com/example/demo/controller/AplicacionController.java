package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/")
public class AplicacionController {

    @RequestMapping("/saludo")
    @ResponseBody
    String home() {
      return "Hello World!";
    }
}
