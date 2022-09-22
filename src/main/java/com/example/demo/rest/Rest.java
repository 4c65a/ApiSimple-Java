package com.example.demo.rest;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Rest {


    @GetMapping ("/name")
    public String nameSite(){
        return "Primer prueba";
    }

    @GetMapping ("/description")
    public String descriptionSite(){
        return "Primer code de una ApiRest con spring Boot";
    }
}
