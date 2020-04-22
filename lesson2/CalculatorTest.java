import java.util.Scanner;

class Calculator {

	private int a;
	private int b;
	private int result;
	private char sign;
	private	int c;
	private int d;

	public void setA(int x){
		this.a = x;
	}
	public void setSign(char x){
		this.sign = x;
	}
	public void setB(int x){
		this.b = x;
	}
	public int getResult(){
		switch(sign){
			case('+'):
				result = a + b;
				break;
			case('-'):
				result = a - b;
				break;
			case('*'):
				result = a * b;
				break;
			case('/'):
				result = a / b;
				break;
			case('%'):
				result = a % b;
				break;
			case('^'):
				d = b - 1;
				if (b == 0){
					result = 1;
				} else{
					result = a;
					while (d > 0){
						result = result * a;
						d--;
					}
				}
				break;
			default:
				result = 0;
				break;
			}
		return result;
	}
}

class CalculatorTest {
	public static void main (String[] args) {

		Scanner in = new Scanner(System.in);
		Calculator calc = new Calculator();
		String s1;

		System.out.println("Class Calculator");
		System.out.print("Input the 1st positive integer: ");
		int a = in.nextInt();
		if (a < 0) {
		System.out.print("The integer should be positive. Repeat the input: ");
		a = in.nextInt();
		}
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
		calc.setA(a);
		calc.setSign(sign[0]);
		calc.setB(b);
		System.out.println(a+" "+sign[0]+" "+b+" = "+calc.getResult());
	}
}