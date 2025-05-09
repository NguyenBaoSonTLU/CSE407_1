// Product.java
public class Product {
    private final String productId;
    private int quantity;
    public Product(String productId, int quantity) {
        this.productId = productId;
        this.quantity = quantity;
    }
    public String getProductId() {
        return productId;
    }
    public int getQuantity() {
        return quantity;
    }
    public void addQuantity(int amount) {
        this.quantity += amount;
    }
}