public abstract class Sweets {
    private String brand;
    private double price;
    private int weight;

    public Sweets() {
    }

    public Sweets(String brand, double price, int weight) {
        this.brand = brand;
        this.price = price;
        this.weight = weight;
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

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "brand = " + brand + ", price = " + price + ", weight = " + weight;
    }
}
