package boletinwhile;

import java.util.Scanner;

public class Ejer3 {
	public static void main(String[] args) {
		
		// DECLARAR VARIABLES TIPO ENTERO (INT)
		int num;
		int suma = 0;
		int contador = 0;
		int media = 0;
		
		// CREAR OBJETO SCANNER
		Scanner sc = new Scanner(System.in);
				
		// IMPRIMIR MENSAJE CONSOLA PARA INTRODUCIR VALOR
		System.out.println("Introduzca un / otro nº: ");
							
		// LEER Nº ENTERO (INT) INGRESADO EN CONSOLA
		num = sc.nextInt();
							
		// CREAR BUCLE WHILE -> PEDIRÁ Nº ENTERO CONTANDO CADA Nº INT (+) INTRODUCIDO HASTA INTRODUCIR (-)
		while (num >= 0) {
			suma = suma + num;
			contador++;
			media = suma / contador;
			// IMPRIMIR MENSAJE CONSOLA PARA INTRODUCIR VALOR
			System.out.println("Introduzca un / otro nº: ");
								
			// LEER Nº ENTERO (INT) INGRESADO EN CONSOLA
			num = sc.nextInt();
			
		}
		
		// DEFINIR CONDICIONAL IF -> DETERMINAR SI USUARIO NO HA INTROUCIDO Nº O HA INTRODUCIDO VALOR < 0
		if (contador == 0) { // ENTRA SI CONTADOR = 0 
			System.out.println("\nEl usuario ha introducido un valor negativo");
		} else { // ENTRA SI CONTADOR != 0
			System.out.println("\nMedia aritmética de nºs introducidos: " + media);
		}		
		
		// CERRAR OBJETO SCANNER
		sc.close();
	}
}
