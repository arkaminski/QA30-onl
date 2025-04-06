package HomeWork.HW8.Task3.Documents;

import java.util.Date;

public class ContractEmployee extends AbstractDocuments{
    private int employeeID;
    private Date contractEndDate;
    private String employeeName;

    public ContractEmployee(String documentNumber, Date documentDate, int employeeID, Date contractEndDate, String employeeName) {
        super(documentNumber, documentDate);
        this.employeeID = employeeID;
        this.contractEndDate = contractEndDate;
        this.employeeName = employeeName;
    }
    public String getDocumentNumber() {
        return "EC" + documentNumber;
    }

    @Override
    public void printInfo() {
        System.out.println("Contract of Employee:" + "\n" +  "Document Number - " + documentNumber +
                ", Document date - " + documentDate +
                ", ID of Employee - " + employeeID +
                ", Contract End date - " + contractEndDate +
                ", Employee name - " + employeeName);
    }

}
