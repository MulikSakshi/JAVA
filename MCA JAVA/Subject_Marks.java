import java.util.*;
public class Subject_Marks
{
    public static void main(String[] arg)
    {
        int Subject1 = 0, Subject2 = 0, Subject3 = 0 ,Total;
        float Per = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("\n Marks in Subject1 :");
        Subject1 = sc.nextInt();

        System.out.print("\n Marks in Subject2 :");
        Subject2 = sc.nextInt();

        System.out.print("\n Marks in Subject3 :");
        Subject3 = sc.nextInt();

        Total = Subject1 + Subject2 + Subject3;

        Per = (Total * 100)/300;
         
        System.out.print("\n Total Marks: "+Total+", Percentage :"+Per+" ");

    
    }
}