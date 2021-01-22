package Assignment4;

public class Q3Employee implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private String name,id;
	Q3Address address= new Q3Address();
	private transient double salary;
	
	public Q3Employee() {
		
	}

	public Q3Employee(String name, String id, String address,double salary) {
		super();
		this.name = name;
		this.id = id;
		this.address.setUserAddress(address); 
		this.salary=salary;
	}

	public void display() {
		System.out.println("Name: "+this.name);
		System.out.println("ID: "+this.id);
		System.out.print("Address ");
		this.address.printAddress();
		System.out.println("Sallary: "+this.salary);
	}

	@Override
	public String toString() {
		return "Q3Employee [name=" + name + ", id=" + id + ", address=" + address.getUserAddress() + ", salary=" + salary + "]";
	}
	
	
	
	
	
}
