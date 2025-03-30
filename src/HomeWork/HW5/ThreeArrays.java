package HomeWork.HW5;

import java.util.Scanner;

public class ThreeArrays {
    public static void main(String[] args){
        //getThreeArray();
        System.out.println("********");
        //createChess();
        //multiplicationArrays();
        //sum2DArray();
        //printArrayDiagonal();
        sort2DArray();

    }

    public static int [][][] createThreeArray(){
        int [][][] array = new int [][][] {
                {
                        {3, 2, 1},
                        {7, 8}
                },
                {
                        {44, 0, 100}
                }
        };
        return array;
    }

    public static void getThreeArray(){

        int[][][] mas = createThreeArray();
        System.out.println("Set value to increase the array: ");
        int num = input().nextInt();

        for (int outer = 0; outer < mas.length; outer++ )
            for (int inner = 0; inner < mas[outer].length; inner++) {
                for (int deep = 0; deep < mas[outer][inner].length; deep++){
                    System.out.print(mas[outer][inner][deep] + num + " ");
                }
                System.out.println();
            }

    }

    public static void createChess(){

        String [][] Board = new String[8][8];
        for (int i = 0; i< Board.length; i++) {
            for (int j = 0; j < Board[i].length; j++) {
                if ((i + j) % 2 == 0) Board[i][j] = "W";
                else Board[i][j] = "B";
                System.out.print(Board[i][j] + "\t");
            }
            System.out.print( "\n");

        }
    }

    public static Scanner input(){
        return new Scanner(System.in);
    }
    public static void multiplicationArrays() {
        int[][] array1 = {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}};
        int[][] array2 = {{1, 4, 3}, {1, 2, 1}, {0, 1, 0}, {3, 1, 0}};
        int[][] array3 = new int[array1.length][array2[0].length];
        for (int i = 0; i < array3[0].length; i++)
            for (int j = 0; j < array3.length; j++)
                for (int k = 0; k < array1[0].length; k++)
                    array3[i][j] = array3[i][j] + array1[i][k] * array2[k][j];

        System.out.println(" Results of multiplication between two arrays: ");
        for (int[] multi : array3) {
            for (int j = 0; j < array3[0].length; j++) {
                System.out.print(" " + multi[j] + " ");
            }
            System.out.println();
        }
    }

    public static void sum2DArray() {
        System.out.println("2D array");
        int[][] array2D = new int[][]{{5, 5, 5}, {7, 5, 4, 8}, {5, 9}};
        int sum = 0;
        for (int[] val : array2D) {
            for (int num : val) {
                sum += num;
            }
        }
        for (int a=0; a<3;a++){
            for (int b=0;b<array2D[a].length;b++){
                System.out.print(array2D[a][b] + "\t");
            }

        }
        System.out.println();
        System.out.println("Sum of 2D array is: " + sum);
    }
    public static void printArrayDiagonal() {

        int a, b, c;
        int x = 3;
        int y = 3;
        int[][] array2D = {{6, 5, 4}, {1, 3, 8}, {5, 4, 2}};
        System.out.println("Print diagonals of the 2D array: ");
        for (c = 0; c <= x - 1; c++) {
            a = c;
            b = 0;
            while (a >= 0) {
                System.out.print(array2D[a][b] + "\t");
                a = a - 1;
                b = b + 1;
            }
        }
        for (c = 1; c <= y - 1; c++) {
            a = x - 1;
            b = c;
            while (b <= y - 1) {

                System.out.print(array2D[a][b] + "\t");
                a = a - 1;
                b = b + 1;
            }
        }
    }

    public static void sort2DArray() {
        System.out.println();
        System.out.println("Bubble Sort for 2D array: ");
        int[][] matrix = new int[][]{
                {3, 2, 1},
                {7, 9, 2},
                {7, 5, 9}
        };
        int swap;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                for (int k = 0; k < matrix.length; k++) {
                    for (int l = 0; l < matrix[k].length; l++) {
                        if (matrix[i][j] <= matrix[k][l]) {
                            swap = matrix[i][j];
                            matrix[i][j] = matrix[k][l];
                            matrix[k][l] = swap;
                        }
                    }
                }
            }
        }
        for (int[] newMatrix : matrix) {
            for (int i : newMatrix) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

}