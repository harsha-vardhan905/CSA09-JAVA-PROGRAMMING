package pattern;
import java.util.*;
public class Pattern {
	public static void main(String[] args) {
		int n,i;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the number");
		n=input.nextInt();
		for(i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1||i==n||j==1||j==n) {
					System.out.print("x"+" ");
				}
				else {
					System.out.print(" "+" ");
				}
			}
			System.out.println( );
		}
	}

}    
