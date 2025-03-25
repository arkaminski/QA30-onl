package lesson_8_abstract_interfaces_composition.compos;

import lesson_8_abstract_interfaces_composition.compos.pcelements.*;

public class MyPC {
    public static void main(String[] args) {
        createPersonalComputer();
    }

    public static void createPersonalComputer(){
        Computer pcI9Intel = new Computer(
                new Adapter("GX-100", "220W"),
                new Baseboard("Asus GH950", "Has three sockets and is the best one."),
                new CPU("i9", 8, 3.2),
                new HDD("Seagagate", "SSD", 2),
                new RAM("Asus9i", "DDR5", 32),
                new VGA("Core678", 512),
                new String[]{"Case", "Lighting", "CD/DVD"}
        );

        System.out.println(pcI9Intel);
        System.out.println("****************************************************************************");
        System.out.println("How many cores our CPU has? " + pcI9Intel.getCpu().getCore());
    }
}