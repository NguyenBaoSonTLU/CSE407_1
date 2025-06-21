// ConcreteProductFactory.java
public class ConcreteProductFactory extends ProductFactory {
    @Override
    public Product createProduct(String productId, int quantity) {
        return new ConcreteProduct(productId, quantity);
    }
}