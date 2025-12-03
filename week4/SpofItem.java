package Week_3.week4;

import java.util.Scanner;
/**
 * Write a description of class SpofItem here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SpofItem
{
    public static void main(String [] args) {
     
    Scanner sc = new Scanner(System.in);
    
    float MP = 0.0f, SP = 0.0f;
    char Category;
    float [] Discount = {0.6f, 0.4f, 0.3f, 0.1f};    
    int Category_Size = 4; // class [A, B, C, D]
    char [] Categories = {'A', 'B', 'C', 'D'}; // Respective classes
    
    System.out.println("Enter MP: ");
    MP = sc.nextFloat();
    System.out.println("Enter Category: ");
    Category = sc.next().charAt(0);
    Category =Character.toUpperCase(Category);
    
    for (int i = 0; i < Category_Size; i++) {
        if (Category == Categories[i]) {
            SP = MP - MP * Discount[i];
            System.out.println("Selling Price = " + SP);
            break;
        }
    }
    
    sc.close();
    }
}