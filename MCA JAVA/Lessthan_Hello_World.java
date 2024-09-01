import java.util.*;
public class Lessthan_Hello_World
{
    public static void main(String[] arg)
    {
        int Num = 0;
        Scanner sc =  new Scanner(System.in);

        System.out.print("\n Enter a Number :");
        Num=sc.nextInt();

        if(Num < 10)
        {   
            System.out.println("Hello");
        }
        else
        {
            System.out.println("World");
        }
    }
}       