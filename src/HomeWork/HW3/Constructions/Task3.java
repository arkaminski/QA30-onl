package HomeWork.HW3.Constructions;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        setNumber();
    }

    public static void setNumber() {
        System.out.println("Please enter number:");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        outputNumber(number);
    }

    public static void outputNumber(int number) {
        if (number % 2 > 0) System.out.println("Number " + number + " is odd");
        else System.out.println("Number " + number + " is even");
    }
}