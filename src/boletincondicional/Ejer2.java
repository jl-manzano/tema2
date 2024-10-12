package boletincondicional;

import java.util.Scanner;

public class Ejer2 {
	public static void main(String[] args) {

		// DECLARAR VARIABLES TIPO ENTERO (INT)
		int num;
		int absoluto;

		// CREAR OBJETO SCANNER
		Scanner sc = new Scanner(System.in);

		// IMPRIMIR MENSAJE CONSOLA PARA INTRODUCIR VALOR
		System.out.println("Introduzca un nº para calcular su valor absoluto: ");

		// LEER Nº ENTERO INGRESADO EN CONSOLA
		num = sc.nextInt();

		// DEFINIR OPERADOR TERNARIO -> CALCULAR VALOR ABSOLUTO DE Nº
		absoluto = num >= 0 ? num : -num;
		
		// IMPRIMIR RESULTADO PANTALLA
		System.out.println("El valor absoluto de " + num + " es " + absoluto + ".");

		// CERRAR OBJETO SCANNER
		sc.close();
		
	}
}
