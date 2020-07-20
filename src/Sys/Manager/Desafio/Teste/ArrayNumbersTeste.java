package Sys.Manager.Desafio.Teste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Sys.Manager.Desafio.Model.Numbers;

/* 
  
   Teste Unit�rio usando Junity
   @autor Victor Pinho 
   
   */
public class ArrayNumbersTeste {

	@Test
	public void testCountNumbers() {
		
		/* MONTAGEM DO CEN�RIO */
		int[] array = { 1, 7, 3, 5 };
		int lessThan = 4;

		Numbers numbers = new Numbers(array, lessThan);
		
		/* VERIFICA��O */
		assertEquals(2, numbers.countNumbers(array, lessThan));
	}

}
