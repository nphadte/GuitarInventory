package com.example.demo.repository;

import com.example.demo.model.Model;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface  ModelJpaRepository extends JpaRepository<Model, Long> {

    public List<Model>  findAll();

}
