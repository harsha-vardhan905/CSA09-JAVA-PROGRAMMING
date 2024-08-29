package tryand;
public class Try {
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5};

        try {
            int index = 4;
            System.out.println( numbers[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index out of bounds. Please provide a valid index.");
        }
    }
}
