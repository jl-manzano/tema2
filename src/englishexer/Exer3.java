package englishexer;

import java.util.Scanner;

public class Exer3 {
	public static void main(String[] args) {
		
		// VARIABLE FOR STORAGE HEIGHT
		double height;
		
		// VARIABLE FOR STORAGE MIN HEIGHT
		double minHeight;
		
		// VARIABLE FOR STORAGE MAX HEIGHT
		double maxHeight = 0;
		
		// CREATE SCANNER
		Scanner sc = new Scanner(System.in);
		
		// PRINT MESSAGE IN CONSOLE TO ENTER HEIGHT
		System.out.println("Enter your height: ");
		
		// READ HEIGHT ENTERED BY THE STUDENT
		height = sc.nextDouble();
	
		// ASSIGN HEIGHT VARIABLE TO MIN HEIGHT VARIABLE
		minHeight = height;
		
		// CREATE WHILE LOOP -> DETERMINE MAX HEIGHT OF STUDENTS
		while (height != 0) {
			
			// DEFINE CONDITIONAL IF -> IF HEIGHT IS < MIN HEIGHT - ASSIGN ALT VALUE TO ALT MIN
			if (height < minHeight) {
				minHeight = height;
			}
			
			// DEFINE CONDITIONAL IF -> IF HEIGHT IS > MAX HEIGHT - ASSIGN HEIGHT VALUE TO MIN HEIGHT
			if (height > maxHeight) {
				maxHeight = height;
			}
			
			// PRINT MESSAGE IN CONSOLE TO ENTER HEIGHT
			System.out.println("Enter your height: ");
			
			// READ HEIGHT ENTERED BY THE STUDENT
			height = sc.nextDouble();
		}
		
		// DEFINE CONDITIONAL IF -> IF MAXHEIGHT != -1 AND MINHEIGHT != -1, PRINT
		if (maxHeight != 0 && minHeight != 0) {
			System.out.println("Mininum height: " + minHeight);
			System.out.println("\nMaximum height: " + maxHeight);
		}
		
		// CLOSE SCANNER
		sc.close();
		
	}
}
