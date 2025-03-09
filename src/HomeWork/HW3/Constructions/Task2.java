package HomeWorks.HW3.Constructions;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        getSeason();
    }

    public static void getSeason () {
    System.out.println("Enter number from 1 to 12");
    Scanner scan = new Scanner(System.in);
    int NumberOfMonth = scan.nextInt();
    outputSeason(NumberOfMonth);
     }

     public static void outputSeason(int NumberOfMonth) {
        if (NumberOfMonth >=1 && NumberOfMonth <3 || NumberOfMonth ==12){
            System.out.println("Season - winter");}
        else if (NumberOfMonth >=3 && NumberOfMonth <=5){
            System.out.println("Season - spring");}
        else if (NumberOfMonth >=6 && NumberOfMonth <=8){
            System.out.println("Season - summer");}
        else if (NumberOfMonth >=9 && NumberOfMonth <=11) {
                        System.out.println("Season - autumn");}
        else {
            System.out.println("Invalid value. Please enter value between 1 and 12");
        }
        }

     }