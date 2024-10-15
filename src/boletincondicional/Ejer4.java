package boletincondicional;

import java.util.Scanner;

public class Ejer4 {
	public static void main(String[] args) {

		// DECLARAR VARIABLES TIPO ENTERO (INT) Y STRING
		int num;
		int decena;
		int unidad;
		String result = "";

		// CREAR OBJETO SCANNER
		Scanner sc = new Scanner(System.in);

		// IMPRIMIR MENSAJE CONSOLA PARA INTRODUCIR VALOR
		System.out.println("Introduzca un nº entre 1 y 99: ");

		// LEER Nº ENTERO (INT) INGRESADO EN CONSOLA
		num = sc.nextInt();

		// DECLARAR CONDICIONAL IF -> DETERMINAR SI NUM ESTÁ DENTRO DEL RANGO
		if (num < 1 || num > 99) { // ENTRA SI NUM ESTÁ FUERA DEL RANGO
			System.out.println("El nº debe estar entre 1 y 99.");
		} else if (num >= 1 && num <= 19) { // ENTRA SI NUM ESTÁ ENTRE 1 Y 29
			switch (num) {  // DETERMINAR NUM DESCRITO CORRESPONDIENTE A NUM INTRODUCIDO
			case 1 -> result = "uno";
			case 2 -> result = "dos";
			case 3 -> result = "tres";
			case 4 -> result = "cuatro";
			case 5 -> result = "cinco";
			case 6 -> result = "seis";
			case 7 -> result = "siete";
			case 8 -> result = "ocho";
			case 9 -> result = "nueve";
			case 10 -> result = "diez";
			case 11 -> result = "once";
			case 12 -> result = "doce";
			case 13 -> result = "trece";
			case 14 -> result = "catorce";
			case 15 -> result = "quince";
			case 16 -> result = "dieciséis";
			case 17 -> result = "diecisiete";
			case 18 -> result = "dieciocho";
			case 19 -> result = "diecinueve";
			case 20 -> result = "veinte";
			}

		} else { // ENTRA SI EL NUM ES MAYOR DE 29
			decena = num / 10; // CALCULA LA DECENA DEL NUM INTRODUCIDO
			unidad = num % 10; // CALCULA LA UNIDAD DEL NUM INTRODUCIDO
			switch (decena) { // DETERMINAR DECENA DESCRITA CORRESPONDIENTE A NUM INTRODUCIDO
			case 2 -> result = "veinti";
			case 3 -> result = "treinta";
			case 4 -> result = "cuarenta";
			case 5 -> result = "cincuenta";
			case 6 -> result = "sesenta";
			case 7 -> result = "setenta";
			case 8 -> result = "ochenta";
			case 9 -> result = "noventa";
			}

			if (unidad == 0) { // SI UNIDAD DEL NUM ES 0, NO SE HACE NADA
			} else { // ENTRA SI UNIDAD DEL NUM ES != 0 
				result += " y "; // AÑADE CADENA TEXTO A VARIABLE RESULT
				switch (unidad) { // DETERMINAR UNIDAD DESCRITA CORRESPONDIENTE A NUM INTRODUCIDO
				case 1 -> result += "uno";
				case 2 -> result += "dos";
				case 3 -> result += "tres";
				case 4 -> result += "cuatro";
				case 5 -> result += "cinco";
				case 6 -> result += "seis";
				case 7 -> result += "siete";
				case 8 -> result += "ocho";
				case 9 -> result += "nueve";
				}
			}
		}
		// IMPRIMIR RESULTADO PANTALLA
		System.out.println(result);

		// CERRAR OBJETO SCANNER
		sc.close();
	}
}
