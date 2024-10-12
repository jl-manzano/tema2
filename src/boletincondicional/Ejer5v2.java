package boletincondicional;

import java.util.Scanner;

public class Ejer5v2 {
	public static void main(String[] args) {
		
		// DECLARAR VARIABLES TIPO ENTERO (INT)
		int num1 = (int) (Math.random() * 99 + 1);
		int num2 = (int) (Math.random() * 99 + 1);
		int respuestaUsuario;
		int result;
		
		// IMPRIMIR MENSAJE CONSOLA CON Nºs A SUMAR POR EL USUARIO
		System.out.println("SUMA LOS SIGUIENTES Nºs:\n" + num1 + " + " + num2 + " = ?");
		
		// CREAR OBJETO SCANNER
		Scanner sc = new Scanner(System.in);
		
		// IMPRIMIR MENSAJE CONSOLA PARA - USUARIO INTRODUZCA VALOR
		System.out.println("\nIntroduzca el resultado de la suma entre " + num1 + " y " + num2 + ":");
		
		// LEER Nº ENTERO INGRESADO EN CONSOLA POR EL USUARIO
		respuestaUsuario = sc.nextInt();
		
		// DEFINIR VALOR RESULTADO CORRECTO SUMA
		result = (num1 + num2);
		
		// DEFINIR CONDICIONAL IF -> COMPARAR SI LA RESPUESTA USUARIO SE CORRESPONDE CON EL RESULTADO DE LA SUMA E IMPRIMIR RESULTADO
		if (respuestaUsuario == result) {
			System.out.println("\n¡Correcto! El resultado de la suma es: " + result);
		} else {
			System.out.println("\nIncorrecto. La respuesta correcta era " + result);			
		}
		
		// CERRAR OBJETO SCANNER
		sc.close();
	}
}
