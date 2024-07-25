package sub2;

public class Person {

	private String id;
	private String name;	
	private int age;
	private String hp;
	
	public Person(String id, String name, int age, String hp) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.hp = hp;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}
	
	
	
}
