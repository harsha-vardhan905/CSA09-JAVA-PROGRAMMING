import java.util.*;
public class Skipping {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter the number");
		int n=input.nextInt();
		int m=input.nextInt();
		int k=input.nextInt();
		for(int i=m;i<=n;i=i+k+1) {
			System.out.println(i);
		}
	}
}
