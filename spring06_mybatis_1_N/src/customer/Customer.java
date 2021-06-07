package customer;

import java.util.List;

import order.Order;

//�����ͺ��̽��� ����ִ� ���� �����ؼ� �ϳ��� ��ü�ȿ� �� �־��
public class Customer {
	private int id;
	private String name;
	private List<Order> orderList;
	
	public Customer() {
		super();
	}
	
	public Customer(int id, String name, List<Order> orderList) {
		super();
		this.id = id;
		this.name = name;
		this.orderList = orderList;
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
	public List<Order> getOrderList() {
		return orderList;
	}
	public void setOrderList(List<Order> orderList) {
		this.orderList = orderList;
	}
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + "]";
	}
}
