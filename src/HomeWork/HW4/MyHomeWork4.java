package HomeWork.HW4;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

import static lesson_5_arrays_multi_arrays.tictactoe.GameTicTacToe.input;

public class MyHomeWork4 {

    public static void main(String[] args) {
        //checkValueInArray();
        //removeValueFromArray();
        //averageNumberArray();
        //createTwoArrays();
        //createRandomArrays();
        //replaceOldArray();
        //sortNames();
        //bubbleSort();


    }

    public static void checkValueInArray() {
        int[] Data = new int[]{1, 3, 5, 8, 12, 13, 9, 4};

        int length = 0;
        do {
            System.out.print("Please enter number to check if it is exist in array (<20):");
            if ((length = new Scanner(System.in).nextInt()) < 20) break;
        } while (true);

        int DataValue = -1;

        for (int index = 0; index < Data.length; index++) {
            if (Data[index] == length) {
                length = DataValue;
                break;
            }
        }
        if (length == -1) {
            System.out.print("Number exist in array");
        } else {
            System.out.print("Number is NOT in array");
        }


    }

    public static void removeValueFromArray() {

        int[] array = new int[] {1, 3, 5, 8, 12, 13, 9, 4};
        System.out.print("Old array:  \n ");
        for (int index = 0; index < array.length; index++){
            System.out.print(array[index] + "\t");
        }

        int[] arrayWithoutValue = new int[array.length];
        int length = 0;
        System.out.print("\n");
        do {
            System.out.print("Please enter the value, which will be removed from array:");
            if ((length = new Scanner(System.in).nextInt()) < 15) break;
        } while (true);

        int count = 0;

        for(int i = 0; i < array.length; i++){
            if(length != array[i]){
                count++;
            }
        }
        if(count == array.length){
            System.out.println("Entered value not exist");
            return;
        }
        for(int i = 0; i < array.length; i++){
            if(array[i] != length){
                arrayWithoutValue[i] = array[i];
            }
        }
        for (int el : arrayWithoutValue) {
            System.out.print(el + "\t");{
                       }
        }
    }

    public static void averageNumberArray(){
        System.out.println("Set size of array:");
        int size = input().nextInt();

        double[] array = new double[size];

        for (int i = 0; i < size; i++){
            array[i] = Math.random();
            System.out.println(array[i]);
        }

        double avg;
        double sum = 0;

        double min = array[0];
        double max = array[0];

        for (double num : array){
            if (num < min){ min = num; }
            if (num > max){ max = num;}
            sum+=num;

        }
        avg = (double) sum /size ;
        System.out.println("AVG is " + avg);
        System.out.println("Max is " + max);
        System.out.println("Min is " + min);

    }

    public static void createTwoArrays(){
        int[] arrayFirst = new int[]{122,11,4,6,14};
        int[] arraySecond = new int[]{44,21,5,4,10};
        System.out.println("AVG for first Array is " + calculateAvg(arrayFirst));
        System.out.println("AVG for second Array is " + calculateAvg(arraySecond));

        if (calculateAvg(arrayFirst) > calculateAvg(arraySecond)){
            System.out.println("AVG of first Array > AVG of second Array");}
        else
        if (calculateAvg(arrayFirst) < calculateAvg(arraySecond)){
            System.out.println("AVG of second Array < AVG of second Array");}
        else {
            System.out.println("AVG of first Array = AVG of second Array"); }
    }


    public static int calculateAvg(int[] array){
        int avg;
        int sum = 0;

        for (int num : array){
            sum+=num;
        }

        int size = array.length;
        avg = (int) sum /size;
        return avg;
    }

    public static Scanner input(){
        return new Scanner(System.in);
    }


    //Additional tasks
    public static void createRandomArrays(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Insert size of an array:");
        int n = 0;
        while (n < 6 || n > 10) {
            if (scan.hasNextInt()) {
                n = scan.nextInt();
                if (n < 6 || n > 10) {
                    System.out.println("Inserted value should be more than 5 and less or equal to 10. Enter value again:");
                }
            }
        }
        int[] newArray = new int[n];
        int evenNums = 0;

        for (int i = 0; i < n; i++) {
            newArray[i] = (int) (Math.random() * (n + 1));
            if (newArray[i] % 2 == 0) {
                evenNums++;
            }
        }
        System.out.println(Arrays.toString(newArray));
        int[] finalArray = new int[evenNums];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (newArray[i] % 2 == 0) {
                finalArray[index] = newArray[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(finalArray));
    }
    public static void replaceOldArray(){
        int[] array = {3, 4, 8, 9};
        System.out.println("Old array is " + Arrays.toString(array));
        for(int i = 1; i< array.length; i+=2){
            array[i] = 0;
        }
        System.out.println("New array is " + Arrays.toString(array));

    }
    public static void sortNames() {
        String[] coleages = new String[]{
                "Tania",
                "Dima",
                "Vika",
                "Paul",
        };
        Arrays.sort(coleages);
        for (String name : coleages){
            System.out.println(name);
        }
    }
    public static void bubbleSort() {
        int[] array = {6, 1, 13, 222, 11, 4, 18, 2, 0, 55, 7};
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
        System.out.println("Array after bubble sort: ");
        for (int el : array){
            System.out.print(el + "\t");
        }
    }
}





