package boletindowhile;

public class Ejer2 {
	public static void main(String[] args) {

		// declarar e inicializar variable para almacenar contador
		int contador = 0;

		// declarar e inicializar variable para almacenar num
		int num = 0;

		// crear bucle do-while
		do {
			// se ejecuta el bloque instrucciones

			// definir condicional if -> determinar nums pares

			if (num % 2 == 0) { // entrará si num es par

				// imprime resultado (num par)
				System.out.println(num);
			}

			// incrementar en 1 el num
			num++;

			// incrementar en 1 el contador
			contador++;

			// evaluación de condición mientras que contador sea <= 200
		} while (contador <= 200);

	}
}