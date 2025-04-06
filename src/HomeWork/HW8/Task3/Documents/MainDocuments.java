package HomeWork.HW8.Task3.Documents;

import HomeWork.HW8.Task3.Exceptions.ABCException;
import HomeWork.HW8.Task3.Exceptions.EndException;
import HomeWork.HW8.Task3.Exceptions.StartException;

import java.util.Date;

public class MainDocuments {
    public static void main(String[] args) {
        Registry registry = new Registry();

        try {
            GoodsContract goodsContract = new GoodsContract("ab1234", new Date(), "123", 10);
            ContractEmployee employeeContract = new ContractEmployee("555test", new Date(), 55432, new Date(), "Pupkin");
            Invoice invoice = new Invoice("ends on 1a2v", new Date(), 5000.0, "1231");

            checkDocumentNumber(goodsContract.getDocumentNumber());
            checkDocumentNumber(employeeContract.getDocumentNumber());
            checkDocumentNumber(invoice.getDocumentNumber());

            registry.saveDocument(goodsContract);
            registry.saveDocument(employeeContract);
            registry.saveDocument(invoice);

            for (int i = 0; i < registry.doc.length; i++) {
                if (registry.doc[i] != null) {
                    registry.getDocumentInfo(registry.doc[i]);
                }
            }
        } catch (ABCException | StartException | EndException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    public static void checkDocumentNumber(String documentNumber) throws ABCException, StartException, EndException {
        if (documentNumber.contains("abc")) {
            throw new ABCException("Document number contain 'abc'");
        }

        if (documentNumber.startsWith("555")) {
            throw new StartException("Document number stars with '555'");
        }

        if (documentNumber.endsWith("1a2b")) {
            throw new EndException("Document number ends on '1a2b'");
        }
    }
}
