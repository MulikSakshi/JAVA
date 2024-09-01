import java.util.*;
public class Area_Rectangle
{
    public static void main(String[] arg)
    {
        float Width = 0, Height = 0;
        float Area = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("\n Enter Width of Rectangle :");
        Width = sc.nextFloat();

        System.out.print("\n Enter Height of Rectangle :");
        Height = sc.nextFloat();

        Area = Width * Height;
        System.out.print("\n Area of Rectangle :"+Area);
    }
}


