package Week_3.week4;

import java.util.Scanner;
/**
 * Write a description of class ScholorshipChecker here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ScholorshipChecker
{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        
        double gpa;
        int attendance_perc, attitude;
        
        System.out.print("Enter GPA: ");
        gpa = sc.nextFloat();
        
        System.out.print("Enter Attendance Percentage: ");
        attendance_perc = sc.nextInt();
        
        System.out.print("Enter Attitude: ");
        attitude = sc.nextInt();
        
        // Validate Input
        if((gpa >= 0.0 && gpa <= 4.0) && (attitude >= 0 && attitude <= 10) && (attendance_perc <= 0 && attendance_perc >= 100)) {
            if (gpa >= 3.2 && attendance_perc >= 80 && attitude < 5) {
                System.out.println("Eligible for Scholorship");
            }
            else
            {
                System.out.println("Not Eligible for Scholorship");
            }
        }
        else {
                System.out.println("Invalid Input");
        }
        
        sc.close();
    }
}