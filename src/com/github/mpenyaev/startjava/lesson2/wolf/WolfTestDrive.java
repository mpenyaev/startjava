package com.github.mpenyaev.startjava.wolf;

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