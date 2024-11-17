package paqueterepasot2;

import java.util.Random;
import java.util.Scanner;

public class Examen {
	public static void main(String[] args) {

		// variable para almacenar respuesta jugador
		char opcion = ' ';

		// variable para almacenar carta generada
		int carta = 0;

		// variable para almacenar tipo carta
		int tipoCarta = 0;

		// variable para almacenar valor tipo carta
		String valorTipoCarta = "";

		// variable para almacenar valor carta
		double valorCarta;

		// variable para almacenar valor 'boolean' -> juego continúa o no
		boolean juegoCont = true;

		// variable para almacenar turno
		int turno = 1;

		// variable para almacenar contadorJug1
		double contadorJug1 = 0;

		// variable para almacenar contadorJug1
		double contadorJug2 = 0;

		// crear scanner
		Scanner sc = new Scanner(System.in);

		// crear clase random
		Random rand = new Random();

		System.out.println("JUEGO DE LAS 7 Y MEDIA");

		while (juegoCont) {

			System.out.println("\nTurno del jugador " + turno);

			do {
				try {
					// pedir opcion a usuario
					System.out.println("Desea pedir una carta: ");

					// leer opción introducida por usuario
					opcion = sc.nextLine().toLowerCase().charAt(0);

					assert opcion == 's' || opcion == 'n' : "Introduzca (sí) 's' o (no) 'n'.";

				} catch (AssertionError e) {
					System.out.println(e.getMessage());
				} catch (Exception e) {
					System.out.println("Error. Introduzca un carácter. ('s' o 'n')");
				}

			} while (opcion != 's' && opcion != 'n');

			if (opcion == 's') {
				// generar carta aleatoria
				carta = rand.nextInt(1, 11);

				// generar tipo carta aleatoria
				tipoCarta = rand.nextInt(1, 5);

				switch (tipoCarta) {
				case 1 -> {
					valorTipoCarta = "oros";
				}

				case 2 -> {
					valorTipoCarta = "copas";

				}

				case 3 -> {
					valorTipoCarta = "espadas";

				}

				case 4 -> {
					valorTipoCarta = "bastos";

				}

				}

				// asignar valor carta
				valorCarta = carta >= 8 ? 0.5 : carta;

				if (carta <= 7) {
					System.out.println("Tu carta es: " + carta + " de " + valorTipoCarta);
				} else if (carta == 8) {
					System.out.println("Tu carta es: Sota de " + valorTipoCarta);

				} else if (carta == 9) {
					System.out.println("Tu carta es: Caballo de " + valorTipoCarta);

				} else {
					System.out.println("Tu carta es: Rey de " + valorTipoCarta);

				}

				if (turno == 1) {
					contadorJug1 += valorCarta;
					System.out.println("Tienes " + contadorJug1 + " puntos.\n");
					if (contadorJug1 > 7.5) {
						System.out.println("Te has pasado.\n");
						turno = 2;
					}

				} else {
					contadorJug2 += valorCarta;
					System.out.println("Tienes " + contadorJug2 + " puntos.\n");
					if (contadorJug2 > 7.5) {
						System.out.println("Te has pasado.\n");
						juegoCont = false;
					}
				}

			} else if (turno == 1 && opcion == 'n') {
				turno = 2;
			} else {
				juegoCont = false;
				System.out.println("\nSaliendo del juego ...");
			}

		}

		System.out.println("\nRESULTADO FINAL");
		System.out.println("Puntuación del Jugador 1: " + contadorJug1);
		System.out.println("Puntuación del Jugador 2: " + contadorJug2);

		if (contadorJug1 > 7.5 && contadorJug2 > 7.5) {
			System.out.println("\nAmbos jugadores se han pasado. No hay ganador.");
		} else if (contadorJug1 == contadorJug2) {
			System.out.println("\nHay un empate.");
		} else if (contadorJug1 > 7.5) {
			System.out.println("\nGana el Jugador 2 porque el Jugador 1 se ha pasado.");
		} else if (contadorJug2 > 7.5) {
			System.out.println("\nGana el Jugador 1 porque el Jugador 2 se ha pasado.");
		} else if (contadorJug1 > contadorJug2) {
			System.out.println("\nGana el Jugador 1");
		} else {
			System.out.println("\nGana el Jugador 2");
		}
	}
}
