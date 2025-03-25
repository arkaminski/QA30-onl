package lesson_8_abstract_interfaces_composition.compos.pcelements;

public class RAM {
    private final String model;
    private final String type;
    private final int size;

    public RAM(String model, String type, int size) {
        this.model = model;
        this.type = type;
        this.size = size;
    }

    @Override
    public String toString() {
        return "RAM:\n" +
                "\t\tModel = " + this.model + "\n" +
                "\t\tType = " + this.type + "\n" +
                "\t\tSize = " + this.size;
    }
}