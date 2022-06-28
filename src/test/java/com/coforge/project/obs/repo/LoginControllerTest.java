package com.coforge.project.obs.repo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.coforge.project.obs.controller.LoginRestController;
import com.coforge.project.obs.exception.ResourceNotFoundException;
import com.coforge.project.obs.model.Account;
import com.coforge.project.obs.model.Address;
import com.coforge.project.obs.model.User;
import com.coforge.project.obs.repository.UserRepository;

@RunWith(SpringRunner.class)
class LoginControllerTest {

	@Mock
	private UserRepository uRepo;
	
	@Before
	public void setUp() {
		
		
	}
	
	
	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	
	
	
	
}
