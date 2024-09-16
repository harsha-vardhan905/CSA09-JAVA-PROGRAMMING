import java.util.*;
public class Composite{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        
        for(int i=a;i<=b;i++){
            int count=0;
            for(int j=1;j<=i;j++){
                if(i%j == 0){
                    count++;
                }
            }
            if(count > 2){
                System.out.print(i+" ");
            }
        }
    }
}
