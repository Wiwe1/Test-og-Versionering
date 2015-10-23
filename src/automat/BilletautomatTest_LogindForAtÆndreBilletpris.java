package automat;

import static org.junit.Assert.*;

import org.junit.Test;

public class BilletautomatTest_LogindForAtÆndreBilletpris {

	@Test
	public void test() {
	
		
		java.util.Scanner tastatur = new java.util.Scanner(System.in);
		Billetautomat automat = new Billetautomat();

		int antalFejl = 0;
		int retur;

		automat.setBilletpris(20);
		retur = automat.getBilletpris();
		assertTrue(retur == 20);
		
		
		
		System.out.println("Der blev fundet " + antalFejl + " fejl i automaten");
		if (antalFejl == 0) {
			System.out.println("Automaten er fejlfri, HURRA!!!");
		} else {
			System.out.println("Automaten har fejl, ØV!!!");
		}
		
		assertEquals(20,automat.getBilletpris());
		
	}

}
