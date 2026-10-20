public class DigitalProduct implements Product {
    private String name;
    private double price;

    public DigitalProduct(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override 
    public String getName() {
        return name; 
    }

    @Override 
    public double getPrice() {
        return price;
    }

    public String getType() {
        return "digital";
    }
}

