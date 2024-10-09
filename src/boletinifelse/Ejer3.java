package boletinifelse;

import java.util.Scanner;

public class Ejer3 {
	public static void main(String[] args) {
		
		// DEFINIR VARIABLE TIPO DECIMAL (DOUBLE)
		double num;

		// CREAR OBJETO SCANNER QUE PERMITE LEER ENTRADA DATOS DESDE CONSOLA
		Scanner sc = new Scanner(System.in);
		
		// IMPRIMIR MENSAJE EN CONSOLA PARA INTRODUCIR VALOR
		System.out.println("Introduzca un nº decimal rango [-1 a 1] (NO -> 0, 1, -1): ");
		
		// LEER Nº TIPO DECIMAL (DOUBLE) INGRESADO EN CONSOLA
		num = sc.nextDouble();
		
		// DEFINIR CONDICIONAL IF
		if (num <= -1 || num == 0 || num >= 1) {
			// IMPRIMIR RESULTADO PANTALLA SI EL Nº ESTÁ EXCLUIDO EN EL RANGO
			System.out.println("El nº " + num + " está excluido del rango.");
		} else {
			// IMPRIMIR RESULTADO PANTALLA SI EL Nº ES UN 'CASI-CERO'
			System.out.println("El nº " + num + " es un 'casi-cero'.");
		}
		
		// CERRAR OBJETO SCANNER
		sc.close();
	}
}
