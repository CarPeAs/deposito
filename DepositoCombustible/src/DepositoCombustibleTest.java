import static org.junit.Assert.*;

import org.junit.Test;

public class DepositoCombustibleTest {
	
	
    DepositoCombustible tank = new DepositoCombustible(50.0,40.0);
	

    
    
	@Test
	public void testGetDepositoNivel() {
		System.out.println("Nivel: " + tank.getDepositoNivel());
	}

	@Test
	public void testGetDepositoMax() {
		System.out.println("MAX: " + tank.getDepositoMax());
	}
	
	@Test
	public void testFill() {
		tank.fill(10.0);
	}

	@Test
	public void testEstaLleno() {
		System.out.println("Lleno? : " + tank.estaLleno());
	}
	
	@Test
	public void testConsumir() {
		tank.consumir(15);
	}
	
	@Test
	public void testEstaVacio() {
		System.out.println("Vacio? : " + tank.estaVacio());
	}
	

	
}
