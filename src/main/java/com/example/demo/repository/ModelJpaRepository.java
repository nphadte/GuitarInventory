package com.example.demo.repository;

import com.example.demo.model.Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface  ModelJpaRepository extends JpaRepository<Model, Long> {

    public List<Model>  findAll();

    List<Model> findAllModelsByType(@Param("name") String name);

}
