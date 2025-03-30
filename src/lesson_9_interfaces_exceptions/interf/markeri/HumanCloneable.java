package lesson_9_interfaces_exceptions.interf.markeri;

// Serializable -> просто говорит, что ты отныне можешь хранить объекты
public class HumanCloneable implements Cloneable{
    private String name;
    private final String surname;
    private final int age;
    private final String occupation;

    public HumanCloneable(String name, String surname, int age, String occupation) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.occupation = occupation;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Human: \n" +
                "\tName = " + this.name + "\n" +
                "\tSurname = " + this.surname + "\n" +
                "\tAge = " + this.age + "\n" +
                "\tOccupation='" + this.occupation;
    }

    @Override
    public HumanCloneable clone() {
        try {
            HumanCloneable clone = (HumanCloneable) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}