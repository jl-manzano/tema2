package boletincondicional;

import java.util.Scanner;

public class Ejer8 {
	public static void main(String[] args) {
		
		// DECLARAR VARIABLES TIPO ENTERO (INT) y 'BOOLEANO'
		int mes;
		int year;
		boolean esBisiesto;
		int result = 0;
		
		// CREAR OBJETO SCANNER
		Scanner sc = new Scanner(System.in);
		
		// IMPRIMIR MENSAJE CONSOLA PARA INTRODUCIR VALOR
		System.out.println("Introduce el nº del mes: ");
		
		// LEER Nº TIPO ENTERO (INT) INGRESADO EN CONSOLA
		mes = sc.nextInt();
		
		// IMPRIMIR MENSAJE CONSOLA PARA INTRODUCIR VALOR
		System.out.println("Introduce el año: ");
		
		// LEER Nº TIPO ENTERO (INT) INGRESADO EN CONSOLA
		year = sc.nextInt();
		
		// COMPROBAR SI AÑO ES BISIESTO O NO 
		esBisiesto = year % 4 == 0;
		
		// DEFINIR CONDICIONAL SWITCH -> DETERMINAR Nº DIAS DEL MES
		switch(mes) {
		case 1, 3, 5, 7, 8, 10, 12 -> result = 31;
		case 2 -> {
			if (esBisiesto) { // ENTRA SI VARIABLE TIPO 'BOOLEAN' DEVUELVE 'TRUE' -> AÑO ES BISIESTO
				result = 29;
			} else { // ENTRA SI VARIABLE TIPO 'BOOLEAN' DEVUELVE 'FALSE' -> AÑO NO ES BISIESTO
				result = 28;
			}
		}
		case 4, 6, 9, 11 -> result = 30;
		default -> System.out.println("Mes no válido.");
		
		}
		
		// IMPRIMIR RESULTADO PANTALLA
		System.out.println("El mes " + mes + " del año " + year + " tiene " + result + " días.");
	
		// CERRAR OBJETO SCANNER
		sc.close();
	
	}
}
