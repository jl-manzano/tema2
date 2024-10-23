package boletinfor;

import java.util.Scanner;

public class Ejer1 {
	public static void main(String[] args) {
		
		// declarar una variable para almacenar un num
		int num;
				
		// crear scanner
		Scanner sc = new Scanner(System.in);
	
		// pedir num a usuario
		System.out.println("Introduzca un nº: ");
		
		// leer nº introducido por usuario
		num = sc.nextInt();
		
		// crear bucle for
		for (int i = 1; i <= num; i++) {
			
			// mostrar num
			System.out.println(i);
		}
		
		// cerrar scanner
		sc.close();
	}
}
