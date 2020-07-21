package com.epam.EpamTask;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DeleteOccurance {

	/*
	 * 1. a is present in first place
	 * 2. a is present in second place
	 * 3. a is present at both at first and second place
	 * 4. a is not present at 1st 2 places
	 * 5. if input string length == 0
	 * 6. if input string is single char 'A'
	 * 7. if input string is single char not 'A'
	 * 8. if input string is 'AA'
	 */
	DeleteOccurances delete;
	
	@BeforeEach
	void setUp()
	{	
		delete = new DeleteOccurances();
	}
	@Test
	void present1Place() {
		assertEquals("BCD",delete.removeElement("ABCD"));
	}
	
	@Test
	void present2Place() {
		assertEquals("BCD",delete.removeElement("BACD"));
	}
	
	@Test
	void present12Place() {
		assertEquals("CD",delete.removeElement("AACD"));
	}
	
	@Test
	void presentNoPlace() {
		assertEquals("BBBBCD",delete.removeElement("BBBBCD"));
	}
	
	@Test
	void emptyString() {
		assertEquals("",delete.removeElement(""));
	}
	
	@Test
	void SingleCharA() {
		assertEquals("",delete.removeElement("A"));
	}
	
	@Test
	void SingleCharNotA() {
		assertEquals("B",delete.removeElement("B"));
	}
	
	@Test
	void CharAA() {
		assertEquals("",delete.removeElement("AA"));
	}
	
}
