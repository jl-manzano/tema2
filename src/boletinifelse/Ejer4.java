package boletinifelse;

import java.util.Scanner;

public class Ejer4 {
	public static void main(String[] args) {
		//DEFINIR VARIABLES TIPO DECIMAL
				double n1;
				double n2;
						
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
				
				// DEFINIR CONDICIONAL IF
				if (n1 > n2) {
					// IMPRIMIR RESULTADO PANTALLA SI N1 ES > QUE N2
					System.out.println(n1 + " es mayor que " + n2 + ".");
				} else if (n1 == n2) {
					// IMPRIMIR RESULTADO PANTALLA SI N1 Y N2 SON IGUALES
					System.out.println(n1 + " y " + n2 + " son iguales.");
				} else {
					// IMPRIMIR RESULTADO PANTALLA SI N2 ES > QUE N1
					System.out.println(n2 + " es mayor que " + n1 + ".");
				}
				
				// CERRAR OBJETO SCANNER
				sc.close();
	}
}
