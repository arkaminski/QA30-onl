package lesson_8_abstract_interfaces_composition.inher;

// Если я хочу запретить наследовать КЛАСС TURTLE, можно его сделать final
// Теперь, класс Черепаха нельзя унаследовать
public final class Turtle extends Animal{
    public Turtle(String animalName, String animalType, String animalColor,
                  double animalWeight, String animalSex, int animalAge) {
        super(animalName, animalType, animalColor, animalWeight, animalSex, animalAge);
    }

    @Override
    public String run() {
        return "VERY SLOW!";
    }

    @Override
    public String voice() {
        return "SSSSS!";
    }
}