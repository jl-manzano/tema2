package boletincondicional;

import java.util.Scanner;

public class Ejer1 {
	public static void main(String[] args) {
		
		// DECLARAR VARIABLE TIPO ENTERO (INT)
		int num;
		String numCad;
		String inverso;
		
		// CREAR OBJETO SCANNER
		Scanner sc = new Scanner(System.in);
		
		// IMPRIMIR MENSAJE CONSOLA PARA INTRODUCIR VALOR
		System.out.println("Introduce un número entre 0 y 9999: ");
		
		// LEER Nº TIPO ENTERO (INT) INGRESADO EN CONSOLA
		num = sc.nextInt();
		
		// DECLARAR CONDICIONAL IF -> AVERIGUAR SI EL NUM ES < 0 o > 9999 ; SI ESTÁ EN EL RANGO RECORRE LAS INSTRUCCIONES DEL ELSE
		if (num < 0 || num > 9999) { // ENTRA SI Nº ESTÁ FUERA DEL RANGO
			System.out.println("El número introducido está fuera del rango.");
		} else {
			numCad = Integer.toString(num); // TRANSFORMAR Nº ENTERO INGRESADO CONSOLA A CADENA
			inverso = new StringBuilder(numCad).reverse().toString(); // CREAR OBJETO StringBuilder -> MANIPULAR CADENAS TEXTO (invertir) -> PASAR CONTENIDO A STRING BUILDER A CADENA PARA COMPARAR 2 CADENAS
			if (numCad.equals(inverso)) { // ENTRA SI Nº ESTÁ EN EL RANGO INDICADO Y COMPARA LAS 2 CADENAS
				System.out.println("Es un nº capicúa."); // IMPRIME RESULTADO SI LAS CADENAS SON IGUALES
			} else { // ENTRA SI CADENAS NO SON IGUALES
				System.out.println("No es un nº capicúa.");
			}
		}
		
		// CERRAR OBJETO SCANNER
		sc.close();
	}
}
