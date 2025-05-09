// Lớp InventoryManager
public class InventoryManager {
    private final InventoryLogger logger;  // Đối tượng logger để ghi log

    // Constructor với tham số InventoryLogger
    public InventoryManager(InventoryLogger logger) {
        this.logger = logger;
    }

    // Phương thức cập nhật số lượng sản phẩm và ghi log sự thay đổi
    public void updateInventory(Product product, int amount) {
        product.addQuantity(amount);  // Cập nhật số lượng sản phẩm
        logger.logInventoryChange(product);  // Ghi lại log thay đổi
    }
}
