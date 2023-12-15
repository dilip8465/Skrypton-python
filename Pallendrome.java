import java.util.*;
public class Pallendrome {
    public static void main(String [] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the string");
        String s1=in.nextLine();
        String s2="";
        for(int i=s1.length()-1;i>=0;i--)
        {
            s2+=s1.charAt(i);
        }
        
        if(s1.equals(s2))
        {
            System.out.println("String is pallendrome");

        }
        else{
            System.out.println("String is not pallendrome");
        }
    }
    
}
