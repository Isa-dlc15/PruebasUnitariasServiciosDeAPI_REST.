package Service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Optional;

public class ProductServiceTest {

    @Mock
    private ProductRepository productRepository;

    @InjectMocks
    private ProductService productService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testFindProductById() {
        // Arrange
        Product product = new Product("123", "Test Product", 100.0);
        when(productRepository.findById("123")).thenReturn(Optional.of(product));

        // Act
        Product result = productService.findProductById("123");

        // Assert
        assertNotNull(result);
        assertEquals("Test Product", result.getName());
        verify(productRepository, times(1)).findById("123");
    }

    @Test
    public void testCreateProduct() {
        // Arrange
        Product product = new Product("123", "New Product", 200.0);
        when(productRepository.save(product)).thenReturn(product);

        // Act
        Product result = productService.createProduct(product);

        // Assert
        assertNotNull(result);
        assertEquals("New Product", result.getName());
        verify(productRepository, times(1)).save(product);
    }

}

