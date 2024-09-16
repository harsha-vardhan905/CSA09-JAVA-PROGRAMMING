import java.util.*;
public class Composite{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        String str=input.nextLine();
        int sp=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(!Character.isLetterOrDigit(ch)&&!Character.isWhitespace(ch)){
                System.out.println(ch+" ");
                sp++;
            }
        }
        System.out.println("no of special count is"+ sp);
    }
}
