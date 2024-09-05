import java.util.Scanner;
public class Bonus{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter the grade");
        String g=input.nextLine();
        System.out.println("enter the salary");
        int sal=input.nextInt();
        
        double bonus=0;
        if(g.equals("A")){
            bonus+=sal*(0.05);
            if(sal<10000){
                bonus=bonus+sal*(0.02);
            }
            System.out.println("salary is"+sal);
            System.out.println("bonus is"+bonus);
            System.out.println("total is "+(sal+bonus));
        }
        else if(g.equals("B")){
            bonus+=sal*(0.1);
            if(sal<10000){
                bonus=bonus+sal*(0.02);
            }
            System.out.println("salary is"+sal);
            System.out.println("bonus is"+bonus);
            System.out.println("total is "+(sal+bonus));
        }
    }
}
