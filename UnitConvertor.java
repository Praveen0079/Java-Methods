import java.util.Scanner;

public class UnitConvertor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        double n = sc.nextDouble();
        System.out.println(n+" Km in Miles = "+Km2Ml(n));
        System.out.println(n+" Miles in KM = "+Miles2Km(n));
        System.out.println(n+" Meters in Feet = "+meters2feet(n));
        System.out.println(n+" Feets in meters = "+feet2meters(n));
    }
    static double Km2Ml(double n){
        return n*0.621371;
    }
    static double Miles2Km(double n){
        return n*1.60934;
    }
    static double meters2feet(double n){
        return n*3.28084;
    }
    static double feet2meters(double n){
        return n*0.3048;
    }
}