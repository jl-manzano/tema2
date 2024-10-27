package boletinfor;

import java.util.Scanner;

public class Ejer8 {
	public static void main(String[] args) {
		
		// declarar variable para almacenar numero A
		int numeroA;
		
		// declarar variable para almacenar numero B
		int numeroB;
		
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
			
			// crear bucle for -> mostrar nºs desde A hasta B
			for (int i = numeroA; i <= numeroB; i++) {
				System.out.println(i);
			}
		} else { // entra si numB < numA
			
			// crear bucle for -> mostrar nºs desde B hasta A
			for (int i = numeroB; i <= numeroA; i++) {
				System.out.println(i);
			}
		}
		
		// cerrar scanner
		sc.close();
		
	}
}
