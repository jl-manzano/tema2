package paqueterepasot2;

import java.util.Scanner;

public class EjercicioExamen {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int hora = -1, minuto = -1, segundo = -1;
		boolean datosValidos = false;

		do {
			try {
				System.out.println("Introduzca la hora (0-12): ");
				hora = sc.nextInt();
				System.out.println("Introduzca los minutos (0-59): ");
				minuto = sc.nextInt();
				System.out.println("Introduzca los segundos (0-59): ");
				segundo = sc.nextInt();

				if (hora < 0 || hora > 23 || minuto < 0 || minuto > 59 || segundo < 0 || segundo > 59) {
					System.out.println("Error: Valores no válidos. Intente de nuevo.");
				} else {
					datosValidos = true;

					String textoHora = "", textoMinuto = "", textoSegundo = "";

					// Convertir la hora a texto
					for (int i = 0; i < 3; i++) {
						int valor = (i == 0) ? hora : (i == 1) ? minuto : segundo;
						String texto = "";

						switch (valor) {
						case 0 -> texto = "cero";
						case 1 -> texto = "uno";
						case 2 -> texto = "dos";
						case 3 -> texto = "tres";
						case 4 -> texto = "cuatro";
						case 5 -> texto = "cinco";
						case 6 -> texto = "seis";
						case 7 -> texto = "siete";
						case 8 -> texto = "ocho";
						case 9 -> texto = "nueve";
						case 10 -> texto = "diez";
						case 11 -> texto = "once";
						case 12 -> texto = "doce";
						case 13 -> texto = "trece";
						case 14 -> texto = "catorce";
						case 15 -> texto = "quince";
						case 20 -> texto = "veinte";
						case 30 -> texto = "treinta";
						case 40 -> texto = "cuarenta";
						case 50 -> texto = "cincuenta";
						default -> {
							int decena = valor / 10;
							int unidad = valor % 10;
							switch (decena) {
							case 1 -> texto = "dieci" + switch (unidad) {
							case 1 -> "uno";
							case 2 -> "dos";
							case 3 -> "tres";
							case 4 -> "cuatro";
							case 5 -> "cinco";
							case 6 -> "seis";
							case 7 -> "siete";
							case 8 -> "ocho";
							case 9 -> "nueve";
							default -> "";
							};
							case 2 -> texto = "veinti" + switch (unidad) {
							case 1 -> "uno";
							case 2 -> "dos";
							case 3 -> "tres";
							case 4 -> "cuatro";
							case 5 -> "cinco";
							case 6 -> "seis";
							case 7 -> "siete";
							case 8 -> "ocho";
							case 9 -> "nueve";
							default -> "";
							};
							case 3 -> texto = "treinta y " + switch (unidad) {
							case 1 -> "uno";
							case 2 -> "dos";
							case 3 -> "tres";
							case 4 -> "cuatro";
							case 5 -> "cinco";
							case 6 -> "seis";
							case 7 -> "siete";
							case 8 -> "ocho";
							case 9 -> "nueve";
							default -> "";
							};
							case 4 -> texto = "cuarenta y " + switch (unidad) {
							case 1 -> "uno";
							case 2 -> "dos";
							case 3 -> "tres";
							case 4 -> "cuatro";
							case 5 -> "cinco";
							case 6 -> "seis";
							case 7 -> "siete";
							case 8 -> "ocho";
							case 9 -> "nueve";
							default -> "";
							};
							case 5 -> texto = "cincuenta y " + switch (unidad) {
							case 1 -> "uno";
							case 2 -> "dos";
							case 3 -> "tres";
							case 4 -> "cuatro";
							case 5 -> "cinco";
							case 6 -> "seis";
							case 7 -> "siete";
							case 8 -> "ocho";
							case 9 -> "nueve";
							default -> "";
							};
							}
						}
						}

						if (i == 0)
							textoHora = texto;
						else if (i == 1)
							textoMinuto = texto;
						else
							textoSegundo = texto;
					}

					System.out.println("La hora es: " + textoHora + " horas, " + textoMinuto + " minutos y "
							+ textoSegundo + " segundos.");
				}
			} catch (Exception e) {
				System.out.println("Error: Debe introducir valores numéricos. Intente de nuevo.");
				sc.nextLine();
			}
		} while (!datosValidos);

		sc.close();
	}
}
