package MockitoCalculadora;

import static org.junit.Assert.*;
import org.junit.Test;

public class SumaTest {

	@Test
	public void test() {
		Suma s = new Suma();
		assertEquals("1 + 1 must be 2", 2, s.suma(1, 1));
		assertEquals("4 + -1 must be 3", 3, s.suma(4, -1));
	}

}
