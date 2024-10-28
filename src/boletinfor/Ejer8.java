package boletinfor;

import java.util.Scanner;

public class Ejer8 {
	public static void main(String[] args) {
		
		// declarar variable para almacenar numero A
		int numeroA;
		
		// declarar variable para almacenar numero B
		int numeroB;
		
		// declarar variable para almacenar el mínimo
		int min;
		
		// declarar variable para almacenar el máximo
		int max;
		
		// crear scanner
		Scanner sc = new Scanner(System.in);
		
		// pedir numero A a usuario
		System.out.println("Introduzca un nº: ");
		
		// leer nº A introducido por usuario
		numeroA = sc.nextInt();
		
		// pedir numero B a usuario
		System.out.println("Introduzca otro nº: ");
		
		// leer nº B introducido por usuario
		numeroB = sc.nextInt();
		
		System.out.println();
		
		// declarar condicional if-else -> comparar si numA < numB / viceversa
		if (numeroA < numeroB) { // entra si numA < numB
			min = numeroA;
			max = numeroB;
			
		} else { // entra si numB < numA
			min = numeroB;
			max = numeroA;
		}
			// crear bucle for -> mostrar nºs desde min hasta máximo
			for (int i = min; i <= max; i++) {
				System.out.println(i);
			}
		
		// cerrar scanner
		sc.close();
		
	}
}
