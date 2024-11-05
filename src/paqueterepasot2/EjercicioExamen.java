package paqueterepasot2;

import java.util.Random;

public class EjercicioExamen {
	public static void main(String[] args) {
		
		// crear clase random
		Random rand = new Random();

		// declarar variable para almacenar valor aleatorio dado1
		int dado1;

		// declarar variable para almacenar valor aleatorio dado2
		int dado2;

		// declarar variable para almacenar posición jug1 en partida
		int posicionJug1 = 0;

		// declarar variable para almacenar posición jug2 en partida
		int posicionJug2 = 0;

		// declarar variable para almacenar total resultado dados
		int total;

		// declarar variable para almacenar posición jug2 en partida
		int posicionActual;

		// declarar variable para almacenar turno jug
		int turno = 1;

		// declarar variable boolean -> comprobar si vuelve a tirar
		boolean vuelveTirar = false;

		// declarar e inicializar variable de la meta del juego
		int meta = 63;
		
		while (posicionJug1 < meta && posicionJug2 < meta) {
			System.out.println("Turno del Jugador " + turno);
			
			dado1 = rand.nextInt(1, 6);
			dado2 = rand.nextInt(1, 6);
			
			System.out.println("Dado 1: " + dado1 + " , Dado 2: " + dado2);
			
			total = dado1 + dado2;
			
			if (turno == 1) {
				posicionActual = posicionJug1 + total;
			} else {
				posicionActual = posicionJug2 + total;

			}
			
			System.out.println("Jugador " + turno + " avanza a la posición " + posicionActual);

			switch (posicionActual) {
			case 5 -> {
				posicionActual = 9;
				System.out.println("¡De oca en oca! Salta a la casilla 9 y vuelve a tirar.");
				vuelveTirar = true;
			}
			case 9 -> {
				posicionActual = 14;
				System.out.println("¡De oca en oca! Salta a la casilla 14 y vuelve a tirar.");
				vuelveTirar = true;
			}
			case 14 -> {
				posicionActual = 18;
				System.out.println("¡De oca en oca! Salta a la casilla 18 y vuelve a tirar.");
				vuelveTirar = true;
			}
			case 18 -> {
				posicionActual = 23;
				System.out.println("¡De oca en oca! Salta a la casilla 23 y vuelve a tirar.");
				vuelveTirar = true;
			}
			case 23 -> {
				posicionActual = 27;
				System.out.println("¡De oca en oca! Salta a la casilla 27 y vuelve a tirar.");
				vuelveTirar = true;
			}
			case 27 -> {
				posicionActual = 32;
				System.out.println("¡De oca en oca! Salta a la casilla 32 y vuelve a tirar.");
				vuelveTirar = true;
			}
			case 32 -> {
				posicionActual = 36;
				System.out.println("¡De oca en oca! Salta a la casilla 36 y vuelve a tirar.");
				vuelveTirar = true;
			}
			case 36 -> {
				posicionActual = 41;
				System.out.println("¡De oca en oca! Salta a la casilla 41 y vuelve a tirar.");
				vuelveTirar = true;
			}
			case 41 -> {
				posicionActual = 45;
				System.out.println("¡De oca en oca! Salta a la casilla 45 y vuelve a tirar.");
				vuelveTirar = true;
			}
			case 45 -> {
				posicionActual = 50;
				System.out.println("¡De oca en oca! Salta a la casilla 50 y vuelve a tirar.");
				vuelveTirar = true;
			}
			case 50 -> {
				posicionActual = 54;
				System.out.println("¡De oca en oca! Salta a la casilla 54 y vuelve a tirar.");
				vuelveTirar = true;
			}
			case 54 -> {
				posicionActual = 59;
				System.out.println("¡De oca en oca! Salta a la casilla 59 y vuelve a tirar.");
				vuelveTirar = true;
			}

			default -> {
				System.out.println("Ninguna acción especial.");
				vuelveTirar = false;
			}
			
			}
			
			System.out.println();
			
			if (turno == 1) {
				posicionJug1 = posicionActual;
				
				if (posicionJug1 >= meta) {
					System.out.println("Has ganado Jug1");
				}
			} else {
				posicionJug2 = posicionActual;
				
				if (posicionJug2 >= meta) {
					System.out.println("Has ganado Jug2");
				}
			}
			
			if (!vuelveTirar) {
				turno = (turno == 1) ? 2 : 1;
			}
			
		}
	}
}
