import java.util.*;
public class Add_Two
{
    public static void main(String[] arg)
    {
        int Number1 = 0, Number2 = 0, Result = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("\n Enter First Number :");
        Number1 = sc.nextInt();

        System.out.print("\n Enter Second Number :");
        Number2 = sc.nextInt();

        Result = Number1 + Number2;
        System.out.print("\n The Result of Adding "+Number1+" and "+Number2+" is :"+Result);


    }
}
    
