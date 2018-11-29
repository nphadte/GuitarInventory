package com.example.demo;

import com.example.demo.model.Location;
import com.example.demo.repository.LocationJpaRepository;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import java.util.List;

public class LocationRepositoryTests {

    private final  Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private LocationJpaRepository locjparep;

    @Test
    public  void   testLocation(){
            //Location  loc = locjparep.findAll()
            //List<Location> locs =  locjparep.findAll();
            //for ( Location loc : locs ){
            //    LOGGER.info(" The State is : " + loc.getState().toString() );
            //}

            LOGGER.debug(" do stuff for debugging ");
            LOGGER.info(" do stuff for info ");
            LOGGER.warn(" do stuff for warn ");
            LOGGER.error(" do stuff for error ");
        }
    }
