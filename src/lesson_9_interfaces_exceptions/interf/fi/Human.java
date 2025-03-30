package lesson_9_interfaces_exceptions.interf.fi;

public class Human implements MyFunctionalInterface{
    private String name;
    private final String surname;
    private final int age;
    private final String occupation;

    public Human(String name, String surname, int age, String occupation) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.occupation = occupation;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Human copyObject(Human human) {
        return new Human(human.name, human.surname, human.age, human.occupation);
    }

    @Override
    public String toString() {
        return "Human: \n" +
                "\tName = " + this.name + "\n" +
                "\tSurname = " + this.surname + "\n" +
                "\tAge = " + this.age + "\n" +
                "\tOccupation='" + this.occupation;
    }
}