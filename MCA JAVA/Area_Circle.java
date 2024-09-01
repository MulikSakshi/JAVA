import java.util.*;
public class Area_Circle
{
    public static void main(String[] arg)
    {
        float Radius = 0;
        double Area = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("\n Enter Radius of Circle :");
        Radius = sc.nextFloat();

        Area = 3.14*Radius*Radius;
        System.out.print("\n Area :"+Area);
    }
}
