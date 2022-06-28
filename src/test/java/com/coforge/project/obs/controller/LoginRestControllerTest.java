package com.coforge.project.obs.controller;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.coforge.project.obs.exception.ResourceNotFoundException;
import com.coforge.project.obs.model.Account;
import com.coforge.project.obs.model.Address;
import com.coforge.project.obs.model.User;
import com.coforge.project.obs.repository.UserRepository;

@SpringBootTest
class LoginRestControllerTest {

	@Autowired
	private UserRepository uRepo;
	
	private LoginRestController loginRestController;
	
	@BeforeEach
	void setUp() {
		this.loginRestController=new LoginRestController(uRepo);
	}
	
	
	@Test
	void testLoginDealer() throws ResourceNotFoundException {
		User v=new User();
	    v.setEmail("y@gmail.com");
	    v.setPassword("123");
	
	}

	@Test
	void testGettheId() {
		String mail="x@gmail.com";
		String expectedResult="8318404573@falcon";
		String actualResult=loginRestController.gettheId(mail);
		assertThat(actualResult).isEqualTo(expectedResult);
	}

	@Test
	void testGettheName() {
		String mail="x@gmail.com";
		String expectedResult="x x";
		String actualResult=loginRestController.gettheName(mail);
		assertThat(actualResult).isEqualTo(expectedResult);
	}

	@Test
	void testCheckAccount() {
		String uid="8318404573@falcon";
		Boolean actualResult=loginRestController.checkAccount(uid);
        assertThat(actualResult).isTrue();		
		
	}

}
