import java.util.Scanner;

class Person {
	String Name;
	char Sex;
	int Age;
	int Weight;
	int Height;

	void run(){
		System.out.println(Name+" runs!");
	}
	void say(int a){
		System.out.print(Name+" says:");
		while (a > 0) {
			System.out.print(" Yep!");
			a--;
		}
		System.out.println();
	}
	void seat(String b){
		System.out.println(Name+" seats on a "+b);
	}
	void studyJava(String a, int b){
		System.out.println(Name+" seats on a "+a+" and studies java "+b+" hours...");
	}
	void go(String a, String b, String c){
		System.out.println(Name+" went to a "+a+" then to a "+b+" then to a "+c+"... "+Name+" tired...");
	}
	String getName(){
		return Name;
	}
}

class PersonTestDrive {
	public static void main (String[] args) {
		Person a = new Person();	//crate new object
		System.out.println("Name "+a.Name+"   Sex "+a.Sex+"   Age "+a.Age+"   Weight "+a.Weight+"   Lenght "+a.Height);
		Scanner sc = new Scanner(System.in);// create new object of scanner type
		System.out.print("Input name: ");
		a.Name = sc.nextLine();
		a.Sex = 'M';
		System.out.print("Input age: ");
		if (sc.hasNextInt()) {	// возвращает истину если с потока ввода можно считать целое число
        	a.Age = sc.nextInt(); 	// считывает целое число с потока ввода и сохраняем в переменную
        }
		a.Weight = 70;
		a.Height = 180;
		System.out.println("Name "+a.Name+"   Sex "+a.Sex+"   Age "+a.Age+"   Weight "+a.Weight+"   Lenght "+a.Height);
		String b = a.getName();
		System.out.println(b);
		a.run();
		a.say(3);
		a.seat("TREE!");
		a.studyJava("CHAIR",7);
		a.go("CAFE","WC","BAR");
	}	
}