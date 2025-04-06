package HomeWork.HW8.Task3.Documents;

import java.util.Date;

public class Invoice extends AbstractDocuments{
    private double totalAmount;
    private String departmentCode;

    public Invoice(String documentNumber, Date documentDate, double totalAmount, String departmentCode) {
        super(documentNumber, documentDate);
        this.totalAmount = totalAmount;
        this.departmentCode = departmentCode;
    }
    public String getDocumentNumber() {
        return "INV" + documentNumber;
    }

    @Override
    public void printInfo() {
        System.out.println("Invoice:" + "\n" +  "Document number - " + documentNumber +
                ", Document date - " + documentDate +
                ", Summ for month - " + totalAmount +
                ", Department code - " + departmentCode);
    }
}
