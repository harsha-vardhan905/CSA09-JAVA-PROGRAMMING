package factorial;
import java.util.Scanner;
public class Factorial {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter the number:");
		int number = input.nextInt();
		long hello=1;
		for(int i=1;i<=number;i++) {
			hello=hello*i;
		}
		System.out.println("factorial of a given number:"+hello);
	}

}
