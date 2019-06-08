package com.example.demo.repository;

import com.example.demo.model.ModelType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface  ModelTypeJpaRepository extends JpaRepository<ModelType, Long> {

    public List<ModelType>  findAll();

}

