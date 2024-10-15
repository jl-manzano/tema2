package boletinwhile;

import java.util.Scanner;

public class Ejer4 {
	public static void main(String[] args) {
		
		// DECLARAR VARIABLES TIPO ENTERO (INT)
		int num;
		int positivo;
		int negativo;
		int sumaP = 0;
		int sumaN = 0;
		int contadorN = 0;
		int media;
		int contadorCeros = 0;
		int contador = 0;
		
		// CREAR OBJETO SCANNER
		Scanner sc = new Scanner(System.in);
		
		// CREAR BUCLE WHILE -> USUARIO INTRODUZCA 10 Nºs
		while (contador < 10) {
	
			// IMPRIMIR MENSAJE CONSOLA PARA INTRODUCIR VALOR
			System.out.println("Introduzca un / otro nº: ");
								
			// LEER Nº ENTERO (INT) INGRESADO EN CONSOLA
			num = sc.nextInt();
			
			while (num < 0) {
				contadorN++;
				sumaN = sumaN + num;
			}
			
		}
	}
}
