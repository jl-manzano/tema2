package boletincondicional;

import java.util.Scanner;

public class Ejer6 {
	public static void main(String[] args) {
		
		// DECLARAR VARIABLES TIPO ENTERO (INT)
		int horas;
		int minutos;
		int segundos;
		
		// CREAR OBJETO SCANNER
		Scanner sc = new Scanner(System.in);
		
		// IMPRIMIR MENSAJE CONSOLA -> INTRODUCIR VALOR
		System.out.println("Introduce la hora (0-23): ");
		
		// LEER Nº ENTERO (INT) INGRESADO EN CONSOLA
        horas = sc.nextInt();
        
		// IMPRIMIR MENSAJE CONSOLA -> INTRODUCIR VALOR
        System.out.println("Introduce los minutos (0-59): ");
        
		// LEER Nº ENTERO (INT) INGRESADO EN CONSOLA
        minutos = sc.nextInt();
        
		// IMPRIMIR MENSAJE CONSOLA -> INTRODUCIR VALOR
        System.out.println("Introduce los segundos (0-59): ");
        
		// LEER Nº ENTERO (INT) INGRESADO EN CONSOLA
        segundos = sc.nextInt();
        
        // DECLARAR CONDICIONAL IF -> VERIFICAR VALORES SON VÁLIDOS
        if (horas < 0 || horas > 23 || minutos < 0 || minutos > 59 || segundos < 0 || segundos > 59) {
        	System.out.println("HORA INTRODUCIDA NO VÁLIDA");
        } else {
        	segundos++;
        	if (segundos == 60) {
        		segundos = 0;
        		minutos++;
        	}
        	
        	if (minutos == 60) {
        		minutos = 0;
        		horas++;
        		
        	}
        	
        	if (horas == 24) {
        		horas = 0;
        		
        	}
        }
		
        // MOSTRAR RESULTADO PANTALLA -> uso de printf -> formatear hora (%02d:%02d:%02d\n)
        System.out.printf("La hora después de incrementar un segundos es %02d:%02d:%02d\n", horas, minutos, segundos);
	
        // CERRAR OBJETO SCANNER
        sc.close();
	}
}
