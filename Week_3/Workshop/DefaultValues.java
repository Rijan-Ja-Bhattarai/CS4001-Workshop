package Week_3.Workshop;

public class DefaultValues
{
    int Num;
    float Flo;
    boolean Bool;
    long Long_Num;
    byte Byt;
    short Short_Num;
    char Character;
    double Dou;
    public static void main(String [] args) {
        DefaultValues dv = new DefaultValues();
        System.out.println(dv.Num);
        System.out.println(dv.Flo);
        System.out.println(dv.Bool);
        System.out.println(dv.Long_Num);
        System.out.println(dv.Byt);
        System.out.println(dv.Short_Num);
        System.out.println(dv.Character);
        System.out.println(dv.Dou);

        /*This wouldnt work for local variables as local variable cant be an 
         * object if it is not an instance variable and they must be initialized before running 
        */          
    }
}
