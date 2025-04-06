package HomeWork.HW8.Task3.Documents;

public class Registry {
    Documents[] doc = new Documents[10];
    private int count = 0;

    public void saveDocument(Documents documents) {
        if (count < 10) {
            doc[count] = documents;
            count++;
        } else {
            System.out.println("Registry is full. It is not possible to add new document.");
        }
    }

    public void getDocumentInfo(Documents document) {
        document.printInfo();
    }
}
