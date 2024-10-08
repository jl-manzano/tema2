package boletin_ifelse;

import java.util.Scanner;

public class Ejer5 {
	public static void main(String[] args) {
		//DEFINIR VARIABLES TIPO DECIMAL
				double n1;
				double n2;
				double n3;
						
				// CREAR OBJETO SCANNER QUE PERMITE LEER ENTRADAS DATOS DESDE CONSOLA
				Scanner sc = new Scanner(System.in);
						
				// IMPRIMIR MENSAJE EN CONSOLA PARA INTRODUCIR VALOR
				System.out.println("Introduce un nº: ");
					
				// LEER Nº (TIPO DOUBLE) INGRESADO EN CONSOLA
				n1 = sc.nextDouble();
				
				//IMPRIMIR MENSAJE EN CONSOLA PARA INTRODUCIR VALOR
				System.out.println("Introduce otro nº: ");
				
				// LEER Nº (TIPO DOUBLE) INGRESADO EN CONSOLA
				n2 = sc.nextDouble();
				
				//IMPRIMIR MENSAJE EN CONSOLA PARA INTRODUCIR VALOR
				System.out.println("Introduce otro nº: ");
				
				// LEER Nº (TIPO DOUBLE) INGRESADO EN CONSOLA
				n3 = sc.nextDouble();
				
				// DEFINIR CONDICIONAL IF
				if (n1 >= n2 && n2 >= n3) {
					// IMPRIMIR RESULTADO PANTALLA SI N1 >= N2 y N2 >= N3
					System.out.println(n1 + "," + n2 + "," + n3);
				} else if (n1 >= n3 && n3 >= n2 ) {
					// IMPRIMIR RESULTADO PANTALLA SI N1 >= N3 y N3 >= N2
					System.out.println(n1 + "," + n3 + "," + n2);
				} else if (n2 > n1 && n1 > n3 ) {
					// IMPRIMIR RESULTADO PANTALLA SI N2 >= N1 y N1 >= N3
					System.out.println(n2 + "," + n1 + "," + n3);
				} else if (n2 > n3 && n3 > n1 ) {
					// IMPRIMIR RESULTADO PANTALLA SI N2 >= N3 y N3 >= N1
					System.out.println(n2 + "," + n3 + "," + n1);
				} else if (n3 > n1 && n1 > n2 ) {
					// IMPRIMIR RESULTADO PANTALLA SI N3 >= N1 y N1 >= N2
					System.out.println(n3 + "," + n1 + "," + n2);
				} else {
					// IMPRIMIR RESULTADO PANTALLA SI N3 >= N2 y N2 >= N1
					System.out.println(n3 + "," + n2 + "," + n1);
				}
				
				// CERRAR OBJETO SCANNER
				sc.close();
	}
}
