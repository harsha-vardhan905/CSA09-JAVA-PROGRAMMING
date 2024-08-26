import java.util.Scanner;
public class Gcd {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter the first number");
		int n1=input.nextInt();
		System.out.println("enter the sec no");
		int n2=input.nextInt();
		int gcd=findGCD(n1,n2);
		System.out.println("gcd is"+gcd);
	}
	public static int findGCD(int a,int b) {
		if(b==0) {
			return a;
		}
		else {
			return findGCD(b,a%b);
		}
	}

}
