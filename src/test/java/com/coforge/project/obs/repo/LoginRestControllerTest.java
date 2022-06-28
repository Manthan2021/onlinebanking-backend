package com.coforge.project.obs.repo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.coforge.project.obs.controller.LoginRestController;
import com.coforge.project.obs.exception.ResourceNotFoundException;
import com.coforge.project.obs.model.Account;
import com.coforge.project.obs.model.Address;
import com.coforge.project.obs.model.User;
import com.coforge.project.obs.repository.UserRepository;

@SpringBootTest
class LoginRestControllerTest {

	@Mock
	private UserRepository uRepo;
	
	@BeforeEach
	void setUp() throws Exception {
		Address a=new Address("","","","",0);
		 Date date = new Date();
		Account acc=new Account("8318404573@falcon","8318404573");
		User u=new User(1L,"x@gmail.com","x","x","x",date,"123123","123123","123","8318404573",a,acc);
		User v=new User();
		v.setId(2L);
		v.setEmail("y@gmail.com");
		v.setFirstname("y");
		v.setLastname("y");
		v.setFathername("y");
		v.setDob(date);
		v.setAadharnumber("1234");
		v.setPannumber("1234");
		v.setPassword("123");
	    v.setMobilenumber("22222");	
		v.setAddress(a);
		v.setAccount(acc);
	
	}
	
	 
	@BeforeAll 
	public void initMocks() {
	       MockitoAnnotations.initMocks(this);
	   }

	@AfterEach
	void tearDown() throws Exception {
	}

	
	

	
	@Test
	void gettheId() {
		
		LoginRestController lrc=new LoginRestController();
		String mail="x@gmail.com";
		String expectedResult="8318404573@falcon";
		String actualResult=lrc.gettheId(mail);
		assertThat(actualResult).isEqualTo(expectedResult);
		
	}
	
	@Test
	void loginDealer() throws ResourceNotFoundException {
		//Boolean expectedResult=true;
		Address a=new Address("","","","",0);
		 Date date = new Date();
		Account acc=new Account("8318404573@falcon","8318404573");
		User v=new User();
		v.setId(2L);
		v.setEmail("y@gmail.com");
		v.setFirstname("y");
		v.setLastname("y");
		v.setFathername("y");
		v.setDob(date);
		v.setAadharnumber("1234");
		v.setPannumber("1234");
		v.setPassword("123");
	    v.setMobilenumber("22222");	
		v.setAddress(a);
		v.setAccount(acc);
		
		LoginRestController lrc=new LoginRestController(uRepo);
		Boolean actualResult=lrc.loginDealer(v);
		assertThat(actualResult).isTrue();
	}
	
	
}
