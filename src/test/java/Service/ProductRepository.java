package Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class ProductRepository {

    // Simulación de la base de datos usando un mapa
    private Map<String, Product> database = new HashMap<>();

    // Encuentra un producto por su ID
    public Optional<Product> findById(String id) {
        return Optional.ofNullable(database.get(id));
    }

    // Guarda un producto en la base de datos
    public Product save(Product product) {
        database.put(product.getId(), product);
        return product;
    }
}
