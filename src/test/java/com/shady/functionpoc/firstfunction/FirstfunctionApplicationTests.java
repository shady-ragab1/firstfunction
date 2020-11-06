package com.shady.functionpoc.firstfunction;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.function.Function;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class FirstfunctionApplicationTests {


	@Autowired
	private Function<String, String> uppercase;

	@Test
	public void testUppercase() {
		String output = this.uppercase.apply("foobar");
		assertThat(output).isEqualTo("FOOBAR");
	}

}
