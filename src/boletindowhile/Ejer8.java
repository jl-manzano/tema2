package boletindowhile;

import java.util.Scanner;

public class Ejer8 {
	public static void main(String[] args) {
		
		// declarar constantes uno, dos, tres, cuatro, cinco y seis
		final String UNO = "UNO";
		final String DOS = "DOS";
		final String TRES = "TRES";
		final String CUATRO = "CUATRO";
		final String CINCO = "CINCO";
		final String SEIS = "SEIS";
		
		// declarar variable string para almacenar el valor del dado 1 del jugador
		String dado1;
		
		// declarar variable string para almacenar el valor del dado 2 del jugador
		String dado2;
		
		// declarar variable int para almacenar el valor numerico del dado 1
		int valor1 = 0;
		
		// declarar variable int para almacenar el valor numerico del dado 2
		int valor2 = 0;
		
		// declarar variable para almacenar la suma de los 2 dados
		int result;

		// crear scanner
		Scanner sc = new Scanner(System.in);
		
		System.out.println("TIRADA DE DADOS");
		
		// crear bucle do-while
		do {
		// pedir a usuario valor de la tirada del dado 1
		System.out.println("\nIntroduzca cuánto ha sacado en la 1a tirada (UNO, DOS, ...) : ");
		
		// leer valor de la tirada 1 introducido por usuario (toUpperCase -> transforma el valor introducido en mayúsc.)
		dado1 = sc.next().toUpperCase();
		
		} while (!dado1.equals(UNO) && !dado1.equals(DOS) && !dado1.equals(TRES) && !dado1.equals(CUATRO) && !dado1.equals(CINCO) && !dado1.equals(SEIS));
		
		do {
		// pedir a usuario valor de la tirada del dado 2
		System.out.println("\nIntroduzca cuánto ha sacado en la 2a tirada (UNO, DOS, ...) : ");
		
		// leer valor de la tirada 2 introducido por usuario
		dado2 = sc.next().toUpperCase();
		
		} while (!dado2.equals(UNO) && !dado2.equals(DOS) && !dado2.equals(TRES) && !dado2.equals(CUATRO) && !dado2.equals(CINCO) && !dado2.equals(SEIS));
		
		// definir condicional switch - determinar valor dado 1
		switch(dado1) {
		case UNO -> { // entra si dado 1 corresponde con UNO
		valor1 = 1;
		}
		case DOS -> { // entra si dado 1 corresponde con DOS
		valor1 = 2;
		}
		case TRES -> { // entra si dado 1 corresponde con TRES
		valor1 = 3;
		}
		case CUATRO -> { // entra si dado 1 corresponde con CUATRO
		valor1 = 4;
		}
		case CINCO -> { // entra si dado 1 corresponde con CINCO
		valor1 = 5;
		}
		case SEIS -> { // entra si dado 1 corresponde con SEIS
		valor1 = 6;
		}
		default -> // entra si dado 1 no corresponde con ninguna opción
		System.out.println("\nSin coincidencias");
		}
		
		// definir condicional switch -> determinar valor dado 2
		switch(dado2) { 
		case UNO -> { // entra si dado 2 corresponde con UNO
		valor2 = 1;
		}
		case DOS -> { // entra si dado 2 corresponde con DOS
		valor2 = 2;
		}
		case TRES -> { // entra si dado 2 corresponde con TRES
		valor2 = 3;
		}
		case CUATRO -> { // entra si dado 2 corresponde con CUATRO
		valor2 = 4;
		}
		case CINCO -> { // entra si dado 2 corresponde con CINCO
		valor2 = 5;
		}
		case SEIS -> { // entra si dado 2 corresponde con SEIS
		valor2 = 6;
		}
		default -> // // entra si dado 2 no corresponde con ninguna opción
		System.out.println("\nSin coincidencias");
		}
		
		// determinar valor resultado de la suma entre valor de tirada de dado 1 y dado 2
		result = valor1 + valor2;
		
		// imprimir resultado de la suma
		System.out.println("\nLa suma entre " + valor1 + " y " + valor2 + " es: " + result);
		
		// cerrar scanner
		sc.close();
	}
}
