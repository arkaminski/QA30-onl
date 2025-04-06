package HomeWork.HW8.Task3.Documents;

import java.util.Date;
public abstract class AbstractDocuments implements Documents {
    protected String documentNumber;
    protected Date documentDate;

    public AbstractDocuments(String documentNumber, Date documentDate) {
        this.documentNumber = documentNumber;
        this.documentDate = documentDate;
    }
}
