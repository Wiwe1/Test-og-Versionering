package automat;

import static org.junit.Assert.*;

import org.junit.Test;

public class BilletautomatTest_NegativBilletPris {

	@Test
	public void testGetBilletpris() {
	
		java.util.Scanner tastatur = new java.util.Scanner(System.in);
		Billetautomat automat = new Billetautomat();

		int antalFejl = 0;
		int retur;

		System.out.println();
		automat.montørLogin("1234");
		automat.setBilletpris(-10);
		retur = automat.getBilletpris();
		assertTrue(retur >0);
		
		System.out.println("Der blev fundet " + antalFejl + " fejl i automaten");
		if (antalFejl == 0) {
			System.out.println("Automaten er fejlfri, HURRA!!!");
		} else {
			System.out.println("Automaten har fejl, ØV!!!");
		
		}
		
		assertEquals(-10,automat.getBilletpris());
	
		
		
		
	}

}
