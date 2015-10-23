package automat;

import static org.junit.Assert.*;

import org.junit.Test;

public class BilletautomatTest_ÆndreBilletPris {

	@Test
	public void test() {
		
		Billetautomat automat = new Billetautomat();

		int antalFejl = 0;
		int retur;
		
		automat.setBilletpris(20); // burde ikke være muligt at ændre billet prisen
		
		retur = automat.getBilletpris();
		
		assertFalse(retur >10);
		
	
		
		
		
		
	}

}
