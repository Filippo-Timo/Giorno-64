package filippotimo.entities;

import java.util.Random;

public class Product {
    Random randomNumber = new Random();

    private long id = randomNumber.nextLong(10000, 20000);
    private String name;
    private String category;
    private double price = randomNumber.nextDouble(1.00, 200.00);

    public Product(String name, String category) {
        this.name = name;
        this.category = category;
        price = Math.floor(price * 100) / 100;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }
}
