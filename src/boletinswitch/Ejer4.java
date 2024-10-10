package boletinswitch;

import java.util.Scanner;

public class Ejer4 {
	public static void main(String[] args) {
		
		// DECLARAR CONSTANTES TIPO STRING
		final String UNO = "UNO";
		final String DOS = "DOS";
		final String TRES = "TRES";
		final String CUATRO = "CUATRO";
		final String CINCO = "CINCO";
		final String SEIS = "SEIS";
		
		// DECLARAR VARIABLES TIPO STRING
		String dado1;
		String dado2;
		
		// DECLARAR VARIABLES TIPO ENTERO (INT)
		int valor1 = 0;
		int valor2 = 0;
		int result;

		// CREAR OBJETO SCANNER
		Scanner sc = new Scanner(System.in);
				
		// IMPRIMIR MENSAJE CONSOLA PARA INTRODUCIR VALOR
		System.out.println("Introduzca cuánto ha sacado en la 1a tirada (UNO, DOS, ...) : ");
		
		// LEER Nº TIPO ENTERO (INT) INGRESADO EN CONSOLA (toUpperCase -> transforma el valor introducido en mayúsc.)
		dado1 = sc.next().toUpperCase();
		
		// IMPRIMIR MENSAJE CONSOLA PARA INTRODUCIR VALOR
		System.out.println("Introduzca cuánto ha sacado en la 2a tirada (UNO, DOS, ...) : ");
		
		// LEER Nº TIPO ENTERO (INT) INGRESADO EN CONSOLA
		dado2 = sc.next().toUpperCase();
		
		// DEFINIR CONDICIONAL SWITCH -> ASIGNAR VALOR DADO A VALOR 1
		switch(dado1) {
		case UNO -> { // ENTRA SI DADO1 CORRESPONDE CON UNO
		valor1 = 1;
		System.out.println("\nVALOR 1 = 1");
		}
		case DOS -> { // ENTRA SI DADO1 CORRESPONDE CON DOS
		valor1 = 2;
		System.out.println("\nVALOR 1 = 2");
		}
		case TRES -> { // ENTRA SI DADO1 CORRESPONDE CON TRES
		valor1 = 3;
		System.out.println("\nVALOR 1 = 3");
		}
		case CUATRO -> { // ENTRA SI DADO1 CORRESPONDE CON CUATRO
		valor1 = 4;
		System.out.println("\nVALOR 1 = 4");
		}
		case CINCO -> { // ENTRA SI DADO1 CORRESPONDE CON CINCO
		valor1 = 5;
		System.out.println("\nVALOR 1 = 5");
		}
		case SEIS -> { // ENTRA SI DADO1 CORRESPONDE CON SEIS
		valor1 = 6;
		System.out.println("\nVALOR 1 = 6");
		}
		default -> // ENTRA SI DADO1 NO COINCIDE CON NINGUNA OPCIÓN
		System.out.println("\nSin coincidencias");
		}
		
		switch(dado2) { 
		case UNO -> { // ENTRA SI DADO2 CORRESPONDE CON UNO
		valor2 = 1;
		System.out.println("\nVALOR 2 = 1");
		}
		case DOS -> { // ENTRA SI DADO2 CORRESPONDE CON DOS
		valor2 = 2;
		System.out.println("\nVALOR 2 = 2");
		}
		case TRES -> { // ENTRA SI DADO2 CORRESPONDE CON TRES
		valor2 = 3;
		System.out.println("\nVALOR 2 = 3");
		}
		case CUATRO -> { // ENTRA SI DADO2 CORRESPONDE CON CUATRO
		valor2 = 4;
		System.out.println("\nVALOR 2 = 4");
		}
		case CINCO -> { // ENTRA SI DADO2 CORRESPONDE CON CINCO
		valor2 = 5;
		System.out.println("\nVALOR 2 = 5");
		}
		case SEIS -> { // ENTRA SI DADO2 CORRESPONDE CON SEIS
		valor2 = 6;
		System.out.println("\nVALOR 2 = 6");
		}
		default -> // ENTRA SI DADO2 NO COINCIDE CON NINGUNA OPCIÓN
		System.out.println("\nSin coincidencias");
		}
		
		// IMPRIMIR RESULTADO PANTALLA
		result = valor1 + valor2;
		System.out.println("\nLa suma entre " + valor1 + " y " + valor2 + " es: " + result);
		
		// CERRAR OBJETO SCANNER
		sc.close();
	}
}
