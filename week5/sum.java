package week5;


/**
 * Write a description of class sum here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class sum
{
    public static void main(String [] args) {
        // sum of all even and odd numbers
        int sum_even = 0, sum_odd = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0)
            {
                sum_even += i;
            }
            else
            {
                sum_odd += i;
            }
        }   
        System.out.println("Sum of even numbers: " + sum_even);
        System.out.println("Sum of odd numbers: " + sum_odd);
    }
}