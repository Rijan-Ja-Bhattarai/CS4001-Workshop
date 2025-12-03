package week5;


/**
 * Write a description of class Skip6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Skip6
{
    public static void main(String [] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 6) {
                continue;
            }
            System.out.println(i);
        }
    }
}