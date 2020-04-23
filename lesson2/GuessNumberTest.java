import java.util.Scanner;

class GuessNumberTest{
	
	public static void main(String[] args){

		GuessNumber g = new GuessNumber();
		Scanner sc = new Scanner(System.in);
		char ch = 'y';

		while(ch == 'Y' | ch == 'y' ){
			g.GuessNum();
			System.out.print("Do you want to continue? (Y/N) ");
			ch = sc.next().charAt(0);
		}
		sc.close();
	}
}