/**
 * 
 */
package libs;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Virginia
 *
 */
class FuncionesTest {
	
	private static Funciones funciones;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		funciones= new Funciones();
		System.out.println("Empezando tests...");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Ejecutando test");
	}
	
	@Test
	void devuelveCentral() {
		assertEquals(2, funciones.devuelveCentral(1, 2, 3));
		assertEquals(5, funciones.devuelveCentral(1, 5, 9));
		
	}
	
	@Test
	void esBisiesto() {
		assertTrue(funciones.esBisiesto(2000));
		assertFalse(funciones.esBisiesto(2001));
			
	}
	
	@Test
	void esCapicúa() {
		int v[] = {5,2,1,5,2};
		int correcto[]= {2,5,1,5,2};
	   assertArrayEquals( correcto,funciones.esCapicua(v));
	  
	}
	@Test
	void sumaVectores() {
		int v[]= {1,2,3};
		int v2[]= {4,6,8};
		int suma_vectores[]= {5,8,11};
		
		assertArrayEquals(suma_vectores,funciones.suma_vectores(v, v2));
		
		//assertThrows(ArithmeticException.class, () -> funciones.suma_vectores(v, v2));
		
	}

	private void assertArrayEquals(int[] suma, int[] suma_vectores) {
		// TODO Esbozo de método generado automáticamente
		
	}

	private void assertArrayEquals(int[] correcto, boolean b) {
		// TODO Esbozo de método generado automáticamente
		
	}

	@Test
	void test() {
		
	}

}
