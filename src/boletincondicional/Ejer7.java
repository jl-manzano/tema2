package boletincondicional;

import java.util.Scanner;

public class Ejer7 {
	public static void main(String[] args) {
		
		// DECLARAR VARIABLES TIPO DECIMAL (DOUBLE) Y ENTERO (INT)
		double precioBillete = 0;
		double distancia;
		int diasEstancia;
		
		// DECLARAR CONSTANTE TIPO DECIMAL (DOUBLE)
		final double precioKm = 2.5;
		
		// CREAR OBJETO SCANNER
		Scanner sc = new Scanner(System.in);
		
		// IMPRIMIR MENSAJE CONSOLA PARA INTRODUCIR VALOR
		System.out.println("Introduce la distancia de su viaje de tren: ");
		
		// LEER Nº DECIMAL (DOUBLE) INGRESADO EN CONSOLA
		distancia = sc.nextDouble();
		
		// IMPRIMIR MENSAJE CONSOLA PARA INTRODUCIR VALOR
		System.out.println("Introduce el nº de días de estancia de su viaje: ");
		
		// LEER Nº ENTERO (INT) INGRESADO EN CONSOLA
		diasEstancia = sc.nextInt();
		
		// DEFINIR CONDICIONAL IF -> DETERMINAR EL PRECIO DEL BILLETE
		if (distancia <= 0) {
			System.out.println("Distancia del recorrido inválida.");
		} else {
			if (distancia > 800 && diasEstancia > 7) {
				precioBillete = (precioKm * distancia) - (precioKm * distancia) * 30 / 100;
				
			} else {
				precioBillete = (precioKm * distancia);
			}
		}
		
		// IMPRIMIR RESULTADO PANTALLA
		System.out.println("El precio de su billete de tren es de: " + precioBillete);
		
		// CERRAR OBJETO SCANNER
		sc.close();
	}
}
