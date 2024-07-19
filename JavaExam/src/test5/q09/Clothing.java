package test4.q09;

public class Clothing implements Product {
    private String name;
    private int price;

    public Clothing(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
