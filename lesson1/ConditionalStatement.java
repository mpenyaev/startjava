public class ConditionalStatement {
	
	public static void main(String[] args) {
		int age = 45;		//age
		char sex = 'm';		//sex
		double height = 1.8;	//height
		char letter1 = 'S';	//the 1st letter of the name

		if(age > 20){
			System.out.println(age);
		} else{
			System.out.println("younger than 20yo");
		}
		if(sex == 'm'){
			System.out.println(sex);
		} else{
			System.out.println("not mail");
		}
		if(height < 1.8){
			System.out.println(height);
		} else{
			System.out.println("not a submariner");
		}
		if(letter1 == 'M'){
			System.out.println(letter1);
		} else if(letter1 == 'I'){
			System.out.println("Ilia");
		} else{
				System.out.println("not Ilia");
		}
	}
}