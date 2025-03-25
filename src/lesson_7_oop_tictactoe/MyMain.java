package lesson_7_oop_tictactoe;

import lesson_7_oop_tictactoe.atm.ATM;
import lesson_7_oop_tictactoe.atm.ATMEncapsulation;
import lesson_7_oop_tictactoe.game.GameTicTacToe;
import lesson_7_oop_tictactoe.staff.ITMember;
import lesson_7_oop_tictactoe.staff.Lifters;
import lesson_7_oop_tictactoe.staff.Staff;

public class MyMain {
    public static void main(String[] args) {
        createStaff();
    }

    public static void createStaff(){
        Staff[] teachMeSkillsStaff = new Staff[]{
                new Staff("Jenya", "Onegina", "Cleaner", 41, 324324324),
                new ITMember("Archil", "Sikharulidze", "Java Lecturer", 36, 324324324),
                new Lifters("Ivan", "Mikhailovich", "Weights", 33, 22323121)
        };

        for (Staff member : teachMeSkillsStaff){
            System.out.println(member);
            member.speakStaff();
        }

        System.out.println("********************************************");
        Staff tms = new ITMember("Archil", "S", "Java", 36, 23123123);
        System.out.println(tms);
    }

    public static void setAccessModifiers(){
        ATMEncapsulation archilATM =
                new ATMEncapsulation("BOG", "Archil Sikharulidze", "ARCHIL SIKHARULIDZE",
                        389901901810L, 1970);

        System.out.println(archilATM.getATMFullInformation());

        // Но как теперь обойти стороной запрет на прямой доступ и изменять или извлекать данные?
        System.out.println(archilATM.getAtmCardHolderDebitAccount());

        archilATM.setAtmCardHolderDebitAccount(1789);
        System.out.println(archilATM.getAtmCardHolderDebitAccount());
    }

    // JAVA все находится под супер классом Объект, следовательно, все созданные нами и не только классы
    // Находятся под ним и считаются дочерними, они могут перенимать у этого супер класса его данные и действия

    // ООП во всех языках программирования, особенно в Джава, имеет три фундаментальных принципа:
    // 1. Инкапсуляция - простыми словами, скрытие данных от разных объектов, в зависимости, от надобности
    // 2. Наследование - выстраивается структура между объектами, когда один объект является дополнительной
    // реализацией другого и наследует от родителя его качества
    // 3. Полиморфизм - один интерфейс, множественная реализация, т.е. когда вы написали один метод, но то, что он
    // будет делать зависит от вас - переопределение метода

    public static void useMethodOverload(){
        System.out.println(sum(10, 101));
        System.out.println(sum(10.1, 99.1));
    }

    public static double sum(double x, double y){
        return x + y;
    }

    public static int sum(int x, int y){
        return x + y;
    }

    public static void createATMUser(){
        ATM archilATM =
                new ATM(
                        "TBC", "Archil Sikharulidze", "ARCHIL SIKHARULIDZE",
                        5671_4567_0192_5698L, 2345);

        System.out.println(archilATM.getATMFullInformation());

        System.out.println("***********************************************");
        ATM kateATM = new ATM();

        System.out.println(kateATM.getATMFullInformation());

        ATM evgenyATM = new ATM("BOG", "Evgeny", "Evgeny");

        System.out.println("***********************************************");
        System.out.println(evgenyATM.getATMFullInformation());
    }

    public static void starGame(){
        new GameTicTacToe();
    }
}