import java.util.*;
public class Fibonacci {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter the number");
		int n=input.nextInt();
		int a1=0,a2=1,a3;
		int a[]=new int[50];
		for(int i=0;i<=n;i++) {
			a[i]=a1;
			System.out.println(a[i]+" ");
			a3=a1+a2;
			a1=a2;
			a2=a3;
		}
	}
}
