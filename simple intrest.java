
import java.util.*;
public class Simpleintrest {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter the amount");
		int n=input.nextInt();
		System.out.println("enter the time");
		int time=input.nextInt();
		input.nextLine();
		System.out.println("senior citizen or not(y/n)");
		String str=input.nextLine();
		double intrest;
		if(str.equals("y")) {
			double r=10;
		     intrest=(n*time*r)/100;
		}
		else {
			double r1=12;
		    intrest=(n*time*r1)/100;
		}
		
		System.out.println("simple intrest is" + intrest);
	}
}
