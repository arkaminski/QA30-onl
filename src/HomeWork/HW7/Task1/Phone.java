package HomeWork.HW7.Task1;

public class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this(number, model, 0.0);
    }
    public Phone() {
        this("323", "ZTE", 500.0);
    }
    public String getNumber() {
        return number;
    }
    public void receiveCall(String callerName) {
        System.out.println("Calling: " + callerName + ".");
    }
    public void receiveCall(String callerName, String callerNumber) {
        System.out.println("Calling: " + callerName + " number is: " + callerNumber + ".");
    }
    public void sendMessage(String... numbers) {
        System.out.print("Message was send to: ");
        for (String num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public void displayInfo() {
        System.out.println("Number: " + number + ", Model: " + model + ", Weight: " + weight);
    }
}