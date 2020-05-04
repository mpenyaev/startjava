package com.github.mpenyaev.startjava.calculator;

import java.util.Scanner;

public class CalculatorTest {
	public static void main (String[] args) {

		Scanner in = new Scanner(System.in);
		Calculator calc = new Calculator();
		String s1;
		char ch = 'y';

		System.out.println("Class Calculator");
		while(ch == 'Y' | ch == 'y'){
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
						calc.setA(a);
			calc.setSign(sign[0]);
			calc.setB(b);
			System.out.println(a+" "+sign[0]+" "+b+" = "+calc.getResult());
			calc.setA(0);
			calc.setSign('-');
			calc.setB(0);
			System.out.println("0 - 0 = "+calc.getResult());
			System.out.println(a+" "+sign[0]+" "+b+" = "+calc.getResult(a,sign[0],b));
			System.out.print("Do you want to continue? (Y/N) ");
			ch = in.next().charAt(0);
		}
		in.close();
	}
}