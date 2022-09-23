package com.genspark.RESTfulAPITest1.Service;

import com.genspark.RESTfulAPITest1.Entity.Beverages;
import java.util.List;

public interface MyService {
    List<Beverages> getBeverages();
    Beverages getBeverageWithName(String drink);
    Beverages addBeverage(Beverages beverages);
    Beverages setBeverage(Beverages beverages);
    String removeBeverage(String drink);

}
