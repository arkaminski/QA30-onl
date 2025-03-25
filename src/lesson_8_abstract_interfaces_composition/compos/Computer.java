package lesson_8_abstract_interfaces_composition.compos;

// package.*; -> взять все классы и добавить в документ
import lesson_8_abstract_interfaces_composition.compos.pcelements.*;

// Композиция
public class Computer {
    private final Adapter adapter;
    private final Baseboard baseboard;
    private final CPU cpu;
    private final HDD hdd;
    private final RAM ram;
    private final VGA vga;

    private final String[] additionalParts;

    public Computer(Adapter adapter, Baseboard baseboard, CPU cpu, HDD hdd, RAM ram, VGA vga, String[] additionalParts) {
        this.adapter = adapter;
        this.baseboard = baseboard;
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.vga = vga;
        this.additionalParts = additionalParts;
    }

    public CPU getCpu() {
        return cpu;
    }

    private String getAdditionalParts() {
        String value = "";

        for (String additionalPart : this.additionalParts) {
            value += additionalPart + "\n";
        }

        return value;
    }

    @Override
    public String toString() {
        return "My computer consists from:\n" +
                "\t" + this.adapter + "\n" +
                "\t" + this.baseboard + "\n" +
                "\t" + this.cpu + "\n" +
                "\t" + this.hdd + "\n" +
                "\t" + this.ram + "\n" +
                "\t" + this.vga + "\n" +
                "\tAdditional parts are: \n" + "\t\t" + getAdditionalParts();
    }
}