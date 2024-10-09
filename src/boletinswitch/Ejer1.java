package boletinswitch;

import java.util.Scanner;

public class Ejer1 {
	public static void main(String[] args) {
		
		// DECLARAR VARIABLE TIPO ENTERO (INT)
		int nota;
		
		// CREAR OBJETO SCANNER
		Scanner sc = new Scanner(System.in);
		
		// IMPRIMIR MENSAJE CONSOLA PARA INTRODUCIR VALOR
		System.out.println("Introduzca su nota: ");
		
		// LEER Nº TIPO ENTERO (INT) INGRESADO EN CONSOLA
		nota = sc.nextInt();
		
		// DEFINIR CONDICIONAL SWITCH, VA COMPARANDO LA NOTA CON CADA OPCIÓN, SI SE CORRESPONDE, ENTRA Y PARA
		switch (nota) {
		case 0,1,2,3,4 -> // ENTRA SI NOTA CORRESPONDE CON 0,1,2,3 o 4
		System.out.println("INSUFICIENTE"); 
		case 5 -> // ENTRA SI NOTA CORRESPONDE CON 0,1,2,3 o 4
		System.out.println("SUFICIENTE"); 
		case 6 -> // ENTRA SI NOTA CORRESPONDE CON 6
		System.out.println("BIEN");
		case 7,8 -> // ENTRA SI NOTA CORRESPONDE CON 7 o 8
		System.out.println("NOTABLE");
		case 9,10 -> // ENTRA SI NOTA CORRESPONDE CON 9,10
		System.out.println("SOBRESALIENTE");
		default -> // ENTRA SI NOTA NO COINCIDE CON UNA NOTA EN EL RANGO
		System.out.println("SIN COINCIDENCIAS");
		}
		
		// CERRAR OBJETO SCANNER
		sc.close();
	}
}
