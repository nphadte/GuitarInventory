package com.example.demo;

import com.example.demo.model.Location;
import com.example.demo.repository.LocationJpaRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
	
	@Autowired
	private LocationJpaRepository ljpar ;
	
	@Test
	public void contextLoads() {
		
		
		
		Location location = new Location();
		location.setCountry("Canada");
		location.setState("British Columbia");

		//location = ljpar.saveAndFlush(location);
		
		//ljpar.saveAndFlush();
		
	}

}
