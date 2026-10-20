public class PhysicalProduct implements Product, Physical {
    private String name;
    private double price;
    private double weight;

    public PhysicalProduct(String name, double price, double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getType() {
        return "physical";
    }

    @Override
    public double getWeight() {
        return weight;
    }
}
