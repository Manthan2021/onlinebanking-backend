package com.coforge.project.obs.controller;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.coforge.project.obs.repository.TransactionRepository;
import com.coforge.project.obs.repository.UserRepository;
import com.coforge.project.obs.service.TransactionService;

@SpringBootTest
class TransactionControllerTest {
	
	@Mock
	private TransactionService tService;

	private TransactionController transactionController;
	
	@BeforeEach
	void setUp() {
		this.transactionController=new TransactionController(tService);
	}
	
	
	@Test
	void testGetAllTxn() {
		transactionController.getAllTxn("8318404573@falcon");
		verify(tService).getalltxn("8318404573@falcon");
		
	}

	@Test
	void testGetLastTxn() {
		transactionController.getLastTxn("8318404573@falcon");
		verify(tService).getlasttxn("8318404573@falcon");
	}

}
