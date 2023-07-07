package com.amatta.task;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TaskApplicationTests {

	@Test
	void contextLoads() {
        String hello = "hello";
        Assertions.assertThat(hello).isInstanceOf(String.class);
	}

}
