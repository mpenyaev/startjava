class Wolf{
	private String name;
	private char sex;
	private String color;
	private int age;
	private int weight;

	public Wolf(String name, char sex, String color, int age, int weight){
		this.name = name;
		this.sex = sex;
		this.color = color;
		this.age = age;
		this.weight = weight;
	}

	public void setName(String a){
		name = a;
	}
	public void setSex(char a){
		sex = a;
	}
	public void setColor(String a){
		color = a;
	}
	public void setAge(int a){
		if (a>0 & a<8){
			age = a;
		} else{
			System.out.println("not correct age");
		}
	}
	public void setWeight(int a){
		weight = a;
	}
	public String getName(){
		return name;
	}
	public char getSex(){
		return sex;
	}
	public String getColor(){
		return color;
	}
	public int getAge(){
		return age;
	}
	public int getWeight(){
		return weight;
	}

	public void go(){
		System.out.println("Wolf "+name+" "+sex+" "+color+" "+age+" "+weight+" is going to...");
	}
	public void run(){
		System.out.println("Wolf "+name+" "+sex+" "+color+" "+age+" "+weight+" is running");
	}
	public void sit(){
		System.out.println("Wolf "+name+" "+sex+" "+color+" "+age+" "+weight+" is sitting");
	}
	public void hunt(){
		System.out.println("Wolf "+name+" "+sex+" "+color+" "+age+" "+weight+" is hunting");
	}
	public void how(){
		System.out.println("Wolf "+name+" "+sex+" "+color+" "+age+" "+weight+" says: Wouuuu!");
	}
}

class WolfTestDrive{
	public static void main (String[] args){
		Wolf w1 = new Wolf("w1",'f',"red",12,40);
		int age;
		System.out.println(w1.getName()+" "+w1.getSex()+" "+w1.getColor()+" "+w1.getAge()+" "+w1.getWeight());
		w1.go();
		w1.setName("Okella");
		w1.run();
		w1.setSex('M');
		w1.sit();
		w1.setColor("Grey");
		w1.hunt();
		w1.setAge(5);
		w1.how();
		w1.setWeight(45);
		System.out.println(w1.getName()+" "+w1.getSex()+" "+w1.getColor()+" "+w1.getAge()+" "+w1.getWeight());
		w1.setAge(-20);
		w1.setAge(10);
		System.out.println(w1.getName()+" "+w1.getSex()+" "+w1.getColor()+" "+w1.getAge()+" "+w1.getWeight());
	}
} 