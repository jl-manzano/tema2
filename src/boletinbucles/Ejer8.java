package boletinbucles;

import java.util.Scanner;

public class Ejer8 {
	public static void main(String[] args) {

		// declarar variable para almacenar un num inicial
		int numInicial;

		// declarar variable para almacenar num1
		int num = 0;

		// declarar variable para almacenar total nºs introducidos
		int contadorNum = 1;

		// declarar variable para almacenar total nºs fallados
		int contadorFallos = 0;

		// crear scanner
		Scanner sc = new Scanner(System.in);

		// pedir num inicial a usuario
		System.out.println("Introduzca un nº inicial: ");

		// leer num introducido por usuario
		numInicial = sc.nextInt();
		
		 System.out.print("Introduzca un nº (0 para terminar): ");
         num = sc.nextInt();

		// crear bucle do-while
		while (num != 0) {  // El bucle se ejecuta mientras num sea distinto de 0
            contadorNum++;  // Contar el número introducido

            if (num > 0 && num <= numInicial) {  // Comprobar si es un fallo
                System.out.println("Fallo, es menor");
                contadorFallos++;
            }

            numInicial = num;  // Actualizar el valor inicial al último número introducido

            System.out.print("Introduzca un nº (0 para terminar): ");
            num = sc.nextInt();
        }

		// imprimir contador nºs introducidos en pantalla
		System.out.println("\nTotal de números introducidos: " + contadorNum);

		// imprimir contador nºs fallados en pantalla
		System.out.println("Números fallados: " + contadorFallos);

		// cerrar scanner
		sc.close();

	}
}
