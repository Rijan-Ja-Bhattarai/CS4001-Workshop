package Week_3;

import java.util.Scanner;
import java.lang.Math;
/**
 * Write a description of class DataTypeExample here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DataTypeExample
{
    public static void main(String [] args) {
        System.out.println(Float.MIN_VALUE);
        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.BYTES);
        System.out.println(Float.SIZE);
        
        long i = 2000000;
        
        float f = 2.33f;
        
        byte b= 12;
        
        byte a = 12;
        
        byte d= (byte) (a + b);
        
        float x = 2.33f;
        long y = 20;
        double z = 12.3;
        
        int length = 100;
        int breadth = 200;
        int perimeter_rectangle = 2*(length + breadth);
        int area_rectangle = length * breadth;
        
        System.out.println("Perimter Rectangle: " + perimeter_rectangle + "Area: " + area_rectangle);
        
        int Principle = 100;
        int Time = 5;
        float Rate = 2.33f;
        int n = 1;
        
        float SI = (float) ((1/100) * (Principle * Time * Rate));
        System.out.println("SI: " + SI);
    
        float CI = (float)( Principle  * Math.pow(( 1 + Rate/n), n * Time));
        System.out.println("CI: " + CI);

    }
}