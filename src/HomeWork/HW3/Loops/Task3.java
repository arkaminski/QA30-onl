package HomeWork.HW3.Loops;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args){
        getSumm();
    }

    public static void getSumm() {
        System.out.println("Enter positive integer number");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        setNumber(number);
    }

    public static void setNumber(int number) {
            int sum = 0;
            for (int i = 1; i <= number; i++) {
                sum += i;
            }
            System.out.println("Summ of numbers from 1 to " + number + " is equal to " + sum);

        }


    }

