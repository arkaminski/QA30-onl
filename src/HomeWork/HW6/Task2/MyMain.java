package HomeWork.HW6.Task2;

public class MyMain {
    public static void main(String[] args) {
        task2();
    }
        public static void task2(){
            Computer firstPC = new Computer(555,"TP8899");
            Computer secondPC =
                    new Computer(666, "oo1122",
                            "ram2", 512,
                            "hd1", 1024, false);
            firstPC.allInfo();
            System.out.println();
            secondPC.allInfo();
    }
}
