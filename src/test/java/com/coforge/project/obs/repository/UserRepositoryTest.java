package com.coforge.project.obs.repository;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.coforge.project.obs.model.Account;

@SpringBootTest
class UserRepositoryTest {

	@Autowired
	private UserRepository uRepo;
	
	@Test
	void testCheckAccount() {
		
		Account acc=new Account("8318404573","8318404573@falcon");
		List<Account> expectedResult=new ArrayList();
		expectedResult.add(acc);
		List<Account> list=uRepo.checkAccount("8318404573@falcon");
		assertThat(list.get(0).getMobilenumber()).isEqualTo(expectedResult.get(0).getMobilenumber());
		
	}

}
