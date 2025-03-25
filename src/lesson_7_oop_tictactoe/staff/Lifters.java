package lesson_7_oop_tictactoe.staff;

// Наследование происходит через ключевое слово extends
// Наследовать можно лишь КЛАССЫ
// И можно унаследовать лишь один класс
// JAVA не позволяет множественное наследование
public class Lifters extends Staff{
    public Lifters(String name, String surname, String position, int age, int mobileNumber) {
        super(name, surname, position, age, mobileNumber);

        System.out.println("Liferts CREATED!");
    }

    @Override
    public void speakStaff(){
        System.out.println("LIFTERS say WE ARE BUSY!");
    }
}