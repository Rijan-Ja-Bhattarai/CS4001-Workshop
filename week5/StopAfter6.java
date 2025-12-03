package week5;


/**
 * Write a description of class StopAfter6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StopAfter6
{
    public static void main(String [] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            if (i == 6) {
                break;
            }
        }
    }
}