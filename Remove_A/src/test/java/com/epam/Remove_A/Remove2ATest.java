package com.epam.Remove_A;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Remove2ATest {
	/*TODO list for my feature
	 * 1.  ABCD   :  BCD
	 * 2.  AACD   :  CD
	 * 3.  BACD   :  BCD
	 * 4.  BBAA   :  BBAA
	 * 5.  AABAA  :  BAA
	 */
	@Test
	void test1() {
		Remove2A_s remove_2_A=new Remove2A_s(); 
		String actual = remove_2_A.remove("ABCD");
		assertEquals("BCD",actual);		
	}
	@Test
	void test2() {
		Remove2A_s remove_2_A=new Remove2A_s(); 
		String actual = remove_2_A.remove("AACD");
		assertEquals("CD",actual);		
	}
	@Test
	void test3() {
		Remove2A_s remove_2_A=new Remove2A_s(); 
		String actual = remove_2_A.remove("BACD");
		assertEquals("BCD",actual);		
	}
	@Test
	void test4() {
		Remove2A_s remove_2_A=new Remove2A_s(); 
		String actual = remove_2_A.remove("BBAA");
		assertEquals("BBAA",actual);		
	}

	@Test
	void test5() {
		Remove2A_s remove_2_A=new Remove2A_s(); 
		String actual = remove_2_A.remove("AABAA");
		assertEquals("BAA",actual);		
	}
}
