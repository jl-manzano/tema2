package boletinbucles;

import java.util.Scanner;

public class Ejer9 {
	public static void main(String[] args) {
		
		// declarar variable para almacenar un num
		long num;
		
		// declarar variable para almacenar número original;
		long numOriginal;
		
		// declarar variable para almacenar contador dígitos num
		int contadorDigitos = 0;
		
		// crear scanner
		Scanner sc = new Scanner(System.in);

		// crear bucle do-while -> asegurarse de que usuario introduzca num > 0
		do {
		// pedir num a usuario
		System.out.println("Introduzca un nº: ");

		// leer num introducido por usuario
		num = sc.nextLong();
		
		} while (num <= 0);
		
		// asignar variable num a variable numOriginal
		numOriginal = num;
		
		// crear bucle while
		while (num > 0) {
		// dividir / 10 variable num y asignar a num
		num /= 10;
				
		// incrementar en 1 variable contadorDigitos
		contadorDigitos++;
	
		}
		
		// imprimir contador de dígitos del nº introducido
		System.out.println("\nNúmero de dígitos de " + numOriginal + ": " + contadorDigitos);
		
		// cerrar scanner
		sc.close();
		
	}
}
