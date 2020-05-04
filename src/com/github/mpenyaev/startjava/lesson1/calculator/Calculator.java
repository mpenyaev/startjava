import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		String s1;
		int c;
		int d;

		System.out.println("Class Calculator");
		System.out.print("Input the 1st positive integer: ");
		int a = in.nextInt();
		if (a < 0) {
			System.out.print("The integer should be positive. Repeat the input: ");
			a = in.nextInt();
		}
		c = a;
		System.out.print("Input mathematical operator (+,-,*,/,^,%): ");
		s1 = in.next();
		char[] sign = s1.toCharArray();
		System.out.print("Input the 2nd positive integer: ");
		int b = in.nextInt();
		if (b < 0) {
			System.out.print("The integer should be positive. Repeat the input: ");
			b = in.nextInt();
		}
		in.close();

		if (b < 0) {
			System.out.print("The integer should be positive. Repeat the input: ");
			b = in.nextInt();
		}
		if (sign[0] == '+') {
			System.out.println(a+" "+sign[0]+" "+b+" = "+(a+b));
		}
		if (sign[0] == '-') {
			System.out.println(a+" "+sign[0]+" "+b+" = "+(a-b));
		}
		if (sign[0] == '*') {
			System.out.println(a+" "+sign[0]+" "+b+" = "+(a*b));
		}
		if (sign[0] == '/') {
			System.out.println(a+" "+sign[0]+" "+b+" = "+(a/b));
		}
		if (sign[0] == '^') {
			d = b - 1;
			if (b == 0){
				c = 1;
			} else{
				while (d>0){
					c = c*a;
					d--;
				}
			}
			System.out.println(a+" "+sign[0]+" "+b+" = "+c);
		}
		if (sign[0] == '%') {
			System.out.println(a+" "+sign[0]+" "+b+" = "+(a%b));
		}
	}
}