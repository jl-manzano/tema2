package englishexer;

import java.util.Scanner;

public class Exer4 {
	public static void main(String[] args) {
		
		int num;
		int random = (int) (Math.random() * 100 + 1);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		num = sc.nextInt();
		
		while (num != random) {
			if (num < random) {
				System.out.println("Try with a bigger number.");
			} else {
				System.out.println("Try with a lower number.");
			
			}
			
			System.out.println("Enter a number: ");
			num = sc.nextInt();
		}
		
		System.out.println("\n !!CONGRATULATIONS!!\nThe random number is " + random);

	}
}
