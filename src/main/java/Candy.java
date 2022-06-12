public class Candy extends Sweets {
    private int weight;

    public Candy() {
    }

    public Candy(String brand, double price, int weight) {
        super(brand, price);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Candy [" + super.toString() + ", weight = " + weight + "]";
    }
}
