import java.util.*;
public class Divisible
{
    public static void main(String[] arg)
    {
        int Num = 0;
        Scanner sc =  new Scanner(System.in);

        System.out.print("\n Enter a Number :");
        Num=sc.nextInt();

        if(Num % 7 == 0)
        {
            System.out.print("\n Given Number "+Num+" is Divisible by 7");
        }
        else
        {
             System.out.print("\n Given Number "+Num+" is Not Divisible by 7");   
        }
    }
}