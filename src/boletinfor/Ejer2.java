package boletinfor;

import java.util.Scanner;

public class Ejer2 {
	public static void main(String[] args) {
		
		// declarar variable para almacenar un num
		int num;
		
		// declarar variable para almacenar contador
		int contador = 0;
		
		// crear scanner
		Scanner sc = new Scanner(System.in);
		
		// pedir num a usuario
		System.out.println("Introduzca un nº: ");
		
		// leer num introducido por usuario
		num = sc.nextInt();
		
		// crear bucle for
		for (int i = 1; i <= num; i++) {
			
			// definir condicional if -> comprobar mult. de 3 hasta num
			if (i % 3 == 0) { // entra si i es mult. de 3
				
				// incrementa en 1 el contador
				contador++;
			}
			
		}
		
		// imprimir contador en pantalla
		System.out.println("Hay " + contador + " múltiplos de 3 desde el 1 hasta el " + num );
		
		// cerrar scanner
		sc.close();
	}
}
