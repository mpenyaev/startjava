import java.util.Scanner;

class GuessNumber{
	public int getNum(String name){
		System.out.print(name+" input his number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		return num;
	}
}