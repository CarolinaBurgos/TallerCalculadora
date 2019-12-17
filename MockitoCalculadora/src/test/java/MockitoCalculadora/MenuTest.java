package MockitoCalculadora;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class MenuTest {

	@Test
	public void test() {
		Multiplicacion multiplicacionMock = spy(Multiplicacion.class);
		Suma sumaMock = spy(Suma.class);
		
		Menu m = new Menu();
		m.setSuma(sumaMock);
		m.setMultiplicacion(multiplicacionMock);
		
		when(sumaMock.suma(any(int.class), any(int.class))).thenReturn(5); // sumaMock will get 5 as result when calling suma(int,int)
		assertEquals("2 + 3 must be 5", "2 + 3 = 5", m.calcularOpcion(1, 2, 3));
		
		when(sumaMock.suma(any(int.class), any(int.class))).thenReturn(-1); // sumaMock will get -1 as result when calling suma(int,int)
		assertEquals("2 + -3 must be -1", "2 + -3 = -1", m.calcularOpcion(1, 2, -3));
		
		when(multiplicacionMock.multiplicacion(any(int.class), any(int.class))).thenReturn(6); // multiplicacionMock will get 6 as result when calling multiplicacion(int,int)
		assertEquals("2 x 3 must be 6", "2 x 3 = 6", m.calcularOpcion(2, 2, 3));
		
		when(multiplicacionMock.multiplicacion(any(int.class), any(int.class))).thenReturn(-6); // multiplicacionMock will get -6 as result when calling multiplicacion(int,int)
		assertEquals("2 x -3 must be -6", "2 x -3 = -6", m.calcularOpcion(2, 2, -3));

		when(multiplicacionMock.multiplicacion(any(int.class), any(int.class))).thenReturn(0); // multiplicacionMock will get 0 as result when calling multiplicacion(int,int)
		assertEquals("2 x 0 must be -6", "2 x 0 = 0", m.calcularOpcion(2, 2, 0));
		
		verify(sumaMock, atLeastOnce()).suma(any(int.class), any(int.class)); //Ensure that suma(int,int) is at least called once.
		verify(multiplicacionMock, atLeastOnce()).multiplicacion(any(int.class), any(int.class)); //Ensure that multiplicacion(int,int) is at least called once.
	}
	
	@Test
	public void testIntegracionSumaMultiplicacion() {
		Menu m = new Menu();
		
		assertEquals("2 + 3 must be 5", "2 + 3 = 5", m.calcularOpcion(1, 2, 3));
		assertEquals("2 + -3 must be -1", "2 + -3 = -1", m.calcularOpcion(1, 2, -3));
		assertEquals("2 x 3 must be 6", "2 x 3 = 6", m.calcularOpcion(2, 2, 3));
		assertEquals("2 x -3 must be -6", "2 x -3 = -6", m.calcularOpcion(2, 2, -3));
		assertEquals("2 x 0 must be 0", "2 x 0 = 0", m.calcularOpcion(2, 2, 0));
	}

}
