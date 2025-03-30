package HomeWork.HW7.Task1;

public class MainPhone {
    public static void main(String[] args) {

        Phone phone1 = new Phone("Node5", "Xiaomi", 122.5);
        Phone phone2 = new Phone("15", "Nokia");
        Phone phone3 = new Phone();

        phone1.displayInfo();
        phone2.displayInfo();
        phone3.displayInfo();

        phone1.receiveCall("Artur");
        phone2.receiveCall("Archil", "333-111-333");

        System.out.println("First Number: " + phone1.getNumber());
        System.out.println("Second Number: " + phone2.getNumber());

        phone1.sendMessage("123-456-789", "777-111-777");
    }
}