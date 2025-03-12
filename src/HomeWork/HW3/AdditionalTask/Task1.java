package HomeWork.HW3.AdditionalTask;

public class Task1 {
    public static void main(String [] args) {
        getMultiplicationTable();
    }
    public static void  getMultiplicationTable() {
        for (int i = 1; i <= 10; i++) {
            for (int a = 1; a <= 10; a++) {
                System.out.print(" " + (i * a) + " ");
            }
            System.out.println();
        }
    }
}
