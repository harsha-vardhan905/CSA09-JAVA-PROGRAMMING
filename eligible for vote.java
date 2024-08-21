package age;
import java.util.Scanner;
public class Age {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter the age");
		int age=input.nextInt();
		if(age<18) {
			int q=18-age;
			System.out.println("not eligible for vote");
			System.out.println("age required is:"+q);
		}
		else {
			System.out.println("eligible for vote");
		}
		
	}

}
