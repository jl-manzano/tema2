package boletinbucles;

import java.util.Scanner;

public class Ejer10 {
	public static void main(String[] args) {
				
		// declarar variable para almacenar un num
		long num;
		
		// declarar variable para almacenar número original;
		long numOriginal;
		
		// declarar variable para almacenar dígito
		long digito;
		
		// declarar variable para almacenar dígito
		long numInverso = 0;
		
		// crear scanner
		Scanner sc = new Scanner(System.in);

		// crear bucle do-while -> asegurarse de que usuario introduzca num > 0
		do {
		// pedir num a usuario
		System.out.println("Introduzca un nº: ");

		// leer num introducido por usuario
		num = sc.nextLong();
		
		} while (num < 0);
		
		// asignar variable num a variable numOriginal
		numOriginal = num;
		
		// crear bucle while
		while (num > 0) {
			
			// obtener último dígito
			digito = num % 10;
			
			// vamos calculando num invertido
			numInverso = numInverso * 10 + digito;
			
			// eliminar último dígito
			num /= 10;
		}
		
		// definir condicional if-else -> comprobar si n es capicúa o no
		if (numOriginal == numInverso) { // entra si num es capicúa
			System.out.println("\nEl número " + numOriginal + " es capicúa.");
		} else { // entra si num no es capicúa
			System.out.println("\nEl número " + numOriginal + " no es capicúa.");

		}
		
		// cerrar scanner
		sc.close();
	}
}
