package HomeWorks.HW3.Constructions;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        setMonthNumber();
    }

    public static void setMonthNumber() {
        System.out.println("Enter number from 1 to 12, to find out what season a month belongs to");
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        getMonthNumber(month);
    }

    public static void getMonthNumber(String month) {
        switch (month) {
            case "1":
            case "2":
            case "12":
                System.out.println("Season - winter");
                break;
            case "3":
            case "4":
            case "5":
                System.out.println("Season - spring");
                break;
            case "6":
            case "7":
            case "8":
                System.out.println("Season - summer");
                break;
            case "9":
            case "10":
            case "11":
                System.out.println("Season - autumn");
                break;
            default:
                System.out.println("Months with ordinal number " + month + " not exist");
                break;
        }
    }
}