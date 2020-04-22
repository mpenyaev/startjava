class multiple{
	int multiple(int a,int b){
		int c = a*b;
		return c;
	}
}

class MultiTestDrive {
	public static void main(String[] args){
		int p1=5;
		int p2=7;
		multiple life = new multiple();
		int m = life.multiple(p1,p2);
		System.out.println(m);
//		System.out.println(life(p1,p2).c);
	}
}