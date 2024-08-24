package reverseword;
import java.util.*;
public class Reverseword {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter the username");
		String str1=input.nextLine();
		System.out.println("reenter the username");
		String str2=input.nextLine();
		if(str1.equals(str2)) {
			System.out.println("valid");
		}
		else {
			System.out.println("not valid");
		}
	}
}
