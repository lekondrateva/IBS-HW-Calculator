public class Jellybean extends Sweets {
    private int weight;

    public Jellybean() {
    }

    public Jellybean(String brand, double price, int weight) {
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
        return "Jellybean [" + super.toString() + ", weight = " + weight + "]";
    }
}
