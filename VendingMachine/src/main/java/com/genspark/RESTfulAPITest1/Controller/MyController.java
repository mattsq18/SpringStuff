package com.genspark.RESTfulAPITest1.Controller;

import com.genspark.RESTfulAPITest1.Entity.Beverages;
import com.genspark.RESTfulAPITest1.Service.MyService;
import org.springframework.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    private MyService service;


    @GetMapping("/")
    public String home(){
        return "<HTML><H1> Hello! Welcome to the Spring Vending Machine</H1></HTML>";
    }

    @GetMapping("/drinks")
    public List<Beverages> getDrinks() {
        return this.service.getBeverages();
    }

    @GetMapping("/drinks/{name}")
    public Beverages getSpecificDrink(@PathVariable String name) {
        return this.service.getBeverageWithName(name);
    }

    @PutMapping("/drinks")
    public Beverages setDrink(@RequestBody Beverages beverages) {
        return this.service.setBeverage(beverages);
    }

    @PostMapping("/drinks")
    public Beverages addDrink(@RequestBody Beverages beverages) {
        return this.service.addBeverage(beverages);
    }

    @DeleteMapping("/drinks/{name}")
    public String removeDrink(@PathVariable String name) {
        return this.service.removeBeverage(name);
    }



}
