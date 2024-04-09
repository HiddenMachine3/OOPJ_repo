package CO6.extras.q3;

import java.util.ArrayList;
import java.util.List;



public class Zone {
    public static void main(String[] args) {
        OfferZone offerZone = new OfferZone();

        offerZone.addProduct(new Electronics("Laptop", "Dell", 1500.0));
        offerZone.addProduct(new Clothes("T-Shirt", "Nike", 25.0));
        offerZone.addProduct(new Electronics("Smartphone", "Samsung", 800.0));
        offerZone.addProduct(new Clothes("Jeans", "Levi's", 50.0));

        offerZone.showProducts();
    }
}

interface Product {
    String getCategory();
    String getName();
    String getBrand();
    double getPrice();
}

class Electronics implements Product {
    private String category;
    private String name;
    private String brand;
    private double price;

    public Electronics(String name, String brand, double price) {
        this.category = "Electronics";
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String getCategory() {
        return category;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public double getPrice() {
        return price;
    }
}

class Clothes implements Product {
    private String category;
    private String name;
    private String brand;
    private double price;

    public Clothes(String name, String brand, double price) {
        this.category = "Clothes";
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String getCategory() {
        return category;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public double getPrice() {
        return price;
    }
}

class OfferZone {
    private List<Product> products;

    public OfferZone() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void showProducts() {
        for (Product product : products) {
            System.out.println("Category: " + product.getCategory());
            System.out.println("Name: " + product.getName());
            System.out.println("Brand: " + product.getBrand());
            System.out.println("Price: " + product.getPrice());
            System.out.println();
        }
    }
}
