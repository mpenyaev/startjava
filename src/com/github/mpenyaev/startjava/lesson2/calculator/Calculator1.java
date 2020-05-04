package com.github.mpenyaev.startjava.calculator;

class Calculator1 {

	private int result;
	private	int c;
	private int d;

	public int getResult(int a, char sign, int b){
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