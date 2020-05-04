import java.util.Scanner;

public class GuessTheNum {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		//int a = Math.random()*101; // Загадывает компьютер
		int a = (int) (Math.random()*101);
		
		//System.out.println("Machine thought the integer from 0 to 100: "+a);
		System.out.println("Machine thought the integer from 0 to 100.");
		System.out.print("Try to guess. Input your number: ");
		int b = 120;
		while (b != a) {
			b = in.nextInt();
			if (b == a) {
				System.out.println("Congratulations!!! You have guessed! "+b+" is right!");
			} else {
				if(b > a) {
					System.out.print(b+" is too big. Input smaller integer: ");
				}
				if(b < a) {
					System.out.print(b+" is too small. Input bigger integer: ");
				}
			}
		}
	}
}