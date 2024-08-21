package pattern;
import java.util.*;
public class Pattern {
	public static void main(String[] args) {
		int n,i;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the number");
		n=input.nextInt();
		int num=1;
		for(i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				if((i+j)%2==0) {
					System.out.print("0");
				}
				else {
					System.out.print("1");
				}
			}
			System.out.println( " ");
		}
	}

}
