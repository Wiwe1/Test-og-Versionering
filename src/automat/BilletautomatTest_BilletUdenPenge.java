package automat;

import static org.junit.Assert.*;

import org.junit.Test;

public class BilletautomatTest_BilletUdenPenge {

	@Test
	public void test() {
		
		Billetautomat automat = new Billetautomat();
		int antalFejl = 0;
		int retur;
		
		retur = automat.getBilletpris();
		
		if (retur != 10) {
			System.out.println("FEJL, getBilletpris() != 10");
		}

		System.out.println("*** Tjek af salg af en billet");
		automat.indsætPenge(-10);
		automat.udskrivBillet(); // Udskriver en billet selvom balacen er 0kr. 
		retur = automat.returpenge(); // Giver en et negativ beløb tilbage
		assertFalse(retur <0);
		
		
		
		
	}

}
