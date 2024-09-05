public class Main {
    public static void main(String[] args) {
        int arr[] = {4, 54, 29, 71, 7, 59, 98, 23};
        int com = 0, pri = 0;

        for (int i = 0; i < arr.length; i++) {
            int c = 0;

            for (int j = 1; j <= arr[i]; j++) {
                if (arr[i] % j == 0) {
                    c++;
                }
            }

            if (c == 2) {
                pri++;
            } else {
                com++;
            }
        }

        System.out.print("Composite Number: " + com);
        System.out.println("\nPrime number: " + pri);
    }
}
