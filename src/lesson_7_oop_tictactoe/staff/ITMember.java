package lesson_7_oop_tictactoe.staff;

public class ITMember extends Staff{
    public ITMember(String name, String surname, String position, int age, int mobileNumber) {
        // Ключевое слово super ДОЛЖЕН ВСЕГДА БЫТЬ ПЕРВОЙ СТРОЧКОЙ В ДЕЧЕРНЕМ КЛАССЕ, ЕСЛИ МЫ НАСЛЕДУЕМСЯ
        // ОНО передает все параметры в супер класс
        super(name, surname, position, age, mobileNumber);

        System.out.println("IT Member was created!");
    }

    // Полиморфизм - означает способность дочерних объектов
    // переопределять поведение методов, которые они получили от родительского класса
    // Этот объект автоматом получил метод getFullInformation со своей дефолтной реализацией
    // Я хочу поменять и чтобы для всех экземпляров класса ITMember была своя реализация
    @Override
    public void speakStaff(){
        System.out.println("IT says CODEEE!");
    }

    public void sayHello(){
        // JUST FOR IT MEMBERS
    }
}