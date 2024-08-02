package test10;

public class Clothes implements Product {
    private String name;
    private int price;

    public Clothes(String name, int price) {
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
