package boletinswitch;

import java.util.Scanner;

public class Ejer5 {
	public static void main(String[] args) {

		// DECLARAR VARIABLE TIPO STRING
		String carnet;

		// CREAR OBJETO SCANNER
		Scanner sc = new Scanner(System.in);

		// IMPRIMIR MENSAJE CONSOLA -> INTRODUCIR VALOR
		System.out.println("Introduzca el tipo de su carnet 'letra': ");

		// LEER MENSAJE INGRESADO EN CONSOLA
		carnet = sc.next().toUpperCase();

		// DEFINIR CONDICIONAL SWITCH -> AVERIGUAR TIPO CARNET USUARIO
		switch (carnet) {
		case "E" -> System.out.println("Remolques"); // ENTRA SI CARNET ES 'E'
		case "D" -> System.out.println("Autobuses"); // ENTRA SI CARNET ES 'D'
		case "C1", "C2", "C3", "C4", "C5" -> System.out.println("Camiones"); // ENTRA SI CARNET ES 'C1 -C5'
		case "A"  -> System.out.println("Motocicletas"); // ENTRA SI CARNET ES 'A'
		case "B1", "B2" -> System.out.println("Automóviles"); // ENTRA SI CARNET ES 'B1-B2'
		default -> 	System.out.println("Categoría no contemplada"); // ENTRA SI NO CORRESPONDE CON NINGUNA OPCIÓN

		}

		// CERRAR OBJETO SCANNER
		sc.close();
	}
}