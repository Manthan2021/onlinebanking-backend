package com.coforge.project.obs.repo;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Date;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringRunner;

import com.coforge.project.obs.controller.LoginRestController;
import com.coforge.project.obs.model.Account;
import com.coforge.project.obs.model.Address;
import com.coforge.project.obs.model.User;
import com.coforge.project.obs.repository.UserRepository;

@RunWith(SpringRunner.class)
public class LoginTestImpl {

	@InjectMocks
	private LoginRestController lrc;
	
	@Mock
	private UserRepository uRepo;
	
	@Before
    public void setUp() {
	Address a=new Address("","","","",0);
	 Date date = new Date();
	Account acc=new Account("8318404573@falcon","8318404573");
	User v=new User();
	v.setId(2L);
	v.setEmail("x@gmail.com");
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
	
//	@Test
//	void gettheId() {
//		
//		
//		String mail="x@gmail.com";
//		String expectedResult="8318404573@falcon";
//		
//		assertThat(LoginRestController.getTheId()).isEqualTo(expectedResult);
//		
//	}
	
	
}
