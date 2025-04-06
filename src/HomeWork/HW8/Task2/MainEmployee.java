package HomeWork.HW8.Task2;

public class MainEmployee {
    public static void main(String[] args) {
        Director director = new Director();
        Worker worker = new Worker();
        Accountant accountan = new Accountant();

        director.setPosition();
        worker.setPosition();
        accountan.setPosition();
    }
}
