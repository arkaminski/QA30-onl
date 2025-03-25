package lesson_8_abstract_interfaces_composition.abstr;

public class WolfNew extends AnimalAbstract {

    public WolfNew(String animalName, String animalType, String animalColor, double animalWeight, String animalSex, int animalAge) {
        super(animalName, animalType, animalColor, animalWeight, animalSex, animalAge);
    }

    @Override
    public String run() {
        return "41 KM per HOUR.";
    }

    @Override
    public String jump() {
        return "JUMPS";
    }

    @Override
    public String voice() {
        return "WOOO!";
    }
}