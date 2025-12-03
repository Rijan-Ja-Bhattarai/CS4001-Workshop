import java.util.Scanner;
/**
 * Write a description of class Ausadhi_Pasal here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ausadhi_Pasal
{
    public static void main(String [] args){
        // String Medicine_Info Manufacturing date, Expiry Date, Name, For Disease 
        Scanner sc = new Scanner(System.in);
        
        String Medicine_Name;
        double Total_Price = 0.0, Price = 0.0;
        int Stock = 0, Quantity = 0;
        int Perscription = 50;
        
        // Initialize Stock for the Pharmacist
        System.out.println("Enter total number of medicine: ");
        Stock = sc.nextInt();
        // Take Input from Pharmacist
        System.out.println("Enter medicine name: ");
        sc.next();
        Medicine_Name = sc.nextLine();
        
        
        // Take input from the user
        System.out.println("Enter Quantity: ");
        Quantity = sc.nextInt();
        
        // Pharmacist
        Stock -= Quantity;
        System.out.println("Enter price for " + Medicine_Name + ": ");
        Price = sc.nextDouble();
        
        // Price
        Total_Price = Price * Quantity;
        System.out.println("Total Price:NPR " + Total_Price);
        
        // Perscription Condition
        System.out.println("Remaining Stock: " + Stock);
        boolean Backup = (Stock <= Perscription) ? true : false;
        
        System.out.print("Perscription required?: " + Backup);
        
        sc.close();
    }
}