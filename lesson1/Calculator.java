import java.util.Scanner;
import java.io.IOException;

public class Calculator {

	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner(System.in);

		char sign;

		System.out.println("Class Calculator");
		System.out.print("Input the 1st positive integer: ");
		int a = in.nextInt();
		if (a < 0) {
			System.out.print("The integer should be positive. Repeat the input: ");
			a = in.nextInt();
		}
		System.out.print("Input mathematical operator (+,-,*,/,^,%: ");
		//char sign = in.next();
		sign = (char) System.in.read();
		System.out.print("Input the 2nd positive integer: ");
		int b = in.nextInt();
		if (b < 0) {
			System.out.print("The integer should be positive. Repeat the input: ");
			b = in.nextInt();
		}
		if (sign == '+') {
			System.out.println(a+" "+sign+" "+b+" = "+(a+b));
		}
		if (sign == '-') {
			System.out.println(a+" "+sign+" "+b+" = "+(a-b));
		}
		if (sign == '*') {
			System.out.println(a+" "+sign+" "+b+" = "+(a*b));
		}
		if (sign == '/') {
			System.out.println(a+" "+sign+" "+b+" = "+(a/b));
		}
		if (sign == '^') {
			System.out.println(a+" "+sign+" "+b+" = "+(a^b));
		}
		if (sign == '%') {
			System.out.println(a+" "+sign+" "+b+" = "+(a%b));
		}
	}
}