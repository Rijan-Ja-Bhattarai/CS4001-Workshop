import java.util.Scanner;
/**
 * Write a description of class WaterLevelMonitor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WaterLevelMonitor
{
    public static void main(String [] args){       
        Scanner sc = new Scanner(System.in);
        double WaterLevel = 0.0;
        
        System.out.println("Enter water level: ");
        WaterLevel = sc.nextDouble();
        
        System.out.println("Current water level: " + WaterLevel);
        
        String Warning = (WaterLevel <= 1000)? "Status Normal" : "WARNING: Water level has reached 1000L or more!";
        
        System.out.println(Warning);
        
        sc.close();
    }
}