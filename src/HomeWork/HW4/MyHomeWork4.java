package HomeWork.HW4;

import java.util.Scanner;

public class MyHomeWork4 {

    public static void main(String[] args) {
        //checkValueInArray();
        removeValueFromArray();



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

        for(int i = 0; i < array.length; i++){
            if(array[i] != length){
                arrayWithoutValue[i] = array[i];
            } else continue;

        }
        for (int el : arrayWithoutValue) {
            System.out.print(el + "\t");
        }



    }







}





