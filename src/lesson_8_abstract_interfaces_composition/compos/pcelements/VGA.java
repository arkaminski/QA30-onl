package lesson_8_abstract_interfaces_composition.compos.pcelements;

public class VGA {
    private final String model;
    private final double memory;

    public VGA(String model, double memory) {
        this.model = model;
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "VGA:\n" +
                "\t\tModel = " + this.model + "\n" +
                "\t\tMemory = " + this.memory;
    }
}