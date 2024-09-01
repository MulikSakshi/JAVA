import java.util.*;
public class Add
{
    public static void main(String[] arg)
    {
        int X = 0, Y = 0, Sum = 0;
        Scanner sc =  new Scanner(System.in);

        System.out.print("\n Enter First Number :");
        X=sc.nextInt();
        System.out.print("\n Enter Second Number :");
        Y=sc.nextInt();

        Sum = X + Y;
        System.out.print("\n Addition of Two Number is :" +Sum);

         
    }
}