package com.genspark.RESTfulAPITest2.Controller;

import com.genspark.RESTfulAPITest2.Entity.Clubs;
import com.genspark.RESTfulAPITest2.Service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    private MyService service;


    @GetMapping("/")
    public String leagueHome(){
        return "<HTML><H1> WELCOME TO THE FOOTBALL LEAGUE CLUB DATABASE </H1></HTML>";
    }

    @GetMapping("/clubs")
    public List<Clubs> getClubs() {
        return this.service.getClubs();
    }

    @GetMapping("/clubs/{name}")
    public Clubs getSpecificClub(@PathVariable String name) {
        return this.service.getClubFromName(name);
    }

    @PutMapping("/clubs")
    public Clubs setClub(@RequestBody Clubs Clubs) {
        return this.service.setClub(Clubs);
    }

    @PostMapping("/clubs")
    public Clubs addClub(@RequestBody Clubs Clubs) {
        return this.service.addClub(Clubs);
    }

    @DeleteMapping("/clubs/{name}")
    public String removeClub(@PathVariable String name) {
        return this.service.removeClub(name);
    }



}
