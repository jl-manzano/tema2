package boletinifelse;

import java.util.Scanner;

public class Ejer2 {
	public static void main(String[] args) {
		
		//DEFINIR VARIABLES TIPO INT
		int n1;
		int n2;
				
		// CREAR OBJETO SCANNER QUE PERMITE LEER ENTRADAS DATOS DESDE CONSOLA
		Scanner sc = new Scanner(System.in);
				
		// IMPRIMIR MENSAJE EN CONSOLA PARA INTRODUCIR VALOR
		System.out.println("Introduce un nº: ");
			
		// LEER Nº ENTERO (INT) INGRESADO EN CONSOLA
		n1 = sc.nextInt();
		
		//IMPRIMIR MENSAJE EN CONSOLA PARA INTRODUCIR VALOR
		System.out.println("Introduce otro nº: ");
		
		// LEER Nº ENTERO (INT) INGRESADO EN CONSOLA
		n2 = sc.nextInt();	
		
		// DEFINIR CONDICIONAL IF
		if (n1 == n2) {
			// IMPRIMIR RESULTADO PANTALLA SI SON IGUALES
			System.out.println(n1 + " y " + n2 + " son iguales.");
		} else {
			// IMPRIMIR RESULTADO EN PANTALLA SI NO SON IGUALES
			System.out.println(n1 + " y " + n2 + " no son iguales.");
		}
		
		// CERRAR OBJETO SCANNER
		sc.close();
	}
}
