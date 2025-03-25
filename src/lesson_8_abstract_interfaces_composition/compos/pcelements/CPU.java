package lesson_8_abstract_interfaces_composition.compos.pcelements;

public class CPU {
    private final String model;
    private final int core;
    private final double hz;

    public CPU(String model, int core, double hz) {
        this.model = model;
        this.core = core;
        this.hz = hz;
    }

    public int getCore() {
        return core;
    }

    @Override
    public String toString() {
        return "CPU:\n" +
                "\t\tModel = " + this.model + "\n" +
                "\t\tCore = " + this.core + "\n" +
                "\t\tHz = " + this.hz;
    }
}