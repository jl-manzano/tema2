package boletin_ifelse;

import java.util.Scanner;

public class Ejer8 {
	public static void main(String[] args) {
		
		// DECLARAR VARIABLE TIPO DECIMAL (DOUBLE)
		double num;
		
		//  CREAR OBJETO SCANNER
		Scanner sc = new Scanner(System.in);
		
		// IMPRIMIR MENSAJE CONSOLA PARA INTRODUCIR VALOR
		System.out.println("Introduzca su nota: ");
		
		// LEER Nº DECIMAL (DOUBLE) INGRESADO EN CONSOLA
		num = sc.nextDouble();
		
		// DEFINIR CONDICIONAL IF -> tipo de nota
		if (num < 0 || num > 10) {
			System.out.println("Nota inválida.");
		} else {
			if (num < 5) {
				System.out.println("Su nota es un INSUFICIENTE");
			} else if (num < 6) {
				System.out.println("Su nota es un SUFICIENTE");
			} else if (num < 7) {
				System.out.println("Su nota es un BIEN");
			} else if (num < 9) {
				System.out.println("Su nota es un NOTABLE");
			} else {
				System.out.println("Su nota es un SOBRESALIENTE");
			}
		}
		
		// CERRAR OBJETO SCANNER
		sc.close();
		
	}
}
