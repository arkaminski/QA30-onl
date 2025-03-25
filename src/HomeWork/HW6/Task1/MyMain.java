package HomeWork.HW6.Task1;


public class MyMain {
    public static void main(String[] args) {
            task1();
    }

            public static void task1(){
            CreditCard firstCard = new CreditCard(1111_2222_3333_4444l, 500);
            CreditCard secondCard = new CreditCard(6666_7777_8888_9999l, 1500);
            CreditCard thirdCard = new CreditCard(1212_2323_3434_4545l, 2000);

            firstCard.depositToBalance(300);
            secondCard.depositToBalance(400);
            thirdCard.withdrawFromBalance(500);


            firstCard.allInfo();
            secondCard.allInfo();
            thirdCard.allInfo();
            System.out.println("*******************************************");


    }
}
