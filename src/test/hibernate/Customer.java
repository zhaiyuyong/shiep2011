package test.hibernate;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;



public class Customer implements Serializable{

	private Integer id;
	private String cname;
	private String bank;
	private String phone;
	private Set<Orders> orders = new HashSet<Orders>();
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Set<Orders> getOrders() {
		return orders;
	}
	public void setOrders(Set<Orders> orders) {
		this.orders = orders;
	}
	
}
