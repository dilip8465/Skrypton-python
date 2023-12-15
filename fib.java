public class fib {
    
    public static void main(String [] args)
    {
        int first=0;
        int second =1;
        int i=0;
        System.out.print(first+" ");
        System.out.print(second+" ");
        while(i<100)
        {
          int third=first+second;
            System.out.print(third+" ");
            first=second;
            second=third;
            i++;
            
        }


    }
}
