package boletindowhile;

import java.util.Scanner;

public class Ejer6 {
	public static void main(String[] args) {

		// declarar constantes piedra, papel, tijera
		final String PIEDRA = "PIEDRA";
		final String PAPEL = "PAPEL";
		final String TIJERA = "TIJERA";

		// declarar variable para almacenar la respuesta del jug1
		String jug1;

		// declarar variable para almacenar la respuesta del jug2
		String jug2;

		// declarar variable para almacenar la respuesta para volver a jugar o no
		String playAgain = "";

		// crear scanner
		Scanner sc = new Scanner(System.in);

		System.out.println("PIEDRA, PAPEL O TIJERA");
		
		// crear bucle do-while - engloba el programa

		do {
			
			// crear bucle do-while -> mientras que jug1 no introduzca valor válido
			do {
				
				// pedir opcion a usuario
				System.out.println("\nJugador 1: ELIGE PIEDRA, PAPEL O TIJERA");
				
				// leer opcion introducida por usuario
				jug1 = sc.next();
				
			} while (!jug1.equalsIgnoreCase(PIEDRA) && !jug1.equalsIgnoreCase(PAPEL) && !jug1.equalsIgnoreCase(TIJERA));

			// crear bucle do-while - mientras que jug2 no introduzca valor válido
			do {

				// pedir opcion a usuario
				System.out.println("\nJugador 2: ELIGE PIEDRA, PAPEL O TIJERA");
				
				// leer opcion introducida por usuario
				jug2 = sc.next();
				
			} while (!jug2.equalsIgnoreCase(PIEDRA) && !jug2.equalsIgnoreCase(PAPEL) && !jug2.equalsIgnoreCase(TIJERA));

			// definir condicional if - else-if - else -> determinar ganador
			
			if (jug1.equals(jug2)) { // entra si ambos han introducido un valor equivalente
				
				// imprime empate
				System.out.println("\nEMPATE");
				
				// entra si alguna condición de las 3 se cumple, por tanto, ganaría el jug1
			} else if (jug1.equalsIgnoreCase(PIEDRA) && jug2.equalsIgnoreCase(TIJERA) || jug1.equalsIgnoreCase(PAPEL) && jug2.equalsIgnoreCase(PIEDRA) || jug1.equalsIgnoreCase(TIJERA)) {
				
				// imprime gana el jug1
				System.out.println("\nGANA EL JUGADOR 1");
				
				// entra si no se cumple ninguna condición
			} else {
				
				// imprime gana el jug1
				System.out.println("\nGANA EL JUGADOR 2");
			}

			// preguntar a usuario si desea continuar jugando
			System.out.println("\nDesea seguir jugando? (S/N)");
			
			// leer respuesta usuario
			playAgain = sc.next();
			
		} while (playAgain.equalsIgnoreCase("S"));
		
		// fin del juego
		System.out.println("\nGracias por jugar.");
		
		// cerrar scanner
		sc.close();
	}
}
