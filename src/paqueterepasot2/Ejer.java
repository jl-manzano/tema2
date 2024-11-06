/*package paqueterepasot2;

import java.util.Scanner;

public class Ejer {
	public static void main(String[] args) {
		int hora = 0;
		int minutos = 0;
		int segundos = 0;
		int valor;
		int decena;
		int unidad;
		String texto = "";
		String textoH = "";
		String textoM = "";
		String textoS = "";
		String cadUd = "";
		String cadDec = "";
		
		boolean datosValidos = false;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			try {
				System.out.println("Introduzca la hora (0-23): ");
				hora = sc.nextInt();
				System.out.println("Introduzca los minutos (0-59): ");
				minutos = sc.nextInt();
				System.out.println("Introduzca los segundos (0-59): ");
				segundos = sc.nextInt();			
				
				assert (hora < 0 || hora > 23 || minutos < 0 || minutos > 59 || segundos < 0 || segundos > 59):"Error: Valores no válidos. Intente de nuevo.";


			} catch (Exception e ) {
				System.out.println("Error. Debe introducir valores numéricos.");
			}
			
			
		} while (hora);
		
					for (int i = 0; i < 3; i++) {
						valor = (i == 0) ? hora : (i == 1) ? minutos : segundos;
						
						if (valor < 15) {
						switch (valor) {

						case 10 -> texto = "diez";
						case 11 -> texto = "once";
						case 12 -> texto = "doce";
						case 13 -> texto = "trece";
						case 14 -> texto = "catorce";
						case 15 -> texto = "quince";
						} else {
							decena = valor / 10;
							unidad = valor % 10;
							
							switch(decena) {
							case 1 -> {
								cadDec = "dieci";
							}
							case 2 -> {
								if (unidad == 0) {
									cadDec = "veinte"; 
								} else {
									cadDec = "veinti";
								}
							}
							case 3 -> {
								cadDec = "treinta";
								if (unidad != 0) {
									cadDec = cadDec + " y ";
								}
							}
							case 4 -> {
								cadDec = "cuarenta";
								if (unidad != 0) {
									cadDec = cadDec + " y ";
								}
							}
							case 5 -> {
								cadDec = "cincuenta";
								if (unidad != 0) {
									cadDec = cadDec + " y ";
								}
							}
						
							}
							
						}
						}
					
					}
					
				}
			

		
	}
}*/
