
package lesson_4_advanced_arrays;

import java.util.Random;
import java.util.Scanner;

public class MyMain {
    public static void main(String[] args){
        changeArraySize();
    }

    public static void changeArraySize(){
        // Five elements
        int[] numbers = new int[]{1, -1, 0, 19, 20};

        // Расширяем оригинальный массивы на десять элементов
        int[] extendedNumbers = new int[numbers.length + 10];

        // Копирование элементов оригинального массива в новый
        for (int index = 0; index < numbers.length; index++){
            extendedNumbers[index] = numbers[index];
        }

        System.out.println("Your old array is: ");
        for (int el : numbers){
            System.out.print(el + "\t");
        }

        System.out.println("\nYour new array is: ");

        for (int el : extendedNumbers){
            System.out.print(el + "\t");
        }

        System.out.println();
    }

    public static void fillArrayWithRandomNumbers(){
        // HARD WAY: Math.random() -> ПОСМОТРИТЕ НА САЙТЕ ФОРМУЛУ
        // Псевдослучайные числа, даются по формуле
        // Для реально серьезных работ, используются дополнительные библиотеки
        Random randomValues = new Random();

        System.out.print("Please, enter array size: ");
        int length = input().nextInt();

        int[] randomNumbers = new int[length];

        for (int index = 0; index < randomNumbers.length; index++){
            // Random (от, до) - 0, 11 от 0 до 11 (максимальное значение, 10)
            randomNumbers[index] = randomValues.nextInt(1, 11);
        }

        for (int el : randomNumbers){
            System.out.println("Value: " + el);
        }
    }

    public static void getArrayAdvancedLoop(){
        String[] week = new String[]{
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"
        };

        for (String day : week){
            System.out.println(day);
        }

        System.out.println("Lets change values: ");
        for (String day : week){
            day = "WELCOME";
            System.out.println(day);
        }

        System.out.println("*******************************");
        for (String day : week){
            System.out.println(day);
        }
    }

    public static void setArrayLoop(){
        char[] englishAlphabet = new char[26];

        for (int index = 0, letter = 65; index < englishAlphabet.length; index++, letter++){
            englishAlphabet[index] = (char) letter;
        }

        System.out.println("You array englishAlphabet contains:");

        for (int index = 0; index < englishAlphabet.length; index++){
            System.out.print(englishAlphabet[index] + "\t");
        }
        System.out.println("\n*******************************************");

        // Advanced for loop ONLY FOR READING
        // TO PROTECT ORIGINAL ARRAY
        for (char letter : englishAlphabet){
            System.out.print(letter + "\t");
        }
        System.out.println();
    }

    public static void getBasicArray(){
        // "Apple"

        // 'A', 'p', 'p', 'l', 'e' = fruit
        // "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" = week
        // 15, -1, 9, 8, 10 = lotteryNumbers
        // true, true, false, true, false, false = logicalAnswers

        // 1. Массив это однотипный набор данных, все элементы должны быть одного типа
        // 2. Размер массива невозможно изменить, если вам нужно изменить размер массива
        // нужно создать новый и туда перенести старые данные

        // Одномерный массив
        // Объявление массива names
        String[] names;

        // Array is an object, we need to allocate memory
        // Выделение памяти для пяти элементов типа String
        names = new String[5];

        System.out.println(names); // Показывает адрес, по которому в Куче будут хранятся данные

        // Задать значения каждому элементу
        names[0] = "Archil";
        names[1] = "Vladimir";
        names[2] = "Katya";
        names[3] = "Yulia";
        names[4] = "Irina";

        // Если вы неправильно указали индекс элемента - ArrayIndexOutOfBoundsException
        // Максимальный размер вашего индекса - это размер - 1
        // Первый элемент хранится под индексом - 0
        // names[5] = "Giorgi"; -- ОШИБКА

        System.out.println(names[0]);
        System.out.println(names[4]);

        System.out.println("****************************");

        char[] letters = new char[10];
        letters[0] = 'c';
        letters[5] = 'R';

        System.out.println(letters[0]);
        System.out.println(letters[4]);
        System.out.println(letters[5]);
        System.out.println(letters[9]);

        System.out.println("*********************************");

        int[] numbers = new int[]{-1, 9, 100, 5, 9};

        // У каждого массива есть метод длина, которая дает длину заданную вами
        // Чтобы вытянуть последний индекс: длина - 1
        System.out.println(numbers[numbers.length - 1]); // 5 -1 = 4
    }

    public static Scanner input(){
        return new Scanner(System.in);
    }
}
