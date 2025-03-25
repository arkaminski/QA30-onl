package lesson_7_oop_tictactoe.atm;

public class Main {
    public static void main(String[] args) {
        ATM archilATM =
                new ATM("BOG", "Archil Sikharulidze", "ARCHIL SIKHARULIDZE",
                        389901901810L, 1970);

        System.out.println(archilATM.getATMFullInformation());
        System.out.println(archilATM.atmCompany); // because inside a package - protected
        System.out.println(archilATM.atmUser); // package-private - package level
    }
}