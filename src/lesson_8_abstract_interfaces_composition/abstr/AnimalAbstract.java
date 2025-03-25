package lesson_8_abstract_interfaces_composition.abstr;

// abstract - говорит классу, что он всего лишь набросок
// Он не может создавать экземпляр класса самого себя
// На его основе надо создавать точные классы
public abstract class AnimalAbstract {
    private final String animalName;
    private final String animalType;
    private final String animalColor;
    private final double animalWeight;
    private final String animalSex;
    private final int animalAge;

    private static int animalCounter;

    public AnimalAbstract(String animalName, String animalType, String animalColor, double animalWeight,
                          String animalSex, int animalAge) {
        this.animalName = animalName;
        this.animalType = animalType;
        this.animalColor = animalColor;
        this.animalWeight = animalWeight;
        this.animalSex = animalSex;
        this.animalAge = animalAge;
        animalCounter++;
    }

    // Абстрактный метод может быть создан лишь в абстрактом классе
    // и он говорит: у абстрактного класса не должно быть своей реализации метода
    // передавай обязательства по реализации метода дочерним классам
    public abstract String run();
    public abstract String jump();
    public abstract String voice();

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
