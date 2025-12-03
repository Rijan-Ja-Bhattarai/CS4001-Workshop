import java.util.Scanner;
/**
 * Write a description of class workshop here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class workshop
{
    public static void main(String[] args)
    {
        Scanner src = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int num1 = src.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = src.nextInt();
        
        int g_num = (num1 > num2)?num1:num2;
        System.out.println("Greatest number: " + g_num);
        
        src.close();
    }
    
    
}