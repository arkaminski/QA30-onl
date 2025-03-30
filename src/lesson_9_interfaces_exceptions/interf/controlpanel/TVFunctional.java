package lesson_9_interfaces_exceptions.interf.controlpanel;

public interface TVFunctional {
    // POST JAVA 8
    // non-classical interface with modern features
    // USUALLY DON'T USE

    // VARIABLES In INTERFACES ARE
    // PUBLIC, STATIC, and FINAL (constants).
    public static final int buttons = 36;

    // by default: public static final + String msg
    String msg = "THIS IS A FUNCTIONAL INTERFACE FOR TV";

    // keyword DEFAULT
    // Позволяет создать метод с встроенной реализацией
    // Что означает, что его НЕОБЯЗАТЕЛЬНО реализовывать в классах
    default String errorMsg(){
        return "This is a DEFAULT message informing you that an ERROR has been found.";
    }

    void turnOnTV();
    void changeChannelUpTV();
    void changeChannelDownTV();
    void increaseSoundTV();
    void decreaseSoundTV();
    void turnOffTV();
    String getInformationTV();
    void callControlPanel();
}