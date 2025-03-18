package lesson_6_objects_game.introobjects;

// Мы не называем КЛАССЫ ОБЪЕКТАМИ
// МЫ называем их ЭКЗЕМПЛЯРАМИ
public class Bank {
    // Поля класса
    // Поле класса это переменная уровня класс, которая доступно всем внутренностям этого же класса
    // На уровне класса, компилятор самостоятельно задаст дефолтные значения всем базовым типам и в том числе String
    public String bankName; // null
    public String bankAddress;
    public int staffAmount; // 0
    public long creditsGiven; // 0L
    public long creditCardMoney;
    public long creditCardNumber;

    public void withdrawMoneyFromAccount(long value){
        if (value > creditCardMoney){
            System.out.println("You don't have enough money on the account. Your balance is: " + creditCardMoney);
            System.out.println("You wanted to withdraw: " + value);
        } else {
            creditCardMoney -= value;
            System.out.println("You have withdrawn this amount of money: " + value +
                    ". Your balance is: " + creditCardMoney);
        }
    }

    public void getBankInfo(){
        System.out.println("Bank name is: " + bankName);
        System.out.println("Bank address is: " + bankAddress);
        System.out.println("Bank has the following number of staff: " + staffAmount);
        System.out.println("Bank has given the following amount of credits: " + creditsGiven);
        System.out.println("Bank has the following amount of money: " + creditCardMoney);
        System.out.println("Bank card number is: " + creditCardNumber);
    }
}