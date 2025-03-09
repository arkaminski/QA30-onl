package HomeWork.HW3.Constructions;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        setNumber();
    }

    public static void setNumber() {
        System.out.println("Please enter Number to know rainbow collor");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        outputNumber(number);
    }

    public static void outputNumber(int number) {
        if (number == 1) System.out.println("Red");
        else if (number == 2) {System.out.println("Orange");}
        else if (number == 3) {System.out.println("Yellow");}
        else if (number == 4) {System.out.println("Green");}
        else if (number == 5) {System.out.println("Blue");}
        else if (number == 6) {System.out.println("Dark blue");}
        else if (number == 7) {System.out.println("Violet");}
        else {System.out.println("Invalid value. Please enter value between 1 and 7");
    }


    }
}
