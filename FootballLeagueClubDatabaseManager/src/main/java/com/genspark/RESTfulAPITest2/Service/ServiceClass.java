package com.genspark.RESTfulAPITest2.Service;

import com.genspark.RESTfulAPITest2.Da.Dao;
import com.genspark.RESTfulAPITest2.Entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceClass implements MyService {

    @Autowired
    private Dao dao;


    @Override
    public List<Clubs> getClubs() {
        return this.dao.findAll();
    }

    @Override
    public Clubs getClubFromName(String name){
        Optional<Clubs> c = this.dao.findById(name);
        Clubs b;
        if(c.isPresent()) {
            b = c.get();
        } else {
            throw new RuntimeException("ERROR: club " + name  +  " not found in league!");
        }
        return b;
    }

    @Override
    public Clubs setClub(Clubs club){
        return this.dao.save(club);
    }


    @Override
    public Clubs addClub(Clubs club) {
        return  this.dao.save(club);
    }

    @Override
    public String removeClub(String name) {
        this.dao.deleteById(name);
        return name + " has been deleted from the league database!";
    }


}
