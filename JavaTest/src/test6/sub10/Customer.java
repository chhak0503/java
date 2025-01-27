package test6.sub10;

public class Customer {
    private String uid;
    private String name;
    private String hp;

    public Customer(String uid, String name, String hp) {
        this.uid = uid;
        this.name = name;
        this.hp = hp;
    }

    public String getUid() {
        return uid;
    }

    public String getName() {
        return name;
    }
    
    public String getHp() {
		return hp;
	}
}