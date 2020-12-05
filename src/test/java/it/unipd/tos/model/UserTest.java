package it.unipd.tos.model;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class UserTest {

	private User user;

	@Before
	public void setup() {
		user = new User("Simone","DalMedico",22);
	}

	@Test
	public void getNomeTest() {
		assertEquals("Simone", user.getNome());
	}

	@Test
	public void getCognomeTest() {
		assertEquals("DalMedico", user.getCognome());
	}

	@Test
	public void getEtaTest() {
		assertEquals(22, user.getEta());
	}

	@Test
	public void invalidEtaTest() {
		boolean b = true;
		if(user.getEta()<0)
			b = false;
		assertEquals(true, b);
	}
}
