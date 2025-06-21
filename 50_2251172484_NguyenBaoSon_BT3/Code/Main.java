// Main.java
public class Main {
    public static void main(String[] args) {
        // Tạo factory
        ProductFactory factory = new ConcreteProductFactory();

        // Tạo đối tượng logger
        InventoryLogger logger = new InventoryLogger();

        // Tạo đối tượng manager
        InventoryManager manager = new InventoryManager(logger);

        // Tạo sản phẩm bằng factory
        Product product = factory.createProduct("SP001", 10);

        // In thông tin sản phẩm trước khi cập nhật
        System.out.println("Truoc khi cap nhat:");
        System.out.println("San pham " + product.getProductId() + " co so luong: " + product.getQuantity());

        // Cập nhật số lượng sản phẩm và ghi log
        manager.updateInventory(product, 5);  // Thêm 5 sản phẩm
        manager.updateInventory(product, -3); // Giảm đi 3 sản phẩm
    }
}