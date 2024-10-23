package boletinfor;

public class Ejer4 {
	public static void main(String[] args) {
		
		// declarar e inicializar variable en 0 para almacenar la suma
		int suma = 0;
		
		// crear bucle for
		for (int i = 0, cont = 1; i < 10; cont += 2, i++) {
			// sumar num (i) a variable suma
			suma += cont;
			
		}
		
		// mostrar la suma en pantalla
		System.out.println("La suma de los 10 primeros nºs impares es: " + suma);
		
	
		
	}
}
