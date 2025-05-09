// InventoryLogger.java
public class InventoryLogger {
    public void logInventoryChange(Product product) {
        System.out.println("San pham " + product.getProductId() +
                           " co so luong: " + product.getQuantity());
    }
}