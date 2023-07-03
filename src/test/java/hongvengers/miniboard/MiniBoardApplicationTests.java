package hongvengers.miniboard;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MiniBoardApplicationTests {

	@Test
	void contextLoads() {
        String hello = "hello";
        Assertions.assertThat(hello).isInstanceOf(String.class);
	}

}
