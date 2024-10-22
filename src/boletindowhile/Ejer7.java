package boletindowhile;

import java.util.Scanner;

public class Ejer7 {
	public static void main(String[] args) {

		// declarar variable para almacenar el num1
		int num1;

		// declarar variable para almacenar el num2
		int num2;

		// declarar variable para almacenar la suma
		int suma;

		// declarar variable para almacenar la resta
		int resta;

		// declarar variable para almacenar la multiplicacion
		int producto;

		// declarar variable para almacenar la division
		int division;

		// declarar variable para almacenar opción elegida
		String opcion;

		// crear scanner
		Scanner sc = new Scanner(System.in);

		System.out.println("SUMA. RESTA, MULTIPLICACIÓN O DIVISIÓN");

		
		// crear bucle do-while
		do {
			// pedir num1 a usuario
			System.out.println("\nIntroduzca un nº: ");

			// leer nº introducido por usuario
			num1 = sc.nextInt();

			// pedir num1 a usuario
			System.out.println("Introduzca otro nº: ");

			// leer nº introducido por usuario
			num2 = sc.nextInt();

			// mostrar menú pantalla
			System.out.println("\nELIJA UNA OPCIÓN:");
			System.out.println("A. SUMAR NºS");
			System.out.println("B. RESTAR NºS");
			System.out.println("C. MULTIPLICAR NºS");
			System.out.println("D. DIVIDIR NºS");
			System.out.println("E. SALIR");

			// pedir opcion a usuario
			System.out.println("\nElija una opción: ");

			// leer opcion introducida por usuario
			opcion = sc.next();

			// definir condicional switch
			switch (opcion.toUpperCase()) {
			case "A" -> { // entra si opcion es 'A' o 'a'
				
				// calcula el valor de la suma
				suma = num1 + num2;
				
				// imprime resultado de la suma
				System.out.println("\nLa suma de sus numero es " + suma);
			}

			case "B" -> { // entra si opcion es 'B' o 'b'
				
				// calcula el valor de la resta
				resta = num1 - num2;
				
				// imprime resultado de la resta
				System.out.println("\nLa resta de sus numeros es " + resta);
			}

			case "C" -> { // entra si opcion es 'C' o 'c'
				
				// calcula el valor de la multiplicacion
				producto = num1 * num2;
				
				// imprime resultado de la multiplicacion
				System.out.println("\nLa multiplicacion de sus numeros es " + producto);
			}

			case "D" -> { // entra si opcion es 'D' o 'd'
				
				// calcula el valor de la division
				division = num1 / num2;
				
				// imprime resultado de la division
				System.out.println("\nLa division de sus numeros es " + division);
			}

			case "E" -> { // entra si opcion es 'D' o 'd'
				
				// sale del programa
				System.out.println("\nSaliendo del programa ...");
			}

			// entra si no coincide con ninguna opcion del menu
			default -> System.out.println("\nSin coincidencias.");

			}

		} while (!opcion.equals("E"));

		// fin del programa
		System.out.println("\nEl programa se ha finalizado con éxito.");
		
		// cerrar scanner
		sc.close();
	}
}