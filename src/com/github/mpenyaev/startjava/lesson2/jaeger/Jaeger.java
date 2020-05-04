package com.github.mpenyaev.startjava.jaeger;

class Jaeger{
	private String model;
	private String name;
	private float height;
	private float weight;
	private int speed;

	public Jaeger(){
		
	}
	public Jaeger(String a, String b, float c, float d, int e){
		this.model = a;
		this.name = b;
		this.height = c;
		this.weight = d;
		this.speed = e;
	}

	public void setModel(String a){
		this.model = a;
	}
	public void setName(String a){
		this.name = a;
	}
	public void setHeight(float a){
		this.height = a;
	}
	public void setWeight(float a){
		this.weight = a;
	}
	public void setSpeed(int a){
		this.speed = a;
	}
	public String getModel(){
		return model;
	}
	public String getName(){
		return name;
	}
	public float getHeight(){
		return height;
	}
	public float getWeight(){
		return weight;
	}
	public int getSpeed(){
		return speed;
	}
	public String toString(){
		return "Main{"+
		"Model='"+model+'\''+
		", Name='"+name+'\''+
		", Height='"+height+
		", Weight='"+weight+
		", Speed='"+speed+"}";
	}
	public void go(){
		System.out.println("Robot "+name+" is going to ...");
	}
	public void go(String a){
		System.out.println("Robot "+name+" is going to "+a);
	}
}