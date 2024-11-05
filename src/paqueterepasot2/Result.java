package paqueterepasot2;

import java.util.Random;

class JuegoDeLaOca {
    public static void main(String[] args) {
        Random random = new Random();
        int meta = 63, jugador1Pos = 0, jugador2Pos = 0, turno = 1;
        boolean jugador1EnPozo = false, jugador2EnPozo = false;

        System.out.println("¡Bienvenido al Juego de la Oca!");

        while (jugador1Pos < meta && jugador2Pos < meta) {
            System.out.println("\nTurno del Jugador " + turno);

            // Revisar si el jugador está en el pozo
            if ((turno == 1 && jugador1EnPozo) || (turno == 2 && jugador2EnPozo)) {
                System.out.println("¡Jugador " + turno + " está en el pozo! No puede jugar este turno.");
                if (turno == 1) jugador1EnPozo = false;
                else jugador2EnPozo = false;

                turno = (turno == 1) ? 2 : 1; // Cambia al siguiente jugador
                continue; // Salta al siguiente turno
            }

            // Lanzar los dados
            int dado1 = random.nextInt(6) + 1;
            int dado2 = random.nextInt(6) + 1;
            int total = dado1 + dado2;

            System.out.println("Dado 1: " + dado1 + ", Dado 2: " + dado2);
            int posicionActual = (turno == 1) ? jugador1Pos : jugador2Pos;

            // Regla especial de los dados para saltar a una posición específica
            if (total == 9) {
                if (dado1 == 5 && dado2 == 4) {
                    System.out.println("¡Jugador " + turno + " saca un 9! Salta a la casilla 53.");
                    posicionActual = 53;
                } else if (dado1 == 3 && dado2 == 6) {
                    System.out.println("¡Jugador " + turno + " saca un 9! Salta a la casilla 26.");
                    posicionActual = 26;
                }
            } else {
                posicionActual += total;
                System.out.println("Jugador " + turno + " avanza a la posición: " + posicionActual);
            }

            // Casillas especiales
            switch (posicionActual) {
                case 6: case 12: // Puente
                    System.out.println("¡Jugador " + turno + " cae en el puente! Salta a la casilla 19 y pierde un turno.");
                    posicionActual = 19;
                    turno = (turno == 1) ? 2 : 1;
                    break;
                case 19: // Posada
                    System.out.println("¡Jugador " + turno + " cae en la Posada! Pierde un turno.");
                    turno = (turno == 1) ? 2 : 1;
                    break;
                case 31: // Pozo
                    System.out.println("¡Jugador " + turno + " cae en el pozo! No puede jugar hasta que otro jugador caiga aquí.");
                    if (turno == 1) jugador1EnPozo = true;
                    else jugador2EnPozo = true;
                    break;
                case 42: // Laberinto
                    System.out.println("¡Jugador " + turno + " cae en el laberinto! Retrocede a la casilla 30.");
                    posicionActual = 30;
                    break;
                case 56: // Cárcel
                    System.out.println("¡Jugador " + turno + " cae en la cárcel! Debe esperar hasta que otro jugador lo rescate.");
                    break;
                case 26: // Dados
                    System.out.println("¡Jugador " + turno + " cae en la casilla de dados! Avanza 26 casillas.");
                    posicionActual += 26;
                    break;
                case 53: // Dados
                    System.out.println("¡Jugador " + turno + " cae en la casilla de dados! Avanza 53 casillas.");
                    posicionActual += 53;
                    break;
                case 58: // Calavera
                    System.out.println("¡Jugador " + turno + " cae en la calavera! Vuelve a la casilla 1.");
                    posicionActual = 1;
                    break;
            }

            // Actualizar la posición del jugador actual y verificar si ha llegado a la meta
            if (turno == 1) {
                jugador1Pos = posicionActual;
                if (jugador1Pos >= meta) {
                    System.out.println("¡Jugador 1 ha ganado!");
                    break;
                }
                turno = 2; // Cambia al siguiente jugador
            } else {
                jugador2Pos = posicionActual;
                if (jugador2Pos >= meta) {
                    System.out.println("¡Jugador 2 ha ganado!");
                    break;
                }
                turno = 1; // Cambia al siguiente jugador
            }
        }
    }
}
