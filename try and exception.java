public class Try {
	public static void main(String[] args) {
		int x=5;
		int y=2;
		try {
			int result=x/y;
			System.out.println(result);
		}
		catch(ArithmeticException e) {
			System.out.println("Error: dividion is not divisible by Zero");
		}
	}

}
