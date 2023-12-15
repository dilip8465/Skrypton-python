import java.util.*;

public class Areas {
    
    public static void main(String [] args)
    {
       Scanner in =new Scanner(System.in);
       System.out.println("Enter Side");
       int x= in.nextInt();
       int areaOfSquare=x*x;
       System.out.println("Area of Square="+ areaOfSquare);
       System.out.println("Enter radious");
       double r= in.nextInt();
       double areaOfCircle=3.14*r*r;
       System.out.println("Area of Square="+ areaOfCircle);
       System.out.println("Enter length");
       int l= in.nextInt();
       System.out.println("Enter Width");
       int w= in.nextInt();
       int areaOfRectangle=l*w;
       System.out.println("Area of rectangle="+ areaOfRectangle);
       System.out.println("Enter base");
       int b= in.nextInt();
       System.out.println("Enter height");
       int h=in.nextInt();
    
       int areaOfTriangle=12*b*h;
       System.out.println("Area of Triangle="+ areaOfTriangle);

    }
}
