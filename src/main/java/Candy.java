public class Candy extends Sweets {
    private String country;

    public Candy() {
    }

    public Candy(String brand, double price, int weight, String country) {
        super(brand, price, weight);
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Candy [" + super.toString() + ", country = " + country + "]";
    }
}
