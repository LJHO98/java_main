package unmanned_cafe;

public class Member {
	private String name;
	private String contact;
	
	public Member(String name, String contatct) {
		this.name = name;
		this.contact = contatct;
	}
	
	@Override 
	public String toString() {
		return name + ", " + contact;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	
	
}
