package boletinwhile;

import java.util.Scanner;

public class Ejer2 {
	public static void main(String[] args) {
		
		// DECLARAR VARIABLES TIPO ENTERO (INT)
		int num;
		int contador = 0;
			
		// CREAR OBJETO SCANNER
		Scanner sc = new Scanner(System.in);
		
		// IMPRIMIR MENSAJE CONSOLA PARA INTRODUCIR VALOR
		System.out.println("Introduzca un / otro nº: ");
					
		// LEER Nº ENTERO (INT) INGRESADO EN CONSOLA
		num = sc.nextInt();
					
		// CREAR BUCLE WHILE -> PEDIRÁ Nº ENTERO CONTANDO CADA Nº INT (+) INTRODUCIDO HASTA INTRODUCIR (-)
		while (num >= 0) {
			
			// INCREMENTAR EN 1 LA VARIABLE CONTADOR
			contador++;
			
			// IMPRIMIR MENSAJE CONSOLA PARA INTRODUCIR VALOR
			System.out.println("Introduzca un / otro nº: ");
			
			// LEER Nº ENTERO (INT) INGRESADO EN CONSOLA
			num = sc.nextInt();
			
			// Nº INTRODUCIDO
			System.out.println("Nº introducido: " + num);
			// Nºs INTRODUCIDOS HASTA EL MOMENTO
			System.out.println("Ha introducido " + contador + " nºs.");
						
		}
		
		// IMPRIMIR RESULTADO PANTALLA
		System.out.println("\nFin del programa.");
		
		// CERRAR OBJETO SCANNER
		sc.close();
		
	}
}
