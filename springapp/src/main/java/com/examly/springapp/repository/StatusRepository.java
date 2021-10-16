package com.example.demo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.StatusModel;

@Repository
public interface StatusRepository extends JpaRepository<StatusModel,String> {
    

}