package com.example.demo.repository;

import com.example.demo.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface LocationJpaRepository extends JpaRepository<Location, Long> {

    public List<Location> findAll();

    public Optional<Location> findById(Long Id);

}