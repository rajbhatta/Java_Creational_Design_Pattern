package raj.design.pattern.model;

import raj.design.pattern.util.ElectronicDelivery;

public class Order 
{
	private String customerName;
	private String address;
	
	public Order()
	{
		super();
	}
	
	public Order(String customerName, String address) {
		super();
		this.customerName = customerName;
		this.address = address;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
