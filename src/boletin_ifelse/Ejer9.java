package boletin_ifelse;

import java.util.Scanner;

public class Ejer9 {
	public static void main(String[] args) {
		
		// DECLARAR CONSTANTES TIPO STRING
		final String PIEDRA = "PIEDRA";
		final String PAPEL = "PAPEL";
		final String TIJERA = "TIJERA";
		
		// DECLARAR VARIABLES TIPO STRING
		String jugador1;
		String jugador2;
		
		// CREAR OBJETO SCANNER
		Scanner sc = new Scanner(System.in);
		
		// IMPRIMIR MENSAJE CONSOLA PARA INTRODUCIR CADENA TEXTO
		System.out.println("Jugador 1: ELIGE PIEDRA, PAPEL O TIJERA");

		// LEER MENSAJE INTRODUCIDO EN CONSOLA
		jugador1 = sc.next();
		// IMPRIMIR MENSAJE CONSOLA PARA INTRODUCIR CADENA TEXTO
		System.out.println("Jugador 2: ELIGE PIEDRA, PAPEL O TIJERA");

		// LEER MENSAJE INTRODUCIDO EN CONSOLA
		jugador2 = sc.next();
		
		// DEFINIR CONDICIONAL IF -> INTRODUCEN MISMA CADENA, GANA EL JUG1 O JUG2
		if (jugador1.equalsIgnoreCase(jugador2)) {
			System.out.println("EMPATE");
		} else if (jugador1.equalsIgnoreCase(PIEDRA) && jugador2.equalsIgnoreCase(TIJERA) || jugador1.equalsIgnoreCase(PAPEL) && jugador2.equalsIgnoreCase(PIEDRA) || jugador1.equalsIgnoreCase(TIJERA) && jugador2.equalsIgnoreCase(PAPEL)) {
			System.out.println("GANA EL JUGADOR 1");
		} else {
			System.out.println("GANA EL JUGADOR 2");
		}
			
		// CERRAR OBJETO SCANNER
		sc.close();
	}
}
