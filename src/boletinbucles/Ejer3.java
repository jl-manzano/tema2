package boletinbucles;

import java.util.Scanner;

public class Ejer3 {
	public static void main(String[] args) {
		
		// declarar variable para almacenar numero A
		int numeroA;
		
		// declarar variable para almacenar numero B
		int numeroB;
		
		// declarar variable para almacenar el nº menor de a y b
		int menor;
		
		// declarar variable para almacenar el mcd e inicializar en 1 por si no se encuentra otro divisor común
		int mcd = 1;
		
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
		
		// determinar nº menor (a / b)
		menor = Math.min(numeroA, numeroB);
		
		// crear bucle for -> el mcd no puede ser > que el nº menor
		for (int i = menor; i >= 1; i--) {
			
			// definir condicional if - comprobar si numero A y B son divisibles por el mismo nº
			if (numeroA % i == 0 && numeroB % i == 0) { // entra si numA y numB es divisible por el mismo nº
				mcd = i;
				break;
			}
		}
		
		// imprimir resultado pantalla
		System.out.println("\nEl máximo común divisor entre " + numeroA + " y " + numeroB + " es " + mcd + ".");
		
		// cerrar scanner
		sc.close();
		
	}
}
