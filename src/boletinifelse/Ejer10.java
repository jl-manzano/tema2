package boletinifelse;

import java.util.Scanner;

public class Ejer10 {
	public static void main(String[] args) {
		
		// DECLARAR VARIABLES TIPO ENTERO (INT) Y 'BOOLEANA'
		int num1;
		int num2;
		int num3;
		
		// CREAR OBJETO SCANNER
		Scanner sc = new Scanner(System.in);
		
		// IMPRIMIR MENSAJE EN CONSOLA PARA INTRODUCIR VALOR
		System.out.println("Introduce un nº para indicar si es par o impar: ");
	
		// LEER Nº ENTERO (INT) INGRESADO EN CONSOLA
		num1 = sc.nextInt();
		
		// IMPRIMIR MENSAJE EN CONSOLA PARA INTRODUCIR VALOR
		System.out.println("Introduce un nº para indicar si es par o impar: ");
	
		// LEER Nº ENTERO (INT) INGRESADO EN CONSOLA
		num2 = sc.nextInt();		

		// IMPRIMIR MENSAJE EN CONSOLA PARA INTRODUCIR VALOR
		System.out.println("Introduce un nº para indicar si es par o impar: ");
	
		// LEER Nº ENTERO (INT) INGRESADO EN CONSOLA
		num3 = sc.nextInt();
		
		// DEFINIR CONDICIONAL IF -> CALC. SI LA SUMA DE 2 DE LOS Nºs ES IGUAL AL OTRO Nº
		if (num1 + num2 == num3) {
            System.out.println("La suma de " + num1 + " y " + num2 + " es igual a " + num3 + ".");
        } else if (num1 + num3 == num2) {
            System.out.println("La suma de " + num1 + " y " + num3 + " es igual a " + num2 + ".");
        } else if (num2 + num3 == num1) {
            System.out.println("La suma de " + num2 + " y " + num3 + " es igual a " + num1 + ".");
        } else {
            System.out.println("La suma de dos de los números NO es igual al tercero.");
		}
	
		// CERRAR OBJETO SCANNER
		sc.close();
	}
}
