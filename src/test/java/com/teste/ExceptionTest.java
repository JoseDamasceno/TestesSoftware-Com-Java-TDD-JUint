package com.teste;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;


public class ExceptionTest {
	
	@Test(expected =  IndexOutOfBoundsException.class)
	public void empty () {
	List<String> lista =	new ArrayList<String>();
	lista.get(0);
	}
	

}
