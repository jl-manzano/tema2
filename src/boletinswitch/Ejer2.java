package boletinswitch;

import java.util.Scanner;

public class Ejer2 {
	public static void main(String[] args) {
		
		// DECLARAR VARIABLE TIPO ENTERO (INT)
		int num;
		
		// CREAR OBJETO SCANNER
		Scanner sc = new Scanner(System.in);
		
		// IMPRIMIR MENSAJE CONSOLA PARA INTRODUCIR VALOR
		System.out.println("Introduzca un nº del 1 al 7: ");
				
		// LEER Nº TIPO ENTERO (INT) INGRESADO EN CONSOLA
		num = sc.nextInt();
		
		// DEFINIR CONDICIONAL SWITCH -> COMPARAR Nº CON CADA OPCIÓN, SI CORRESPONDE ENTRA, SI NO, PARA
		switch(num) {
		case 1 -> // ENTRA SI NUM CORRESPONDE CON 1
		System.out.println("Lunes");
		case 2 -> // ENTRA SI NUM CORRESPONDE CON 2
		System.out.println("Martes");
		case 3 -> // ENTRA SI NUM CORRESPONDE CON 3
		System.out.println("Miércoles");
		case 4 -> // ENTRA SI NUM CORRESPONDE CON 4
		System.out.println("Jueves");
		case 5 -> // ENTRA SI NUM CORRESPONDE CON 5
		System.out.println("Viernes");
		case 6 -> // ENTRA SI NUM CORRESPONDE CON 6
		System.out.println("Sábado");
		case 7 -> // ENTRA SI NUM CORRESPONDE CON 7
		System.out.println("Domingo");
		default -> // ENTRA SI NUM CORRESPONDE CON UN Nº EN EL RANGO
		System.out.println("Sin coincidencias");
		}
		
		// CERRAR OBJETO SCANNER
		sc.close();
	}
}
