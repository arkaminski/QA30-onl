package lesson_8_abstract_interfaces_composition;

import lesson_8_abstract_interfaces_composition.abstr.*;
import lesson_8_abstract_interfaces_composition.inher.Animal;
import lesson_8_abstract_interfaces_composition.inher.Lion;
import lesson_8_abstract_interfaces_composition.inher.Turtle;
import lesson_8_abstract_interfaces_composition.inher.Wolf;

// 1. static can be used only with another static
// 2. non-static can use both non and static staff
public class MyMain {
    public static void main(String[] args) {
        createAnimalMammalMonkey();
    }

    public static void createAnimalMammalMonkey(){
        // monkey получит все от AnimalAbstract
        AnimalAbstract monkey =
                new Monkey("Johnny", "Monkey",
                        "Black", 50, "Male", 3, "Human");

        System.out.println(monkey);
        System.out.println(monkey.getAnimalType() + monkey.jump());
        System.out.println(monkey.getAnimalType() + monkey.run());
        System.out.println(monkey.getAnimalType() + monkey.voice());

        // monkeyMammal получит все от AnimalAbstract + Mammal
        Mammal monkeyMammal =
                new Monkey("Johnny", "Monkey",
                        "Black", 50, "Male", 3, "Human");

        System.out.println(monkey);
        System.out.println(monkey.getAnimalType() + monkey.jump());
        System.out.println(monkey.getAnimalType() + monkey.run());
        System.out.println(monkey.getAnimalType() + monkey.voice());
        monkeyMammal.makeDNATest();

        // получит все от AnimalAbstract + Mammal + и если что-то еще специфическое лишь в классе monkey есть
        // он откроет доступ и к этим данным
        Monkey monkeyOnly =
                new Monkey("Johnny", "Monkey",
                        "Black", 50, "Male", 3, "Human");

        System.out.println(monkey);
        System.out.println(monkey.getAnimalType() + monkey.jump());
        System.out.println(monkey.getAnimalType() + monkey.run());
        System.out.println(monkey.getAnimalType() + monkey.voice());

        monkeyOnly.makeDNATest();
        monkeyOnly.getMonkeyMSG();
    }

    public static void createAbstractClasses(){
        AnimalAbstract[] zoo = new AnimalAbstract[]{
                new LionNew("Joshua", "Lion", "Yellow",
                        102.5, "Male", 6),
                new WolfNew("Jennifer", "Wolf", "Grey",
                        51.4, "Female", 2),
                new TurtleNew("Luke", "Turtle", "Green",
                        79.1, "Female", 80),
                new LionNew("Mufasa", "Lion", "Yellow",
                        121, "Male", 10),
                new TurtleNew("Nemo", "Turtle", "Green with Black Dots",
                        99, "Male", 100)
        };

        for (AnimalAbstract el : zoo){
            System.out.println(el);
            System.out.println(el.getAnimalType() + " " + el.voice());
            System.out.println(el.getAnimalType() + " " + el.run());
        }
    }

    public static void createAnimalArray(){
        Animal[] zoo = new Animal[]{
                new Lion("Joshua", "Lion", "Yellow",
                        102.5, "Male", 6),
                new Wolf("Jennifer", "Wolf", "Grey",
                        51.4, "Female", 2),
                new Turtle("Luke", "Turtle", "Green",
                        79.1, "Female", 80),
                new Lion("Mufasa", "Lion", "Yellow",
                        121, "Male", 10),
                new Turtle("Nemo", "Turtle", "Green with Black Dots",
                        99, "Male", 100)
        };

        for (Animal el : zoo){
            System.out.println(el);
            System.out.println(el.getAnimalType() + " " + el.voice());
            System.out.println(el.getAnimalType() + " " + el.run());
        }

        // TO ACCESS STATIC YOU NEED TO CALL THE CLASS FIRST
        System.out.println("\nHow many animals have I created? " + Animal.getAnimalCounter());
    }

    public static void createAnimalInheritance(){
        Animal lion = new Lion("Joshua", "Lion", "Yellow",
                102.5, "Male", 6);

        Animal wolf = new Wolf("Jennifer", "Wolf", "Grey",
                51.4, "Female", 2);

        Animal turtle = new Turtle("Luke", "Turtle", "Green",
                79.1, "Female", 80);

        System.out.println(lion);
        System.out.println(wolf);
        System.out.println(turtle);
    }

    // Неправильная структура
    public static void createAnimal(){
        Animal lion =
                new Animal(
                        "Joshua", "Lion", "Yellow",
                        102.5, "Male", 6);

        System.out.println(lion); // lion == lion.toString() -> но если он не переопределен, то вернет адрес

        Animal wolf =
                new Animal(
                        "Jennifer", "Wolf", "Grey",
                        51.4, "Female", 2);

        System.out.println("\n" + wolf);
    }

    // non-static method
    public void callCreateAnimal(){
        createAnimal();
    }
}