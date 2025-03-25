package lesson_8_abstract_interfaces_composition.inher;

public class Wolf extends Animal{
    public Wolf(String animalName, String animalType, String animalColor,
                double animalWeight, String animalSex, int animalAge) {
        super(animalName, animalType, animalColor, animalWeight, animalSex, animalAge);
    }

    @Override
    public String run() {
        return "41 KM per HOUR.";
    }

    @Override
    public String voice() {
        return "WOOO!";
    }
}