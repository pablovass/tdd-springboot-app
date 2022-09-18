package com.pablovass;

import com.intuit.karate.junit4.Karate;
import cucumber.api.CucumberOptions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;

@RunWith(Karate.class)
@CucumberOptions(features = "classpath:karate")
class ApplicationTests {

	@Test
	void contextLoads() {
	}

}
