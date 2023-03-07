
public class Product {
    private int ProdId;
    private String ProdName;

    Product(int id, String name)  {
        ProdId = id;
        ProdName = name;
    }
    public String toString()  {
        return ProdId + ": " + ProdName;
    }
    public int getProdId()  {
        return ProdId;
    }

    public void setProdId(int prodId) {
        ProdId = prodId;
    }
    public String getProdName()  {
        return ProdName;
    }
    public void setProdName(String prodName)  {
        ProdName = prodName;
    }

}
