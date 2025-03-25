package HomeWork.HW6.Task2;

public class Computer {
    private int value;
    private String model;
    private HDD hdd;
    private RAM ram;

    public Computer(int value, String model){
        this.value = value;
        this.model = model;
        hdd = new HDD();
        ram = new RAM();
    }
    public Computer(int value, String model, String nameRAM, int sizeRAM, String nameHDD, int sizeHDD, boolean isInternalHDD){
        this.value = value;
        this.model = model;
        hdd = new HDD(nameHDD, sizeHDD, isInternalHDD);
        ram = new RAM(nameRAM, sizeRAM);
    }

    public void allInfo(){
        System.out.println("Model: " + model);
        System.out.println("Cost: " + value);
        System.out.println("------RAM------");
        ram.allInfo();
        System.out.println("------HDD-------");
        hdd.allInfo();
    }

}
