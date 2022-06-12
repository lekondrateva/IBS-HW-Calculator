public abstract class Sweets {
    private String brand;
    private double price;

    public Sweets() {
    }

    public Sweets(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "brand = " + brand + ", price = " + price;
    }

    public abstract int getWeight();
}
