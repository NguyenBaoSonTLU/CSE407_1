// InventoryManager.java
public class InventoryManager {
    private final InventoryLogger logger;

    public InventoryManager(InventoryLogger logger) {
        this.logger = logger;
    }

    public void updateInventory(Product product, int amount) {
        product.addQuantity(amount);
        logger.logInventoryChange(product);
    }
}