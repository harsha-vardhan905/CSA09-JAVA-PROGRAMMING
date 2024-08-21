package pattern;
import java.util.*;
public class Pattern {
	public static void main(String[] args) {
		int i;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the rows");
		int rows=input.nextInt();
		System.out.println("enter the column");
		int columns=input.nextInt();
		for(i=1;i<=rows;i++) {
			for(int j=1;j<=columns;j++) {
				if(i==1||i==rows||j==1||j==columns) {
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
