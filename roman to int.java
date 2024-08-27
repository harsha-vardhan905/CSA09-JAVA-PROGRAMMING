import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a Roman numeral:");
        String romanNumeral = input.nextLine().toUpperCase();

        int total = 0;
        int prevValue = 0;

        for (int i = romanNumeral.length() - 1; i >= 0; i--) {
            char currentChar = romanNumeral.charAt(i);
            int currentValue;

            if (currentChar == 'I') {
                currentValue = 1;
            } else if (currentChar == 'V') {
                currentValue = 5;
            } else if (currentChar == 'X') {
                currentValue = 10;
            } else if (currentChar == 'L') {
                currentValue = 50;
            } else if (currentChar == 'C') {
                currentValue = 100;
            } else if (currentChar == 'D') {
                currentValue = 500;
            } else if (currentChar == 'M') {
                currentValue = 1000;
            } else {
                System.out.println("Invalid Roman numeral character: " + currentChar);
                input.close();
                return;
            }

            if (currentValue < prevValue) {
                total -= currentValue;
            } else {
                total += currentValue;
            }

            prevValue = currentValue;
        }

        System.out.println("The integer value is: " + total);

        input.close();
    }
}
