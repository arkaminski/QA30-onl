package lesson_7_oop_tictactoe.atm;

public class ATMEncapsulation {
    private String atmCompany;
    private String atmUser; // default: package-private
    private String atmCardHolderName;
    private long atmCardHolderNumber;
    private long atmCardHolderDebitAccount;

    // Если вы сами создали любой конструктор, тот компилятор ничего не будет больше добавлять
    // Вы обязаны делать все самостоятельно

    public ATMEncapsulation(){}

    public ATMEncapsulation(String name, String user, String holderName){
        atmCompany = name;
        atmUser = user;
        atmCardHolderName = holderName;
    }

    public ATMEncapsulation(String name, String user, String holderName, long holderNumber, long debitAccount){
        atmCompany = name;
        atmUser = user;
        atmCardHolderName = holderName;
        atmCardHolderNumber = holderNumber;
        atmCardHolderDebitAccount = debitAccount;
    }

    // Для работы с полями объекта используются специальные методы
    // Для просто взятия данных - геттеры (get)
    // Для задания новых данных - сеттеры (set)

    // getter для считывания закрытой переменной atmCardHolderDebitAccount
    public long getAtmCardHolderDebitAccount(){
        return atmCardHolderDebitAccount;
    }

    public void setAtmCardHolderDebitAccount(long value){
        atmCardHolderDebitAccount = value;
    }

    private void makeTransaction(){
        // ONLY FOR INTERNAL USE
    }

    public String getATMFullInformation(){
        return "ATM Company: " + atmCompany + ".\n" +
                "AMT User: " + atmUser + ".\n" +
                "AMT card holder name: " + atmCardHolderName + ".\n" +
                "AMT card holder number: " + atmCardHolderNumber + ".\n" +
                "ATM card holder debit card account: " + atmCardHolderDebitAccount + ".\n";
    }
}