package com.knewhow.consumer;

import com.knewhow.consumer.service.UserService;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ConsumerApplicationTests {

	@Autowired
	UserService userService;
	
	@Test
	void TicketDubboTest() {
		System.out.println(userService.useTicket());
	}

}
