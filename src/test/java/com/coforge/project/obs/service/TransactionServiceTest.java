package com.coforge.project.obs.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import com.coforge.project.obs.model.Transact;
import com.coforge.project.obs.repository.TransactionRepository;

@ExtendWith(MockitoExtension.class)
class TransactionServiceTest {

	@Mock
	private TransactionRepository tRepo;
	
	private TransactionService tService;
	
	@BeforeEach
	void setUp() {
		this.tService=new TransactionService(this.tRepo);
	}
	

	@Test
	void testGetalltxn() {
//		Date date=new Date();
//	    Transact t=new Transact("8318404573@falcon",date,"ADMIN",0L,0L,0L);
//	    List<Transact> txn=new ArrayList();
	    //txn.add(t);
		tService.getalltxn("8318404573@falcon");
		verify(tRepo).getAllTxn("8318404573@falcon");
	}

}
