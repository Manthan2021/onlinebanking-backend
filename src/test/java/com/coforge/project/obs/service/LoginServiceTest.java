package com.coforge.project.obs.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.coforge.project.obs.repository.UserRepository;

@SpringBootTest
class LoginServiceTest {

	@Mock
	private UserRepository uRepo;
	
	
	private LoginService loginService;
	
	
	@BeforeEach
	void setUp() {
		this.loginService=new LoginService(this.uRepo);
	}
	
	
	@Test
	void testFindByEmail() {
	
	loginService.findByEmail("x@gmail.com");	
	verify(uRepo).findByEmail("x@gmail.com");
	}

}
