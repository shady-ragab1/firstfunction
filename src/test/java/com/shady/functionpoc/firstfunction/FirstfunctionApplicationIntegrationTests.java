package com.shady.functionpoc.firstfunction;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import java.net.URI;
import java.util.function.Function;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment =  SpringBootTest.WebEnvironment.RANDOM_PORT)
class FirstfunctionApplicationIntegrationTests {


	@Autowired
	private TestRestTemplate rest;

	@Test
	public void test() throws Exception {

		String resposne =  rest.postForObject(new URI("/uppercase"),"hello",String.class);


		System.out.println(resposne);
	}

}
