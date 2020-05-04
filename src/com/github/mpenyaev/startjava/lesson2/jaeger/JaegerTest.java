package com.github.mpenyaev.startjava.jaeger;

public class JaegerTest{
	public static void main(String[] args){

		Jaeger a = new Jaeger();
		Jaeger b = new Jaeger("Digger 25","Alex",18.57f,2552.3f,29);

		System.out.println(a);
		System.out.println(b);
		
		a.setModel("Cook 4a");
		a.setName("Puncho");
		a.setHeight(1.85f);
		a.setWeight(242.6f);
		a.setSpeed(5);

		System.out.println(a);
		System.out.println(b);

		a.go("kitchen");
		b.go();
	}
}