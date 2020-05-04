package com.github.mpenyaev.startjava.person;

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