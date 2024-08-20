package amstrong;
import java.util.Scanner;
public class Amstron {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter the number");
		int number=input.nextInt();
		int r;
		int sum=0;
		int org=number;
		for(int temp=number;temp!=0;temp=temp/10) {
			r=temp%10;
			sum=sum+r*r*r;
		}
		if(sum==org) {
			System.out.println("amstrong number");
		}
		else {
			System.out.println("not a amstrong number");
		}
	}

}
