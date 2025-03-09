package HomeWork.HW3.Constructions;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
    setTemperature();
    }

    public static void setTemperature(){
        System.out.println("Please enter Temperature");
        Scanner scan = new Scanner(System.in);
        int temperature = scan.nextInt();
        outputTemperature(temperature);
    }

    public static void outputTemperature(int temperature) {
        if (temperature > -5) System.out.println("Warm");
        else if (-5 >= temperature && temperature > -20) System.out.println("Fine");
        else if (-20 >= temperature) System.out.println("Cold");
    }
}

