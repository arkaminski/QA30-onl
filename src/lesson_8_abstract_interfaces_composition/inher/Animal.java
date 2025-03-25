package lesson_8_abstract_interfaces_composition.inher;

// Наследование - это отношение типа ЯВЛЯЕТСЯ
// Волк ЯВЛЯЕТСЯ животным
// Лев ЯВЛЯЕТСЯ животным

// КОНСТАНТНЫЕ ЗНАЧЕНИЯ
// ЗНАЧЕНИЯ, КОТОРЫЕ НЕ МЕНЯТСЯ - это или само ЗНАЧНИЕ (10, "Слово") или же не могут поменять
// адрес на который они указывают, keyword: final
public class Animal {
    private final String animalName;
    private final String animalType;
    private final String animalColor;
    private final double animalWeight;
    private final String animalSex;
    private final int animalAge;

    // BELONGS TO A CLASS, IT IS SHARED BY ALL INSTANCES OF THE CLASS
    private static int animalCounter;

    public Animal(String animalName, String animalType, String animalColor, double animalWeight,
                  String animalSex, int animalAge) {
        this.animalName = animalName;
        this.animalType = animalType;
        this.animalColor = animalColor;
        this.animalWeight = animalWeight;
        this.animalSex = animalSex;
        this.animalAge = animalAge;
        animalCounter++;
    }

    public String run() {
        return "The animal can run".toUpperCase();
    }

    public String voice(){
        return "The animal can make a voice".toUpperCase();
    }

    public String getAnimalType() {
        return animalType;
    }

    public static int getAnimalCounter() {
        return animalCounter;
    }

    // объявляя этот метод final, его нельзя переопределить в других классах
    public final void notToInherit(){
        System.out.println("This method shouldn't be overridden. It must be only GENERAL for everyone.");
    }

    @Override
    public String toString() {
        return "Animal:\n" +
                "\tName = " + this.animalName + "\n" +
                "\tType = " + this.animalType + "\n" +
                "\tColor = " + this.animalColor + "\n" +
                "\tWeight = " + this.animalWeight + "\n" +
                "\tSex = " + this.animalSex + "\n" +
                "\tAge = " + this.animalAge;
    }
}