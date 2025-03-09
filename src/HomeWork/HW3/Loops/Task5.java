package HomeWork.HW3.Loops;

public class Task5 {
    public static void main(String[] args){
        outputNumbers();
    }

    public static void outputNumbers(){
        int number = 0;
        for (int i = 0; i < 10; i++){
            System.out.println(number);
            number -= 5;
        }

    }
}

