package lesson_8_abstract_interfaces_composition.compos.pcelements;

public class HDD {
    private final String model;
    private final String type;
    private final double capacity;

    public HDD(String model, String type, double capacity) {
        this.model = model;
        this.type = type;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "HDD:\n" +
                "\t\tModel = " + this.model + "\n" +
                "\t\tType = " + this.type + "\n" +
                "\t\tCapacity = " + this.capacity;
    }
}