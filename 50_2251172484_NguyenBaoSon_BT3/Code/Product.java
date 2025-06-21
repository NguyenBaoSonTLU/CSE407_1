// Product.java
public abstract class Product {
    protected final String productId;
    protected int quantity;

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