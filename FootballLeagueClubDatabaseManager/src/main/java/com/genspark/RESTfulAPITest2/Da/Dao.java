package com.genspark.RESTfulAPITest2.Da;
import com.genspark.RESTfulAPITest2.Entity.Clubs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Dao extends JpaRepository<Clubs,String> {

}
