public class Jellybean extends Sweets {
    private String taste;

    public Jellybean() {
    }

    public Jellybean(String brand, double price, int weight, String taste) {
        super(brand, price, weight);
        this.taste = taste;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    @Override
    public String toString() {
        return "Jellybean [" + super.toString() + ", taste = " + taste + "]";
    }
}
