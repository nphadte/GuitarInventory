package com.example.demo.repository;

import com.example.demo.model.Manufacturer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  ManufacturerJpaRepository extends JpaRepository<Manufacturer, Long> {

}
