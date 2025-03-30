package lesson_9_interfaces_exceptions.excep;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BasicExceptions {
    public static void main(String[] args) {
        // Исключения могут уровня БЛОК try/catch
        // Уровня метод void readDocumentMethodException() throws FileNotFoundException

        // try/catch - классический, с блоком finally который всегда выполняется и try-with-resources
        // последний всегда сам закроет ресурс

        // У исключений - есть своя иерархия - если мы отлавливаем ошибки, то сверху вниз идут пока низког уровня
        // а последним должен быть по иерархии самый главый
        readDocument();
    }

    public static void useTryWithResources(){
        File file = new File("src/lesson_9_interfaces_exceptions/excep/document.txt");

        // try-with-resources нужен для того, чтобы открыть ресурс и самостоятельно его же закрыть
        try(FileInputStream read = new FileInputStream(file)){
            // CODE
        } catch (FileNotFoundException e) {
            System.out.println(e.getLocalizedMessage());
        } catch (IOException e){
            System.out.println();
        }
    }

    // Catch error on a METHOD LEVEL
    public static void readDocumentMethodException() throws FileNotFoundException {
        File file = new File("src/lesson_9_interfaces_exceptions/excep/document.txt");

        FileInputStream read = new FileInputStream(file);
    }

    public static void readDocument(){
        File file = new File("src/lesson_9_interfaces_exceptions/excep/document.txt");
        FileInputStream read;

        // FileInputStream читает данные вашего документа
        try {
            read = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            // Блок который всегда выполняется для определенных финальных процессов
        }
    }

    public static void getTryCatchUnite(){
        int[] numbers = new int[]{1, 4, 6, 10};

        try{
            System.out.println(0/10);

            // В Джава запрещено делить любое число на 0 будет ArithmeticException
            System.out.println(10/0);

            for (int index = 0; index <= numbers.length; index++){
                System.out.println(numbers[index]);
            }
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println("Error caught: " + e.getLocalizedMessage());
        }

        System.out.println("Well done we caught all Errors and saved them!");
    }

    // ArrayIndexOutOfBoundsException
    public static void getTryCatch(){
        int[] numbers = new int[]{1, 4, 6, 10};

        try{
            System.out.println(0/10);

            // В Джава запрещено делить любое число на 0 будет ArithmeticException
            System.out.println(10/0);
        } catch (ArithmeticException e){
            System.out.println("Error caught: " + e.getLocalizedMessage());
        }

        try {
            for (int index = 0; index <= numbers.length; index++){
                System.out.println(numbers[index]);
            }
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error caught: " + e.getLocalizedMessage());
        }
        System.out.println("Well done we caught all Errors and saved them!");
    }
}