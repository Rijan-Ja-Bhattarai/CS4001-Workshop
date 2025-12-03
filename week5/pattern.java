package week5;


/**
 * Write a description of class pattern here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class pattern
{
    public static void main(String [] args) 
    {
     for (int i = 5; i >= 1; i--) { 
        for (int j = 5; j >= i; j--) {
            System.out.print(j + " ");
        }
        System.out.println(" ");
    }   
    }
}