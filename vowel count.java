package vowelscount;
import java.util.*;

public class Vowelscount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str1 = input.nextLine();
        String vowels = "aeiouAEIOU";
        int vowelCount = 0;
        int consonantCount = 0;

        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if (vowels.indexOf(ch) != -1) {
                vowelCount++;
            } else  {
                consonantCount++;
            }
        }

        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);
    }
}
