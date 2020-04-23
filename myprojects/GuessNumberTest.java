import java.util.Scanner;

class GuessNumberTest{
	
	public static void main(String[] args){

		int num = 120;
		Scanner sc = new Scanner(System.in);
		int n = 1;
		String name;
		GuessNumber guess = new GuessNumber();

		System.out.println("Class Guess the Number");
		System.out.println("2 Players take part");
		System.out.print("Input 1st Player Name: ");
		name = sc.next();
		Player P1 = new Player(name, false);
		System.out.println("Hi, "+name+"!");
		System.out.print("Input 2nd Player Name: ");
		name = sc.next();
		Player P2 = new Player(name, false);
		System.out.println("Hi, "+name+"!");
		
		System.out.println("Machine thought the integer from 0 to 100. Players should guess this integer.");
		int result = (int) (Math.random()*101);			//computer think int result [0-100]

		while (result != num){
			if(n % 2 > 0){
				num = guess.getNum(P1.getName());
				if(num == result){
					P1.setWin(true);
				} 
			} else{
				num = guess.getNum(P2.getName());
				if(num == result){
					P2.setWin(true);
				}
			}
			if(num > result){
				System.out.println("Your number is too big.");
			}
			if(num < result){
				System.out.println("Your number is too small.");
			}
			if(num == result){
				System.out.println("Your number is right!");
			}
			n++;
		}
		sc.close();
		if (P1.getWin() == true){
			System.out.println("Congratulations, "+P1.getName()+"!!!"+" You win!!!");
		}
		if (P2.getWin() == true){
			System.out.println("Congratulations, "+P2.getName()+"!!!"+" You win!!!");
		}
	}
}