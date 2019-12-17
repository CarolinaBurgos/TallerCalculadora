package MockitoCalculadora;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;
import org.junit.Test;

public class MultiplicacionTest {
	

	@Test
	public void test() {
		Multiplicacion m = new Multiplicacion();
		
		Suma sumaMock1 = spy(Suma.class);
		m.setSuma(sumaMock1);
		
		when(sumaMock1.suma(2, 3)).thenReturn(6); // sumaMock will get 6 as result when calling suma(2,3)
		assertEquals("2 x 3 must be 6", 6, m.multiplicacion(2, 3));
		verify(sumaMock1, atLeastOnce()).suma(any(int.class), any(int.class)); //Ensure that suma(2,3) is at least called once.
		
		when(sumaMock1.suma(2,-3)).thenReturn(-6); // sumaMock will get -6 as result when calling suma(2,-3)
		assertEquals("2 x -3 must be -6", -6, m.multiplicacion(2, -3));
		verify(sumaMock1, atLeastOnce()).suma(any(int.class), any(int.class)); //Ensure that suma(2,-3) is at least called once.
		
		when(sumaMock1.suma(2,0)).thenReturn(0); // sumaMock will get -6 as result when calling suma(2,0)
		assertEquals("2 x 0 must be 0", 0, m.multiplicacion(2, 0));
		verify(sumaMock1, atLeastOnce()).suma(any(int.class), any(int.class)); //Ensure that suma(2,0) is at least called once.
	}
	
	@Test
	public void testIntegracionSuma() {
		Multiplicacion m = new Multiplicacion();
		
		Suma suma = new Suma();
		m.setSuma(suma);
		
		assertEquals("2 x 3 must be 6", 6, m.multiplicacion(2, 3));
		assertEquals("2 x -3 must be -6", -6, m.multiplicacion(2, -3));
		assertEquals("2 x 0 must be 0", 0, m.multiplicacion(2, 0));	
	}

}
