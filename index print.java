import java.util.Scanner;

public class R192224188 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[] array = {2, 7, 11, 15};
        
        int index1 = -1;
        int index2 = -1;
        
        System.out.println("Enter the target value:");

        if (input.hasNextInt()) {
            int target = input.nextInt();
            
            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] + array[j] == target) {
                        index1 = i;
                        index2 = j;
                        break;
                    }
                }
                if (index1 != -1 && index2 != -1) {
                    break;
                }
            }
            
            if (index1 != -1 && index2 != -1) {
                System.out.println("The indices are: " + index1 + " and " + index2);
            } else {
                System.out.println("No solution found.");
            }
        } else {
            System.out.println("Invalid input. Please enter an integer.");
        }
        
        
    }
}
