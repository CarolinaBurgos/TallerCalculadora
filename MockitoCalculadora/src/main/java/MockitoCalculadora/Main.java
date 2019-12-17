package MockitoCalculadora;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Menu menu = new Menu();
		while (true) {
			System.out.println("\n### Calculadora Tonta ###\n");
			System.out.println("1. Sumar");
			System.out.println("2. Multiplicar");
			
			Scanner scn = new Scanner(System.in);
			int opcion;
			while (true) {
				try {
					System.out.print("\nIngrese una opción: ");
					opcion = scn.nextInt();
					System.out.println(opcion);
					if (opcion >=1 && opcion <= 2) {
						break;
					} else {
						System.out.println("La opción no existe!");
					}
				} catch (Exception e) {
					System.out.println("Entrada incorrecta! Ingrese una de las opciones!!");
					scn.nextLine();
				}
			}
			
			int num_uno;
			while (true) {
				try {
					System.out.print("\nIngrese el primer número: ");
					num_uno = scn.nextInt();
					break;
				} catch (Exception e) {
					System.out.println("Entrada incorrecta! Sólo se aceptan enteros!!");
					scn.nextLine();
				}
			}
			
			int num_dos;
			while (true) {
				try {
					System.out.print("\nIngrese el segundo número: ");
					num_dos = scn.nextInt();
					break;
				} catch (Exception e) {
					System.out.println("Entrada incorrecta! Sólo se aceptan enteros!!");
					scn.nextLine();
				}
			}
			
			String result = menu.calcularOpcion(opcion, num_uno, num_dos);	
			System.out.println(result);
		}
	}

}
