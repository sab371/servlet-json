package pack;

public class employee {
	private String name;
	private int id;
	private long mobileno;
	
	public employee(int id, String name, long mobileno) {
		super();
		this.name = name;
		this.id = id;
		this.mobileno = mobileno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getMobileno() {
		return mobileno;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	
}
