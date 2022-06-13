public class Cake extends Sweets {
    private int ccal;

    public Cake() {
    }

    public Cake(String brand, double price, int weight, int ccal) {
        super(brand, price, weight);
        this.ccal = ccal;
    }

    public int getCcal() {
        return ccal;
    }

    public void setCcal(int ccal) {
        this.ccal = ccal;
    }

    @Override
    public String toString() {
        return "Cake [" + super.toString() + ", ccal = " + ccal + "]";
    }
}
