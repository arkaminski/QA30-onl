package lesson_9_interfaces_exceptions.interf.controlpanel;

public class SamsungControlPanel extends ControlPanel{
    private final int pinCode;

    public SamsungControlPanel(int productionYear, int pinCode) {
        super("Samsung", productionYear);
        this.pinCode = pinCode;
    }


    @Override
    public void turnOnInternet() {
        System.out.println("You have TURNED ON an Internet on your TV.");
    }

    @Override
    public String getInternetInformation() {
        return "Your internet data is the following: ".toUpperCase() + "\n" +
                "Company: MAGTI" + "\n" +
                "Speed: 5GB per Second.";
    }

    @Override
    public boolean validateInternetPinCode(int pinCode) {
        return this.pinCode == pinCode;
    }

    @Override
    public void callControlPanel() {
        System.out.println("This method is COMMON for both Interfaces.");
    }

    @Override
    public void turnOnTV() {
        System.out.println("You have turned on your TV.");
    }

    @Override
    public void changeChannelUpTV() {
        System.out.println("One channel ABOVE.");
    }

    @Override
    public void changeChannelDownTV() {
        System.out.println("One channel BELOW.");
    }

    @Override
    public void increaseSoundTV() {
        System.out.println("You have increased TV sound by ONE.");
    }

    @Override
    public void decreaseSoundTV() {
        System.out.println("You have decreased TV sound by ONE.");
    }

    @Override
    public void turnOffTV() {
        System.out.println("You have turned off your TV. GOODBYE!");
    }

    @Override
    public String getInformationTV() {
        return "Your TV information: \n" +
                "Company: Global TV." + "\n" +
                "Package: Premium.";
    }

    public String getErrorMsg(){
        return TVFunctional.msg;
    }

    public int getButtonsNumber(){
        return TVFunctional.buttons;
    }
}