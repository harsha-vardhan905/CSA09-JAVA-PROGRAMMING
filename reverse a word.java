package reverseword;
import java.util.*;
public class Reverseword {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter the string");
		String str=input.nextLine();
		String empty="";
		int len=str.length();
		for(int i=len-1;i>=0;i--) {
			empty+=str.charAt(i);
		}
		System.out.println(empty);
	}
}
