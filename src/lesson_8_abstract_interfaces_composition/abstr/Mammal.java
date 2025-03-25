package lesson_8_abstract_interfaces_composition.abstr;

public abstract class Mammal extends AnimalAbstract{
    private final String dna;

    public Mammal(String animalName, String animalType, String animalColor, double
            animalWeight, String animalSex, int animalAge, String dna) {
        super(animalName, animalType, animalColor, animalWeight, animalSex, animalAge);
        this.dna = dna;
    }

    public abstract String makeDNATest();
}