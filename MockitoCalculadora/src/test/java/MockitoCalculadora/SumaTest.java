package MockitoCalculadora;

import static org.junit.Assert.*;
import org.junit.Test;

public class SumaTest {

	@Test
	public void test() {
		Suma s = new Suma();
		s.suma(1,1);		
		s.suma(4,-1);
		
	}

}
