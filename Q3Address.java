package Assignment4;

public class Q3Address implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private String userAddress; 
	
	public Q3Address() {

	}


	public Q3Address(String userAddress) {
		this.userAddress = userAddress;
	}


	public void printAddress() {
		System.out.println("Address: "+this.userAddress);
	}


	public String getUserAddress() {
		return userAddress;
	}


	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	
	
	
	
	
}
