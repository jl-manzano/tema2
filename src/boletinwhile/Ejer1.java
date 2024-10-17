package boletinwhile;

import java.util.Scanner;

public class Ejer1 {
	public static void main(String[] args) {
		
		// DECLARAR VARIABLE PARA ALMACENAR NUM
		int num;
		
		// DECLARAR VARIABLE PARA ALMACENAR SUMA NUMs
		int suma = 0;
		
		// CREAR OBJETO SCANNER
		Scanner sc = new Scanner(System.in);
		
		// IMPRIMIR MENSAJE CONSOLA PARA INTRODUCIR VALOR
		System.out.println("Introduce un / otro nº: ");
		
		// LEER Nº ENTERO (INT) INGRESADO EN CONSOLA
		num = sc.nextInt();
		
		// CREAR BUCLE WHILE -> SUMAR Nºs POSITIVOS INTRODUCIDOS POR USUARIO HASTA INTRODUCIR NEGATIVO
		while (num >= 0) {
			
			// SUMAR Nº INGRESADO A VARIABLE SUMA
			suma += num;
			
			// IMPRIMIR MENSAJE CONSOLA PARA INTRODUCIR VALOR
			System.out.println("Introduce un / otro nº: ");
			
			// LEER Nº ENTERO (INT) INGRESADO EN CONSOLA
			num = sc.nextInt();
			
		}
		
		// IMPRIMIR RESULTADO PANTALLA 
		System.out.println("\nTotal: " + suma);
		
		// CERRAR OBJETO SCANNER
		sc.close();
	}
	
}
