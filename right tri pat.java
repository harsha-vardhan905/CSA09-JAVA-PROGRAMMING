import java.util.Scanner;

public class StarPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=5;
        for(int i=0;i<=n;i++){
            System.out.print(" ");
            for(int j=0;j<=n-i;j++){
                System.out.print("*");
            }
            
             System.out.println();
        }
    }
}
