package lesson_8_abstract_interfaces_composition.abstr;

public class LionNew extends AnimalAbstract {
    public LionNew(String animalName, String animalType, String animalColor,
                   double animalWeight, String animalSex, int animalAge) {
        super(animalName, animalType, animalColor, animalWeight, animalSex, animalAge);
    }

    @Override
    public String run() {
        return "30 KM per HOUR.";
    }

    @Override
    public String jump() {
        return "JUMPS";
    }

    @Override
    public String voice() {
        return "ROARS!";
    }
}