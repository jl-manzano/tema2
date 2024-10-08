package boletin_ifelse;

import java.util.Scanner;

public class Ejer1 {
	public static void main(String[] args) {
		
		//DEFINIR VARIABLE TIPO INT
		int num;
		
		// CREAR OBJETO SCANNER QUE PERMITE LEER ENTRADAS DATOS DESDE CONSOLA
		Scanner sc = new Scanner(System.in);
		
		// IMPRIMIR MENSAJE EN CONSOLA PARA INTRODUCIR VALOR
		System.out.println("Introduce un nº para indicar si es par o impar: ");
	
		// LEER Nº ENTERO (INT) INGRESADO EN CONSOLA
		num = sc.nextInt();
		
		// DEFINIR CONDICIONAL IF
		
		if (num % 2 == 0) {
			//IMPRIMIR RESULTADO PANTALLA SI ES PAR
			System.out.println("El número " + num + " es par.");
		} else {
			//IMPRIMIR RESULTADO PANTALLA SI ES IMPAR
			System.out.println("El número " + num + " es impar.");
		}
		
		// CERRAR OBJETO SCANNER
		sc.close();
	}
}
