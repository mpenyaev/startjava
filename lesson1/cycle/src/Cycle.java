public class Cycle {

	public static void main (String[] args) {
		int j = -6;
		int k = 10;
		float s = 0;

		for (int i = 0;i <= 20;i++) {
			System.out.println("Hello "+i);
		}
		while (j <= 6) {
			System.out.println("Hi "+j);
			j = j+2;
		}
		while (k <=20) {
			//if(k/2 != (k+1)/2){
			if (k%2 > 0) {
				s = s+k;
				System.out.println("k = "+k+"   Summ "+s);
			} else {
				System.out.println("k = "+k+"   "+k/2);
			}
			k = k+1;
		}
	}
}