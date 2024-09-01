import java.util.*;
public class Stud_Info
{
    public static void main(String[] arg)
    {
        int Roll_No = 0;
        String Stud_Name, Course ,City;
        Scanner sc = new Scanner(System.in);

        System.out.print("\n Enter Student Name :");
        Stud_Name = sc.nextLine();

        System.out.print("\n Enter Roll No :");
        Roll_No = sc.nextInt();

        System.out.print("\n Enter Course :");
        Course = System.console().readLine();

        System.out.print("\n Enter City :");
        City = System.console().readLine();

        System.out.println("\n Student Name : "+Stud_Name+" \n Roll_No : "+Roll_No+" \n Course :"+Course+" \n City :"+City);
    }
}

