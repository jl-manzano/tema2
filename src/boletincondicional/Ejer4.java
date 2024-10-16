package boletincondicional;

import java.util.Scanner;

public class Ejer4 {
	public static void main(String[] args) {

		// DECLARAR VARIABLES TIPO ENTERO (INT) Y STRING
		int num;
		int decena;
		int unidad;
		String cadUnidad = "";
		String cadDecena = "";
		String result = "";
		

		// CREAR OBJETO SCANNER
		Scanner sc = new Scanner(System.in);

		// IMPRIMIR MENSAJE CONSOLA PARA INTRODUCIR VALOR
		System.out.println("Introduzca un nº entre 1 y 99: ");

		// LEER Nº ENTERO (INT) INGRESADO EN CONSOLA
		num = sc.nextInt();

		// ME QUEDO CON LAS UNIDADES
		unidad = num % 10;
		
		// ME QUEDO CON LAS DECENAS
		decena =  num / 10;
		
		// DECLARAR CONDICIONAL IF -> DETERMINAR SI NUM ESTÁ DENTRO DEL RANGO
		if (num < 1 || num > 99) { // ENTRA SI NUM ESTÁ FUERA DEL RANGO
			System.out.println("El nº debe estar entre 1 y 99.");
		} else { // ENTRA SI NUM ESTÁ ENTRE 1 Y 29
		
			switch (num) {  // DETERMINAR NUM DESCRITO CORRESPONDIENTE A NUM INTRODUCIDO
			case 10 -> result = "diez";
			case 11 -> result = "once";
			case 12 -> result = "doce";
			case 13 -> result = "trece";
			case 14 -> result = "catorce";
			case 15 -> result = "quince";
			default -> {
				switch(unidad) {
				case 1 -> cadUnidad = "uno";
				case 2 -> cadUnidad = "dos";
				case 3 -> cadUnidad = "tres";
				case 4 -> cadUnidad = "cuatro";
				case 5 -> cadUnidad = "cinco";
				case 6 -> cadUnidad = "seis";
				case 7 -> cadUnidad = "siete";
				case 8 -> cadUnidad = "ocho";
				case 9 -> cadUnidad = "nueve";
				
				}
				
				switch (decena) {
				case 1 -> cadDecena = "dieci";
				
				case 2 -> {
					if (unidad == 0) {
						cadDecena = "veinte";
					} else {
						cadDecena = "vienti" ;
					}
				}
				
				case 3 -> {
					cadDecena = "treinta";
					
					if (unidad != 0) {
						cadDecena = cadDecena + " y " ;					
					}
				}
				
				case 4 -> {
					cadDecena = "cuarenta";
					
					if (unidad != 0) {
						cadDecena = cadDecena + " y " ;					
					}
				}
				
				case 5 -> {
					cadDecena = "cincuenta";
					
					if (unidad != 0) {
						cadDecena = cadDecena + " y " ;					
					}
				}
				
				case 6 -> {
					cadDecena = "sesenta";
					
					if (unidad != 0) {
						cadDecena = cadDecena + " y " ;					
					}
				}
				
				case 7 -> {
					cadDecena = "setenta";
					
					if (unidad != 0) {
						cadDecena = cadDecena + " y " ;				
					}
				}
				
				case 8 -> {
					cadDecena = "ochenta";
					
					if (unidad != 0) {
						cadDecena = cadDecena + " y " ;				
					}
				}
				
				case 9 -> {
					cadDecena = "noventa";
					
					if (unidad != 0) {
						cadDecena = cadDecena + " y " ;					
					}
				}
				
				}
			}
			}
		}
		// IMPRIMIR RESULTADO PANTALLA
		System.out.println(result.equals("") ? cadDecena + cadUnidad : result);

		// CERRAR OBJETO SCANNER
		sc.close();

	
		}	
}