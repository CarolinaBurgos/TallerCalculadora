package MockitoCalculadora;

public class Multiplicacion {
	private Suma suma;
	
	void setSuma(Suma suma) {
		this.suma = suma;
	}

	public int multiplicacion(int a, int b) {
		int producto = 0;
		
		if (b > 0) {
			for (int i = 0; i < b; i++) {
				producto = this.suma.suma(producto, a);
			}
		} else if (b < 0) {
			for (int i = 0; i > b; i--) {
				producto = this.suma.suma(producto, a);
			}
			producto *= -1;
		}
		
		return producto;
	}
}
