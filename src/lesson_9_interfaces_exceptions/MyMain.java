package lesson_9_interfaces_exceptions;

import lesson_9_interfaces_exceptions.interf.controlpanel.SamsungControlPanel;
import lesson_9_interfaces_exceptions.interf.fi.Human;
import lesson_9_interfaces_exceptions.interf.markeri.HumanCloneable;

import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        createObjects();
    }

    public static void createObjects(){
        // Super class Object
        Object str = "Archil Sikharulidze";
        Object intAge = 36;
        Object weight = 78.14;
        Object letter = 'A';

        System.out.println(str);
        System.out.println(intAge);
        System.out.println(weight);
        System.out.println(letter);

        Object[] objArray = new Object[]{
                "Archil Sikharulidze",
                36,
                "Java Developer",
                'C',
                new String[]{
                        "TMS",
                        "TBC",
                        "ENG"
                }
        };

        for (Object el : objArray){
            System.out.println(el);
        }
    }

    // Marker interface
    public static void cloneHuman(){
        HumanCloneable archil =
                new HumanCloneable("Archil", "Sikharulidze", 36, "Java Developer");
        HumanCloneable vasily = archil.clone();
        vasily.setName("Vasya");

        System.out.println(archil);
        System.out.println(vasily);
    }

    public static void createTУwoInstancesOneObject(){
        Human archil = new Human("Archil", "Sikharulidze", 36, "Java Developer");
        Human vasya = archil;

        // У меня и archil & vasya на самом деле указывают на один объект
        // Это просто две ссылки на один и тот же участок памяти
        System.out.println(archil);
        System.out.println(vasya);
        vasya.setName("GIORGI");
        System.out.println(archil);
        System.out.println(vasya);
    }

    public static void copyHumanFunctionalInterface(){
        Human archil = new Human("Archil", "Sikharulidze", 36, "Java Developer");
        Human vasya = archil.copyObject(archil);

        System.out.println(archil);

        System.out.println("***************************************");

        System.out.println(vasya);
        vasya.setName("Vasya");

        System.out.println("***************************************");
        System.out.println(archil);
        System.out.println("----------------------------------------");
        System.out.println(vasya);
    }

    public static void createSamsungControlPanel(){
        SamsungControlPanel samsung = new SamsungControlPanel(2022, 6709);

        System.out.println("Let's turn on your TV.");
        samsung.turnOnInternet();

        System.out.println("****************************************************************************");

        System.out.println("Let's get data on your internet:");
        System.out.println(samsung.getInternetInformation());

        System.out.println("****************************************************************************");

        System.out.println("Let's try to get access to a private function on your control panel.");
        System.out.println("Please, enter a Pin CODE:");

        if (samsung.validateInternetPinCode(new Scanner(System.in).nextInt())){
            System.out.println("You have entered a correct PIN CODE.");
            System.out.println("You have a FULL ACCESS to the CONTROL PANEL.");
        } else {
            System.out.println("Your PIN CODE VALIDATION FAILED.");
            System.out.println("ACCESS DENIED!");
        }

        System.out.println("********************************************************************************");
        System.out.println(samsung);

        System.out.println("********************************************************************************");

        samsung.turnOnTV();
        samsung.decreaseSoundTV();
        samsung.changeChannelUpTV();
        samsung.turnOffTV();
        System.out.println("What is your ERROR msg? " + samsung.getErrorMsg());
        System.out.println("How many buttons do you have on a TV control panel? " + samsung.getButtonsNumber());

        System.out.println("********************************************************************************");

        samsung.callControlPanel();
    }
}