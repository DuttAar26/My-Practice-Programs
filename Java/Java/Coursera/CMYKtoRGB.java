package Coursera;
import java.util.Scanner;
import java.util.Arrays;
public class CMYKtoRGB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 4 decimals");
        String x = input.nextLine();
        String[] y = x.split(",");
        String Cyan = y[0];
        String Magenta = y[1];
        String Yellow = y[2];
        String Black = y[3];
        float Black2 = Float.parseFloat(Black);
        float Cyan2 = Float.parseFloat(Cyan);
        float Magenta2 = Float.parseFloat(Magenta);
        float Yellow2 = Float.parseFloat(Yellow);
        int White = 1 - Math.round(Black2);
        float Red = 255 * White * (1 - (Cyan2));
        float Green = 255 * White * (1 - (Magenta2));
        float Blue = 255 * White * (1 - (Yellow2));
        System.out.println("Red = " + Math.round(Red));
        System.out.println("Green = " + Math.round(Green));
        System.out.println("Blue = " + Math.round(Blue));
       

    }
}
