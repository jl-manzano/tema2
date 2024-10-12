package boletincondicional;

import java.util.Scanner;

public class Ejer3 {
	public static void main(String[] args) {
		
		// DECLARAR VARIABLE TIPO ENTERO (INT) Y CHAR
		int dni;
		int posicionLetra;
		char letraDNI = 0;
		
		// CREAR OBJETO SCANNER
		Scanner sc = new Scanner(System.in);
		
		// IMPRIMIR MENSAJE CONSOLA PARA INTRODUCIR VALOR
		System.out.println("Introduzca el nº de su DNI: ");
		
		// LEER Nº TIPO ENTERO (INT) INGRESADO EN CONSOLA
		dni = sc.nextInt();
		
		// DEFINIR CONDICIONAL IF -> AVERIGUAR SI EL Nº TIENE 8 DIGITOS
		if (dni < 10000000 || dni >= 99999999 ) {
			System.out.println("Error: El nº de DNI debe tener exactamente 8 dígitos.");
		} else { // ENTRA SI EL Nº ES VÁLIDO
			posicionLetra = dni % 23; // CALCULAR POSICIÓN LETRA DNI EN BASE AL MÓDULO 23
			
			switch (posicionLetra) { // DETERMINAR LETRA CORRESPONDIENTE DNI
			case 0 -> letraDNI = 'T';
			case 1 -> letraDNI = 'R';
			case 2 -> letraDNI = 'W';
			case 3 -> letraDNI = 'A';
			case 4 -> letraDNI = 'G';
			case 5 -> letraDNI = 'M';
			case 6 -> letraDNI = 'Y';
			case 7 -> letraDNI = 'F';
			case 8 -> letraDNI = 'P';
			case 9 -> letraDNI = 'D';
			case 10 -> letraDNI = 'X';
			case 11 -> letraDNI = 'B';
			case 12 -> letraDNI = 'N';
			case 13 -> letraDNI = 'J';
			case 14 -> letraDNI = 'Z';
			case 15 -> letraDNI = 'S';
			case 16 -> letraDNI = 'Q';
			case 17 -> letraDNI = 'V';
			case 18 -> letraDNI = 'H';
			case 19 -> letraDNI = 'L';
			case 20 -> letraDNI = 'C';
			case 21 -> letraDNI = 'K';
			case 22 -> letraDNI = 'E';
			default -> letraDNI = ' ';
			
			}
		}
		
		// MOSTRAR RESULTADO PANTALLA
		System.out.println("La letra de su DNI es: " + letraDNI);
		
		// CERRAR OBJETO SCANNER
		sc.close();
		
	}
}
