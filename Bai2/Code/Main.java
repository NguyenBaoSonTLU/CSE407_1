public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng logger để ghi log
        InventoryLogger logger = new InventoryLogger();

        // Tạo đối tượng manager và truyền đối tượng logger vào
        InventoryManager manager = new InventoryManager(logger);

        // Tạo một sản phẩm với mã sản phẩm và số lượng ban đầu
        Product product = new Product("SP001", 10);

        // In thông tin sản phẩm trước khi cập nhật
        System.out.println("Truoc khi cap nhat:");
        System.out.println("San pham " + product.getProductId() + " co so luong: " + product.getQuantity());

        // Cập nhật số lượng sản phẩm và ghi log
        manager.updateInventory(product, 5);  // Thêm 5 sản phẩm
        manager.updateInventory(product, -3); // Giảm đi 3 sản phẩm
    }
}
