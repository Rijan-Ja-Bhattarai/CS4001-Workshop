import java.util.Scanner;
/**
 * Calculator PRogram
 *
 * @author (Rijan Bhattarai)
 * **/
public class ques5
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        
        float Num1, Num2 = 0.0f;
        
        System.out.print("Enter first number: ");
        Num1 = sc.nextFloat();
        
        System.out.print("Enter second number: ");
        Num2 = sc.nextFloat();
        
        // Calculations 
        float Sum = Num1 + Num2;
        float Diff = Num1 - Num2;
        float Product = Num1 * Num2;
        float Division = Num1 / Num2;
        float Rd = Num1 % Num2;
        
        System.out.println("Sum: " + Sum + "\nDifference: " + Diff + "\nProduct: " + Product + "\nDivision: " + Division + "\nRemainder: " + Rd);
        
        sc.close();
    }
}