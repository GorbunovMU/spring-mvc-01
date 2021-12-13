package com.luxoft.springmvc01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

@SpringBootTest (webEnvironment =
		SpringBootTest.WebEnvironment.RANDOM_PORT)
class SpringMvc01ApplicationTests {

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	void contextLoads() {
	}

	@Test
	public void exampleTest() {
		String body = this.restTemplate.getForObject("/",
				String.class);
		Assertions.assertTrue(body.contains("Hello World"));
	}

}
