package lesson_8_abstract_interfaces_composition.compos.pcelements;

public class Baseboard {
    private final String model;
    private final String additional;

    public Baseboard(String model, String additional) {
        this.model = model;
        this.additional = additional;
    }

    @Override
    public String toString() {
        return "Baseboard:\n" +
                "\t\tModel = " + this.model + "\n" +
                "\t\tAdditional = " + this.additional;
    }
}