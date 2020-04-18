public class UnicodePrint {
	
	public static void main(String[] args) {

		int code = 33;
			
		while (code <= 126) {
			System.out.print("code = " + code + "   symbol: ");
			System.out.println((char)code);
			code = code +1;
		}
	}
}