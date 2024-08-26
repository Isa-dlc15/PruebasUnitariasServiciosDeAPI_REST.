package Service;

import java.util.Optional;

public class ProductService {

    private final ProductRepository productRepository;

    // Constructor que inyecta el repositorio
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    // Método para buscar un producto por su ID
    public Product findProductById(String id) {
        Optional<Product> product = productRepository.findById(id);
        return product.orElse(null); // Retorna el producto si se encuentra, de lo contrario retorna null
    }

    // Método para crear un nuevo producto
    public Product createProduct(Product product) {
        return productRepository.save(product); // Guarda el producto y lo retorna
    }
}
