package com.example.demo.repository;

import com.example.demo.model.Manufacturer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface  ManufacturerJpaRepository extends JpaRepository<Manufacturer, Long> {

    List<Manufacturer> findAll();

    List<Manufacturer> findByActiveTrue();

    List<Manufacturer> findByActiveFalse();

    List<Manufacturer> getAllThatSellAcoustics(String name);

}