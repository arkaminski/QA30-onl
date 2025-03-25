package lesson_7_oop_tictactoe.atm;

public class ATM {
    // ACCESS MODIFIERS - модификаторы доступа
    // public - доступно абсолютно всем и везде
    // private - доступно только членам класса, т.е. приватная переменная доступна только внутри этого класса
    // protected - пакет + наследование
    // package-private - если вы не укажите модификатор доступа, то он будет автоматически указан таким, все в рамках пакета

    protected String atmCompany;
    String atmUser; // default: package-private
    private String atmCardHolderName;
    private long atmCardHolderNumber;
    private long atmCardHolderDebitAccount;

    // Если вы создали класс без КОНСТРУКТОРА
    // Программа во время компиляции создаст ДЕФОЛТНЫЙ КОНСТРУКТОР БЕЗ ПАРАМЕТРОВ
    // Constructor, public + class name

    // Method overload, перегрузка метода
    // Это когда у нас несколько методов с одинаковыми именами, но с разными типами
    // передаваемых данных, или же количество передаваемых данных отличается
    public ATM(){}

    public ATM(String name, String user, String holderName){
        atmCompany = name;
        atmUser = user;
        atmCardHolderName = holderName;
    }

    // Если вы сами создали любой конструктор, тот компилятор ничего не будет больше добавлять
    // Вы обязаны делать все самостоятельно
    public ATM(String name, String user, String holderName, long holderNumber, long debitAccount){
        atmCompany = name;
        atmUser = user;
        atmCardHolderName = holderName;
        atmCardHolderNumber = holderNumber;
        atmCardHolderDebitAccount = debitAccount;
    }

    public String getATMFullInformation(){
        return "ATM Company: " + atmCompany + ".\n" +
                "AMT User: " + atmUser + ".\n" +
                "AMT card holder name: " + atmCardHolderName + ".\n" +
                "AMT card holder number: " + atmCardHolderNumber + ".\n" +
                "ATM card holder debit card account: " + atmCardHolderDebitAccount + ".\n";
    }
}
