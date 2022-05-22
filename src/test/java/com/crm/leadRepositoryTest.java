package com.crm;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.crm.entities.lead;
import com.crm.repository.*;

//whole unit testing is db testing 


@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class leadRepositoryTest {

	@Autowired
	private leadRepository leadRepo;
	
	
	@Test
	public void saveOneLead() {
		lead l = new lead("rajveer","karvekar","rajveer@gmail.com","radio","5588996633");
		leadRepo.save(l);
	}
}
