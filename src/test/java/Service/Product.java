package Service;

public class Product {
    private String id;
    private String name;
    private double price;

    // Constructor
    public Product(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Método para obtener el nombre del producto
    public String getName() {
        return name;
    }

    // Método para obtener el ID del producto
    public String getId() {
        return id;
    }

    // Otros posibles métodos, como getPrice() o setters, pueden agregarse según sea necesario
}
