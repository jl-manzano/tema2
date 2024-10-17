package boletinwhile;

import java.util.Scanner;

public class Ejer4 {
	public static void main(String[] args) {
		
		// DECLARAR VARIABLE PARA ALMACENAR NUM
		int num;
		
		// DECLARAR VARIABLE PARA ALMACENAR CONTADOR
		int contador = 1;
		
		// DECLARAR VARIABLE PARA SUMAR NUMs (+)
		int sumaP = 0;
		
		// DECLARAR VARIABLE PARA SUMAR NUMs (-)
		int sumaN = 0;
		
		// DECLARAR VARIABLE PARA ALMACENAR CONTADOR NUMs (-)
		int contadorN = 0;
		
		// DECLARAR VARIABLE PARA ALMACENAR CONTADOR CEROS
		int contadorC = 0;
		
		// DECLARAR VARIABLE PARA CALCULAR MEDIA NUMs
		double media;
		
		// CREAR OBJETO SCANNER
		Scanner sc = new Scanner(System.in);
		
		// CREAR BUCLE WHILE -> ASEGURAR INTRODUZCA 10 NUMs 
		while (contador <= 10) {
			
			// IMPRIMIR MENSAJE CONSOLA -> INTRODUCIR VALOR
			System.out.println("Introduce un / otro nº: ");
			
			// LEER Nº TIPO ENTERO (INT)
			num = sc.nextInt();
			
			// INCREMENTAR EN 1 VARIABLE CONTADOR
			contador++;
			
			// DEFINIR CONDICIONAL -> DETERMINAR SI NUM ES > 0 - SUMAR Nºs; SI NO
			if (num > 0) {
				
				// SUMAR Nº INGRESADO A VARIABLE sumaP
				sumaP += num;
			
			// ESTABLECER 2a CONDICIÓN -> DETERM. SI NUM ES < 0, SUMAR E INCREMENTAR VARIABLE CONTADOR Nºs NEGATIVOS
			} else if (num < 0) { 
				
				// INCREMENTAR EN 1 VARIABLE contadorN
				contadorN++;
				
				// SUMAR Nº INGRESADO A VARIABLE sumaN
				sumaN += num;
				
			} else {
				
				// INCREMENTAR EN 1 CONTADOR CEROS
				contadorC++;
				
			}
			
		}
		
		// CALCULAR MEDIA ARITMÉTICA CON OPERADOR TERNARIO - Nºs NEGATIVOS INTRODUCIDOS
		media = contadorN > 0 ? (double) sumaN / contadorN : 0;
		
		// IMPRIMIR RESULTADO PANTALLA
		System.out.println("\nSuma de Nºs positivos introducidos: " + sumaP);
		System.out.println("Media aritmética de Nºs negativos introducidos: " + media);
		System.out.println("Cantidad de 0 introducidos: " + contadorC);
		
		// CERRAR OBJETO SCANNER
		sc.close();
		
	}
}
