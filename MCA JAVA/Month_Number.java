import java.util.*;
public class Month_Number
{
    public static void main(String[] arg)
    {
        int Month_Num = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print(" \n Enter Month Number :");
        Month_Num=sc.nextInt();

        if(Month_Num == 1)
        {
            System.out.println("\n January");
        }

        else if(Month_Num == 2)
        {
            System.out.println("\n February");
        }

        else if(Month_Num == 3)
        {
            System.out.println("\n March");
        }

        else if(Month_Num == 4)
        {
            System.out.println("\n April");
        }

        else if(Month_Num == 5)
        {
            System.out.println("\n May");
        }

        else if(Month_Num == 6)
        {
            System.out.println("\n June");
        }

        else if(Month_Num == 7)
        {
            System.out.println("\n July");
        }

        else if(Month_Num == 8)
        {
            System.out.println("\n August");
        }

        else if(Month_Num == 9)
        {
            System.out.println("\n September");
        }

        else if(Month_Num == 10)
        {
            System.out.println("\n October");
        }

        else if(Month_Num == 11)
        {
            System.out.println("\n November");
        }

        else if(Month_Num == 12)
        {
            System.out.println("\n December");
        }

        else
        {
            System.out.println("\n Invalid Month");
        }

    }
}