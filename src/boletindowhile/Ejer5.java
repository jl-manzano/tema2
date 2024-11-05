package boletindowhile;

import java.util.Random;
import java.util.Scanner;

public class Ejer5 {
	public static void main(String[] args) {

		// declarar variable para almacenar min
		int min = 1;
		
		// declarar variable para almacenar max
		int max = 101;
		
		// declarar variable para almacenar num aleat.
		int random;
		
		// declarar variable para almacenar num usuario
		int num;


		// generar num aleat. entre min (1) y max (101) -> 1-100
		Random rand = new Random();
		
		// definir num aleat. generado a variable random
		random = rand.nextInt(min, max);
		
		// crear scanner
		Scanner sc = new Scanner(System.in);

		// pedir num a usuario
		System.out.println("Introduzca su nº: ");

		// leer nº introducido por el usuario
		num = sc.nextInt();
		
		// crear bucle do-while
		do {
			
			System.out.println();
			
			// definir condicional if -> comprobar si random > num 
			System.out.println("¿Es el número " + random + "?");
			
			if (random > num) { // entrará si random > num
				max = random;
				System.out.println("El nº pensado es menor\n");
			}
			
			// definir condicional if -> comprobar si random < num 
			
			if (random < num) { // entrará si random < num
				min = random;
				System.out.println("El nº pensado es mayor\n");
			}
			
			// generar num aleat. entre min y max
			random = rand.nextInt(min, max);
			
		} while (random != num);
		
		System.out.println("El ordenador ha adivinado tu número.");
		
		sc.close();
	}
}
