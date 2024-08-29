package tryand;
public class Try {
	public static void main(String[] args) {
		
		try {
			String str1="12";
			int result=Integer.parseInt(str1);
			System.out.println(result);
		}
		catch(NumberFormatException e) {
			System.out.println("Error: please enter a integer");
		}
	}

}
