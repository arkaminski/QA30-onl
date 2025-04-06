package HomeWork.HW8.Task3.Documents;

import java.util.Date;

public class GoodsContract extends AbstractDocuments{
    private String goodsType;
    private int goodsQuantity;

    public GoodsContract(String documentNumber, Date documentDate, String goodsType, int goodsQuantity) {
        super(documentNumber, documentDate);
        this.goodsType = goodsType;
        this.goodsQuantity = goodsQuantity;
    }
    public String getDocumentNumber() {
        return "GC" + documentNumber;
    }

    @Override
    public void printInfo() {
        System.out.println("Contract for the supply of goods:" + "\n" +  "Document number - " + documentNumber +
                ", Document date - " + documentDate +
                ", Type of goods - " + goodsType +
                ", Quantity of goods - " + goodsQuantity);
    }
}
