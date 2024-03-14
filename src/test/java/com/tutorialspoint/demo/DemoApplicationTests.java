package com.tutorialspoint.demo;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	protected Logger logger = LoggerFactory.getLogger(this.getClass());

	@Test
	void contextLoads() {
	}

	@Test
	void sandboxTests(){

		String msisdn = "078   066   55 59";

		msisdn = msisdn.replaceAll("\\s", "");

		logger.info("Cleaned msisdn " + msisdn);
	}

}
