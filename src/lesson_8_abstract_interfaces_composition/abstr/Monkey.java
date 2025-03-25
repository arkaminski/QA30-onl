package lesson_8_abstract_interfaces_composition.abstr;

public class Monkey extends Mammal{
    public Monkey(String animalName, String animalType, String animalColor,
                  double animalWeight, String animalSex, int animalAge, String dna) {
        super(animalName, animalType, animalColor, animalWeight, animalSex, animalAge, dna);
    }

    @Override
    public String run() {
        return "runs in a very funny way.";
    }

    @Override
    public String jump() {
        return "barely jumps.";
    }

    @Override
    public String voice() {
        return "makes UAAAA-UAAA noise!";
    }

    @Override
    public String makeDNATest() {
        return "According to a DNA test monkeys are very close to HUMANS!";
    }

    public void getMonkeyMSG(){
        System.out.println("This message is only available for instances created on MONKEY CLASS!");
    }
}