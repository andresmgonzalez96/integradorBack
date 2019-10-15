package co.udea.heroes.api;

import org.junit.Assert;
import org.junit.Test;



public class ClasePrueba {
	
	@Test
	public void testSuma() {
		int suma = 3 + 2;
		
		Assert.assertEquals(5, suma);
		
	}
	
	@Test
	public void testSumaError() {
		int suma = 3 + 3;
		
		Assert.assertEquals(5, suma);
		
	}
	

}
