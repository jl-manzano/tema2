package paqueterepasot2;

import java.util.Scanner;

public class PropuestaEjer {
	public static void main(String[] args) {
		// Crear objeto Scanner para leer entradas
        Scanner sc = new Scanner(System.in);

        // Pedir hora, minuto y segundo
        System.out.println("Introduzca la hora (0-12): ");
        int hora = sc.nextInt();

        System.out.println("Introduzca los minutos (0-59): ");
        int minuto = sc.nextInt();

        System.out.println("Introduzca los segundos (0-59): ");
        int segundo = sc.nextInt();

        // Validar los valores ingresados
        if (hora < 0 || hora > 12 || minuto < 0 || minuto > 59 || segundo < 0 || segundo > 59) {
            System.out.println("Error: Los valores ingresados son incorrectos.");
        } else {
            // Variables para almacenar los textos
            String horaTexto = "", minutoTexto = "", segundoTexto = "";

            // Convertir la hora a texto
            switch (hora) {
                case 0: horaTexto = "cero"; break;
                case 1: horaTexto = "una"; break;
                case 2: horaTexto = "dos"; break;
                case 3: horaTexto = "tres"; break;
                case 4: horaTexto = "cuatro"; break;
                case 5: horaTexto = "cinco"; break;
                case 6: horaTexto = "seis"; break;
                case 7: horaTexto = "siete"; break;
                case 8: horaTexto = "ocho"; break;
                case 9: horaTexto = "nueve"; break;
                case 10: horaTexto = "diez"; break;
                case 11: horaTexto = "once"; break;
                case 12: horaTexto = "doce"; break;
            }

            // Un único switch para convertir minutos y segundos
            for (int i = 0; i < 2; i++) {
                int valor = (i == 0) ? minuto : segundo;  // Si i == 0, trata los minutos; si i == 1, trata los segundos
                String texto = "";
                int decena = valor / 10;  // Obtener decena
                int unidad = valor % 10;  // Obtener unidad

                switch (decena) {
                    case 0:
                        texto = (valor == 0 ? "cero" : Integer.toString(valor)); // Si es 0, lo convierte en "cero"
                        break;
                    case 1:
                        switch (valor) {
                            case 10: texto = "diez"; break;
                            case 11: texto = "once"; break;
                            case 12: texto = "doce"; break;
                            case 13: texto = "trece"; break;
                            case 14: texto = "catorce"; break;
                            case 15: texto = "quince"; break;
                            default: texto = "dieci" + unidad; break;
                        }
                        break;
                    case 2: texto = (unidad == 0 ? "veinte" : "veinti" + unidad); break;
                    case 3: texto = (unidad == 0 ? "treinta" : "treinta y " + unidad); break;
                    case 4: texto = (unidad == 0 ? "cuarenta" : "cuarenta y " + unidad); break;
                    case 5: texto = (unidad == 0 ? "cincuenta" : "cincuenta y " + unidad); break;
                    default: texto = Integer.toString(valor); break; // No manejamos casos mayores de 59
                }

                if (i == 0) {
                    minutoTexto = texto;  // Asignar texto a minutos
                } else {
                    segundoTexto = texto;  // Asignar texto a segundos
                }
            }

            // Imprimir el resultado final
            System.out.println("La hora es: " + horaTexto + " horas, " + minutoTexto + " minutos y " + segundoTexto + " segundos.");
        }

        // Cerrar el objeto Scanner
        sc.close();
	}
}
