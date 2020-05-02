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
	public int getResult(int a1, char sign1, int b1){
		switch(sign1){
			case('+'):
				result = a1 + b1;
				break;
			case('-'):
				result = a1 - b1;
				break;
			case('*'):
				result = a1 * b1;
				break;
			case('/'):
				result = a1 / b1;
				break;
			case('%'):
				result = a1 % b1;
				break;
			case('^'):
				d = b1 - 1;
				if (b1 == 0){
					result = 1;
				} else{
					result = a1;
					while (d > 0){
						result = result * a1;
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