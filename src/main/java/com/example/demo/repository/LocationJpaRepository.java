package com.example.demo.repository;

import com.example.demo.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  LocationJpaRepository extends JpaRepository<Location, Long> {

}
