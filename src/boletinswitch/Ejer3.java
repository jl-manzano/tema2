package boletinswitch;

import java.util.Scanner;

public class Ejer3 {
	public static void main(String[] args) {
		
		// DECLARAR VARIABLES TIPO ENTERO (INT) Y CONSTANTES TIPO CHAR
		int num1;
		int num2;
		char opcion;
		
		// CREAR OBJETO SCANNER
		Scanner sc = new Scanner(System.in);
		
		// IMPRIMIR MENSAJE CONSOLA PARA INTRODUCIR VALOR
		System.out.println("Introduzca un nº: ");
		// LEER Nº TIPO ENTERO (INT) INGRESADO EN CONSOLA
		num1 = sc.nextInt();
		
		// IMPRIMIR MENSAJE CONSOLA PARA INTRODUCIR VALOR
		System.out.println("Introduzca otro nº: ");
				
		// LEER Nº TIPO ENTERO (INT) INGRESADO EN CONSOLA
		num2 = sc.nextInt();
		
		// MOSTRAR MENÚ PANTALLA
		System.out.println("\nELIJA UNA OPCIÓN:");
		System.out.println("A. SUMAR NºS");
		System.out.println("B. RESTAR NºS");
		System.out.println("C. MULTIPLICAR NºS");
		System.out.println("D. DIVIDIR NºS");
				
		// LEER CHAR INGRESADO EN CONSOLA (CHAR.AT DEVUELVE EL CARACTER EN LA POSICIÓN INDICADA EN EL ÍNDICE, EN ESTE CASO 0 'la primera'
		opcion = sc.next().charAt(0);
		
		// DEFINIR CONDICIONAL SWITCH -> REALIZAR OPERACIÓN INDICADA
		switch(Character.toLowerCase(opcion)) { //  transforma el valor introducido en minúsc.
		case 'a'-> // ENTRA SI CARÁCTER ES 'A' o 'a'
		System.out.println("SUMA: " + (num1 + num2));
		case 'b' -> // ENTRA SI CARÁCTER ES 'B' TRASo 'b'
		System.out.println("RESTA: " + (num1 - num2));
		case 'c' -> // ENTRA SI CARÁCTER ES 'C' o 'c'
		System.out.println("PRODUCTO: " + (num1 * num2));
		case 'd' -> // ENTRA SI CARÁCTER ES 'D' o 'd'
		System.out.println("DIVISIÓN: " + (num1 / num2));
		default -> // ENTRA SI CARÁCTER NO COINCIDE CON NINGUNA OPCIÓN DEL MENÚ
		System.out.println("Sin coincidencias");
		}
		
		// CERRAR OBJETO SCANNER
		sc.close();
	
	}
}
