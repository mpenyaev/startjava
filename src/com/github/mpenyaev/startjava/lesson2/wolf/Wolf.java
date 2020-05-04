package com.github.mpenyaev.startjava.wolf;

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