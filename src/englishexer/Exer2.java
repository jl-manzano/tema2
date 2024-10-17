package englishexer;

import java.util.Scanner;

public class Exer2 {
	public static void main(String[] args) {
		
		int num;
		int counter = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number to make the multiplication table of that number: ");
		num = sc.nextInt();
		
		// while the counter is less or equal than 10, 
		while (counter <= 10) {
			System.out.println(counter * num);
		
		}
		
	}
}
