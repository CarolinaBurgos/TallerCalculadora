package MockitoCalculadora;

public class Menu {
	Suma suma = new Suma();
	Multiplicacion multiplicacion = new Multiplicacion();
	
	void setSuma(Suma suma) {
		this.suma = suma;
	}
	
	void setMultiplicacion(Multiplicacion multiplicacion) {
		this.multiplicacion = multiplicacion;
	}

	public String calcularOpcion(int opcion, int num_uno, int num_dos) {
		if (opcion == 1) {
			return num_uno + " + " + num_dos + " = " + suma.suma(num_uno, num_dos);
		} else if (opcion == 2) {
			return num_uno + " x " + num_dos + " = " + multiplicacion.multiplicacion(num_uno, num_dos);
		}
		return "";
	}
}
