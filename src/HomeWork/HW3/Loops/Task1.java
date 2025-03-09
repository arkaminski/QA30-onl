package HomeWork.HW3.Loops;


public class Task1 {
    public static void main(String[] args) {
        getOddsNumbers();
    }

    public static void getOddsNumbers(){
            for (int number = 1; number <= 99; number++) {
                if ((number % 2) == 0) {
                    continue;
                }
                System.out.println(number);
            }
    }
}
