package boletinwhile;

import java.util.Scanner;

public class Ejer1 {
	public static void main(String[] args) {
		
	// DECLARAR VARIABLES TIPO ENTERO (INT)
	int num = 0;
	int suma = 0;
	
	// CREAR OBJETO SCANNER
	Scanner sc = new Scanner(System.in);
	
	// IMPRIMIR MENSAJE CONSOLA PARA INTRODUCIR VALOR
	System.out.println("Introduzca un / otro nº: ");
	
	// LEER Nº ENTERO (INT) INGRESADO EN CONSOLA
	num = sc.nextInt();
	
	// CREAR BUCLE DO-WHILE, PEDIRÁ UN Nº ENTERO MIENTRAS NO SEA NEGATIVO
	while  (num >= 0) {
		// SUMAR Nº INGRESADO EN CONSOLA A TOTAL (suma)
		suma = suma + num;
				
		// IMPRIMIR MENSAJE CONSOLA PARA INTRODUCIR VALOR
		System.out.println("Introduzca un / otro nº: ");
		
		// LEER Nº ENTERO (INT) INGRESADO EN CONSOLA
		num = sc.nextInt();
		
	}
	
	// IMPRIMIR RESULTADO PANTALLA
	System.out.println("\n" + suma);
	
	// CERRAR OBJETO SCANNER
	sc.close();
		
	
	}
}
