package boletindowhile;

public class Ejer1 {
	public static void main(String[] args) {

		// declarar e inicializar variable para almacenar num
		int num = 1;

		// crear bucle do-while
		do {
			// se ejecuta el bloque instrucciones
			System.out.println(num);

			// incrementar en 1 el num
			num++;
			
			// evaluación de condición mientras que contador sea <= 20
		} while (num < 20);

	}
}
