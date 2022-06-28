package com.coforge.project.obs.repository;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.coforge.project.obs.model.Transact;

@SpringBootTest
class TransactionRepositoryTest {

	@Autowired
	private TransactionRepository tRepo;
	
	@Test
	void testGetAllTxn() {
		Date date=new Date();
    Transact t=new Transact("8318404573@falcon",date,"ADMIN",0L,0L,0L);
    List<Transact> txn=new ArrayList();
    txn.add(t);
    List<Transact> list=tRepo.getAllTxn("8318404573@falcon");
    assertThat(list.get(0).getReceiverid()).isEqualTo(txn.get(0).getReceiverid());
		
	}

}
