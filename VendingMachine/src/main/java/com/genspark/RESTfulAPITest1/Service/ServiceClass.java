package com.genspark.RESTfulAPITest1.Service;

import com.genspark.RESTfulAPITest1.Da.Dao;
import com.genspark.RESTfulAPITest1.Entity.Beverages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceClass implements MyService {

    @Autowired
    private Dao dao;


    @Override
    public List<Beverages> getBeverages() {
        return this.dao.findAll();
    }

    @Override
    public Beverages getBeverageWithName(String drink){
        Optional<Beverages> b = this.dao.findById(drink);
        Beverages d;
        if(b.isPresent()) {
            d = b.get();
        } else {
            throw new RuntimeException("Beverage " + drink  +  " not found!");
        }
        return d;
    }

    @Override
    public Beverages setBeverage(Beverages beverages){
        return this.dao.save(beverages);
    }


    @Override
    public Beverages addBeverage(Beverages beverages) {
        return  this.dao.save(beverages);
    }

    @Override
    public String removeBeverage(String drink) {
        this.dao.deleteById(drink);
        return "Beverage " + drink + " has been deleted from the database!";
    }


}
