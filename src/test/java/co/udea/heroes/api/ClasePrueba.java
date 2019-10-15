package co.udea.heroes.api;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ClasePrueba {
	
	@Test
	public void testSuma() {
		int suma = 3 + 2;
		
		Assert.assertEquals(5, suma);
		
	}
	
	@Test
	public void testSumaError() {
		int suma = 3 + 30;
		
		Assert.assertEquals(5, suma);
		
	}
	

}
