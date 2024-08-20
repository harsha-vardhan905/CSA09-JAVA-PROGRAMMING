package reverse;
import java.util.Scanner;
public class reverse {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter the number");
		int number=input.nextInt();
		int rev=0;
		int org=number;
		while(number!=0) {
			int digit=number%10;
			rev=rev*10+digit;
			number=number/10;
		}
		System.out.println("after reversing number is:" +rev);
	}

}
  
