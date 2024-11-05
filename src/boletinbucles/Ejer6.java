package boletinbucles;

import java.util.Scanner;

public class Ejer6 {
	public static void main(String[] args) {
		
		// declarar variable para almacenar num
		int num;
		
		// crear scanner
		Scanner sc = new Scanner(System.in);

		// pedir num a usuario
		System.out.println("Introduzca un nº: ");

		// leer num introducido por usuario
		num = sc.nextInt();
		
		// crear bucle for
		for (int i = 0; i <= num; i++) {
			for (int j = num - i; j >= 1; j--) {
				System.out.print(" ");
			}
			
			for (int k = 0; k <= i; k++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
		// cerrar scanner
		sc.close();
		
	}
}
