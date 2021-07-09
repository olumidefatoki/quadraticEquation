package com.agriarche.kasuwabackend;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.security.Provider;

@SpringBootTest
class KasuwaBackendApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void VerifyQuadratic(){
		QuadraticService service = new QuadraticService();
		QuadraticRequest request = new QuadraticRequest();
		request.setA(4);
		request.setB(2);
		request.setC(2);
		QuadraticAnswer solve = service.solve(request);
		Assertions.assertNotEquals(solve.getFirstAnswer(),"2");
		Assertions.assertNotEquals(solve.getFirstAnswer(),"2");
	}

}
