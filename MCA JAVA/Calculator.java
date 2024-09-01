import java.util.*;
public class Calculator
{
    public static void main(String[] arg)
    {
        int Num1 = 0 , Num2 = 0 ,Add = 0, Sub = 0 , Mul = 0, Mod = 0;
        float Div = 0;
        Scanner sc =  new Scanner(System.in);

        System.out.print("\n Enter First Number :");
        Num1=sc.nextInt();

        System.out.print("\n Enter Second Number :");
        Num2=sc.nextInt();

        Add = Num1 + Num2;
        System.out.println("\n Addition of Two Number :" +Add);

        Sub = Num1 - Num2;
        System.out.println("\n Subtraction of Two Number :" +Sub);
        
        Mul = Num1 * Num2;
        System.out.println("\n Multiplication of Two Number :" +Mul);
        
        Div = Num1 / Num2;
        System.out.println("\n Diviion of Two Number :" +Div);
        
        Mod = Num1 % Num2;
        System.out.println("\n Modulus of Two Number :" +Mod);
    }    
}