package ex1;

public class Player {

	private int id;
	private String name;
	private int age;
	private long contact;
	
	public Player() {
		// TODO Auto-generated constructor stub
	}

	public Player(int id, String name, int age, long contact) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.contact = contact;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", age=" + age + ", contact=" + contact + "]";
	}
	
//	@Override
//	public String toString() {
//		return "Hello "+name;
//	}
	
	
}
