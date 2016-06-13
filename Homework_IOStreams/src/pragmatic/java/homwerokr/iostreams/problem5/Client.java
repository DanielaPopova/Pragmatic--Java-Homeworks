package pragmatic.java.homwerokr.iostreams.problem5;

import java.io.Serializable;

public class Client implements Serializable{
	
	private String accountNumber;
	private String fullName;
	private long id;
	private String phone;
	private String email;
	private String address;
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return (getFullName() + " => " + "ID: " + getId() +"; " + " Acount Number: " + getAccountNumber() + "; " + " Address: " + getAddress() + "; " +
				" Phone: " + getPhone() + "; " +  " Email: " + getEmail());
	}
}
