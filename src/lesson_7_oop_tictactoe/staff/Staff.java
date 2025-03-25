package lesson_7_oop_tictactoe.staff;

public class Staff {
    private String name;
    private String surname;
    private String position;
    private int age;
    private int mobileNumber;

    public Staff(String name, String surname, String position, int age, int mobileNumber){
        this.name = name;
        this.surname = surname;
        this.position = position;
        this.age = age;
        this.mobileNumber = mobileNumber;
    }

    public void speakStaff(){
        System.out.println(this.position + " say something!");
    }

    @Override
    public String toString() {
        return "Name: " + this.name + ".\n" +
                "Surname: " + this.surname + ".\n" +
                "Position: " + this.position + ".\n" +
                "Age: " + this.age + ".\n" +
                "Mobile phone number: " + this.mobileNumber + ".\n";
    }
}