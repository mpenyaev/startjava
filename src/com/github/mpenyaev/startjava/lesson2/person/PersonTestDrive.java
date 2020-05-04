package com.github.mpenyaev.startjava.person;

import java.util.Scanner;

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