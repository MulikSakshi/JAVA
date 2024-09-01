import java.util.*;
public class Pos_Neg
{
    public static void main(String[] arg)
    {
        int Num = 0;
        Scanner sc =  new Scanner(System.in);

        System.out.print("\n Enter a Number :");
        Num=sc.nextInt();

        if(Num > 0)
        {   
            System.out.println(" The Number is Positive");
        }
        else if(Num < 0)
        {
            System.out.println(" The Number is Negative");
        }
        else
        {
            System.out.println(" The Number is Zero");
        }
    }
}       