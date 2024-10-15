package boletinwhile;

import java.util.Scanner;

public class Ejer3 {
	public static void main(String[] args) {
		
		// DECLARAR VARIABLES TIPO ENTERO (INT) Y DECIMAL (DOUBLE)
		int num;
		int suma = 0;
		int contador = 0;
		double media;
		
		// CREAR OBJETO SCANNER
		Scanner sc = new Scanner(System.in);
		
		// IMPRIMIR MENSAJE CONSOLA -> INTRODUCIR VALOR
		System.out.println("Introduce un / otro nº: ");
		
		// LEER Nº TIPO ENTERO (INT)
		num = sc.nextInt();
		
		// CREAR BUCLE WHILE -> SUMAR Y CONTAR Nºs POSITIVOS INTRODUCIDOS POR USUARIO HASTA INTRODUCIR NEGATIVO
		while (num >= 0) {
			
			// SUMAR Nº INGRESADO A VARIABLE SUMA
			suma = suma + num;
			
			// INCREMENTAR EN 1 VARIABLE CONTADOR
			contador++;
			
			// IMPRIMIR MENSAJE CONSOLA -> INTRODUCIR VALOR
			System.out.println("Introduce un / otro nº: ");
			
			// LEER Nº TIPO ENTERO (INT)
			num = sc.nextInt();

		}
		
		// DEFINIR CONDICIONAL IF -> CALCULAR MEDIA ARITMÉTICA Nºs INTRODUCIDOS SI CONTADOR != 0
		if (contador != 0) { // ENTRA SI CONTADOR != 0
		media = suma / contador;
		System.out.println("\nLa media aritmética de los nºs introducidos (" + contador + ") es: " + media);
		} else { // ENTRA SI CONTADOR = 0, 1er Nº INTRODUCIDO ES NEGATIVO 
			System.out.println("\nEl nº introducido es < 0; por tanto, el resultado es indefinido");
		}
		// CERRAR OBJETO SCANNER
		sc.close();
		
	}
}
