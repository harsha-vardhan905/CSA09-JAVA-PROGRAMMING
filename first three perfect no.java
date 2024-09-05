import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        int count = 0;
        int number = 1;

        while (count < 3) {
            int sum = 0;

            for (int i = 1; i <= number / 2; i++) {
                if (number % i == 0) {
                    sum += i;
                }
            }

            if (sum == number && number != 0) {
                System.out.println(number);
                count++;
            }

            number++;
        }
    }
}
