package boletinwhile;

import java.util.Scanner;

public class Ejer6 {
	public static void main(String[] args) {
		
		// DECLARAR VARIABLE PARA ALMACENAR ALTURA
		int altura;
		
		// DECLARAR VARIABLE PARA ALMACENAR ALTURA MÁX
		int altMax;
		
		// CREAR OBJETO SCANNER
		Scanner sc = new Scanner(System.in);
		
		// IMPRIMIR MENSAJE CONSOLA -> INTRODUCIR VALOR
		System.out.println("Introduce altura del árbol 'cm': ");
		
		// LEER Nº TIPO ENTERO (INT)
		altura = sc.nextInt();
		
		// ASIGNAR VARIABLE ALTURA A ALTURA MÁX
		altMax = altura;
		
		// CREAR BUCLE WHILE -> DETERMINAR ALTURA MÁX DE ÁRBOLES
		while (altura != -1) {
			
			// DEFINIR CONDICIONAL IF -> SI ALT ES > ALT MÁX - ASIGNAR VALOR ALT A ALT MÁX, SI NO NADA
			if (altura > altMax) {
				altMax = altura;
			}
		}
		
		System.out.println(altMax != -1 ? "La altura máxima es: " + altMax : "Se ha introducido un valor inválido");
		
		// CERRAR OBJETO SCANNER
		sc.close();
		
	}
}
