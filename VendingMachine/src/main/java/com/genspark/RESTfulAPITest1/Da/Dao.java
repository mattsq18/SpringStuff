package com.genspark.RESTfulAPITest1.Da;
import com.genspark.RESTfulAPITest1.Entity.Beverages;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Dao extends JpaRepository<Beverages,String> {

}
