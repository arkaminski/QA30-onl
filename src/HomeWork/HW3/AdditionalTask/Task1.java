package HomeWork.HW3.AdditionalTask;

public class Task1 {
    public static void main(String [] args) {
        outputFibonacci();
    }
    public static void outputFibonacci() {
        System.out.println("The first 11 terms of the Fibonacci sequence : ");
        int previous = 0;
        int now = 1;

        for (int i = 1; i <= 11; i++){
            System.out.println(previous);
            int next = previous + now;
            previous = now;
            now = next;

        }
    }







}
