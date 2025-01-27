package test6.sub10;

public class Electronics implements Product {
    private String name;
    private int price;

    public Electronics(String name, int price) {
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