package com.github.mpenyaev.startjava.guessnumber;

import java.util.Scanner;

class Player{

	private String name;
	private int number;

	public Player(String x, int y){
		this.name = x;
		this.number = y;
	}
	public String getName(){
		return name;
	}
//	public void setWin(boolean x){
//		this.win = x;
//	}
	public int getNumber(int z){
		System.out.print(name+" input his number: ");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		return number;
	}
	public int getNumber(){
		return number;
	}
}