package boletinwhile;

import java.util.Scanner;

public class Ejer5 {
	public static void main(String[] args) {
		
		// DECLARAR VARIABLE PARA ALMACENAR EDAD
		int edad;
		
		// DECLARAR VARIABLE PARA SUMAR EDADES
		int suma = 0;
		
		// DECLARAR VARIABLE PARA CALCULAR MEDIA EDADES
		double media;
		
		// DECLARAR VARIABLE PARA CONTAR EDADES INTRODUCIDAS
		int contador = 0;
		
		// DECLARAR VARIABLE PARA CONTAR EDADES INTRODUCIDAS >= 18
		int contMayor = 0;
		
		// CREAR OBJETO SCANNER
		Scanner sc = new Scanner(System.in);
		
		// IMPRIMIR MENSAJE CONSOLA -> INTRODUCIR VALOR
		System.out.println("Introduce un / otro nº: ");
		
		// LEER Nº TIPO ENTERO (INT)
		edad = sc.nextInt();
		
		// CREAR BUCLE WHILE -> DETERMINAR SUMA, MEDIA, Nº ALUMNOS Y > EDAD
		while (edad > 0) {
			
			// SUMAR NUM INTRODUCIDO A VARIABLE SUMA
			suma += edad;
			
			// INCREMENTAR EN 1 VARIABLE CONTADOR
			contador++;
			
			// DEFINIR CONDICIONAL IF -> DETERMINAR > EDAD
			if (edad >= 18) {
				contMayor++;
			}
			
			// IMPRIMIR MENSAJE CONSOLA -> INTRODUCIR VALOR
			System.out.println("\nIntroduce un / otro nº: ");
			
			// LEER Nº TIPO ENTERO (INT)
			edad = sc.nextInt();
		}
		
		// CALCULAR MEDIA CON OPERADOR TERNARIO - SI CONTADOR > 0 -> CALCULAR, SI NO -> 0
		media = contador > 0 ? (double) suma / contador : 0;
		
		// IMPRIMIR RESULTADO PANTALLA
		System.out.println("\nSuma edades introducidas: " + suma);
		System.out.println("Media edades introducidas: " + media);
		System.out.println("Nº alumnos introducidos: " + contador);
		System.out.println("Nº alumnos mayores edad (>=18): " + contMayor);
	
		// CERRAR OBJETO SCANNER
		sc.close();
	
	}
}
