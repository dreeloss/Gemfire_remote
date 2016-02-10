package model;

import java.io.Serializable;

public class SecurityPrice implements Serializable{

	private static final long serialVersionUID = 3921222662744185904L;
	double price;
	String Sec_ID;
	public SecurityPrice(String sec_ID, double price) {
		super();
		this.price = price;
		Sec_ID = sec_ID;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getSec_ID() {
		return Sec_ID;
	}
	public void setSec_ID(String sec_ID) {
		Sec_ID = sec_ID;
	}
	
	
	
}
