package lesson_6_objects_game;

import lesson_6_objects_game.introobjects.Bank;

public class MyMain {
    public static void main(String[] args) {
        withdrawMoneyFromMyBankAccount();
    }

    public static void withdrawMoneyFromMyBankAccount(){
        Bank bog = new Bank();
        bog.bankName = "Bank of Georgia";
        bog.bankAddress = "Tbilisi, Republic of Georgia";
        bog.staffAmount = 1434;
        bog.creditsGiven = 2_969_194;
        bog.creditCardMoney = 978;
        bog.creditCardNumber = 5647_8904_3456_7801L;

        bog.getBankInfo();

        System.out.println("I wish to withdraw some money.");
        bog.withdrawMoneyFromAccount(197);
        bog.withdrawMoneyFromAccount(81);
        bog.withdrawMoneyFromAccount(701);
    }

    public static void createBasicClassInstances(){
        // Когда мы создаем объект, мы создаем ЭКЗЕМПЛЯР КЛАССА
        // iBank является экземпляром класса Bank
        Bank iBank = new Bank();

        iBank.getBankInfo();
        System.out.println("Just bank name is: " + iBank.bankName);

        iBank.bankName = "iBANK";
        iBank.bankAddress = "Tbilisi, Georgia";
        iBank.staffAmount = 1000;
        iBank.creditsGiven = 2_450_569;

        System.out.println("*******************************************************");
        iBank.getBankInfo();

        System.out.println("---------------------------CREATED A NEW INSTANCE OF BANK-----------------------------");
        Bank gBank = new Bank();

        gBank.getBankInfo();
        gBank.bankName = "gBANK";
        gBank.bankAddress = "Minsk, Belarus";
        gBank.staffAmount = 2000;
        gBank.creditsGiven = 1_000_000;

        System.out.println();
        gBank.getBankInfo();

        System.out.println();
        iBank.getBankInfo();
        gBank.getBankInfo();
    }
}