public class BookProduct implements Physical, Product {
    private String name;
    private double price;
    private double weight;

    public BookProduct(String name, double price) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }
    
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    
    public double getWeight(){
        return weight;
    }

}
