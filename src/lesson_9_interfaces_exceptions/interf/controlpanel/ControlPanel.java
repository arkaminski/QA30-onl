package lesson_9_interfaces_exceptions.interf.controlpanel;

public abstract class ControlPanel implements InternetFunctional, TVFunctional{
    // Internet functions
    // TV functions
    private final String company;
    private final int productionYear;

    protected ControlPanel(String company, int productionYear) {
        this.company = company;
        this.productionYear = productionYear;
    }

    @Override
    public String toString() {
        return "Control panel data: \n" +
                "\tCompany = " + this.company + "\n" +
                "\tProduction year = " + this.productionYear;
    }
}
