package boletinwhile;

import java.util.Scanner;

public class Ejer2 {
	public static void main(String[] args) {
		
		// DECLARAR VARIABLE PARA ALMACENAR NUM
		int num;
		
		// DECLARAR VARIABLE PARA ALMACENAR CONTADOR
		int contador = 0;
		
		// CREAR OBJETO SCANNER
		Scanner sc = new Scanner(System.in);
		
		// IMPRIMIR MENSAJE CONSOLA PARA INTRODUCIR VALOR
		System.out.println("Introduce un / otro nº: ");
	
		// LEER Nº ENTERO (INT) INGRESADO EN CONSOLA
		num = sc.nextInt();
		
		// CREAR BUCLE WHILE -> CONTAR Nºs POSITIVOS INTRODUCIDOS POR USUARIO HASTA INTRODUCIR NEGATIVO
		while (num >= 0) {
			
			// INCREMENTAR EN 1 VARIABLE CONTADOR
			contador++;

			// IMPRIMIR MENSAJE CONSOLA PARA INTRODUCIR VALOR
			System.out.println("\nIntroduce un / otro nº: ");
		
			// LEER Nº ENTERO (INT) INGRESADO EN CONSOLA
			num = sc.nextInt();
						
		}
		
		// DEFINIR CONDICIONAL -> IMPRIMIR CONTADOR Nºs
		if (contador != 0) { // ENTRA SI CONTADOR ES != 0
			
			// Nºs INTRODUCIDOS HASTA EL MOMENTO
			System.out.println("\nHa introducido " + contador + " nºs.");
			
		} else { // ENTRA SI CONTADOR == 0
			System.out.println("\nHa introducido un valor negativo al iniciar.");
		}
		
		// IMPRIMIR MENSAJE PROGRAMA
		System.out.println("\nFin del programa.");
		
		// CERRAR OBJETO SCANNER
		sc.close();
		
	}
}
