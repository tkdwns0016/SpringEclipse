package mapper;

import org.apache.ibatis.annotations.Mapper;

import customer.Customer;
import order.Order;

@Mapper
public interface CustomerWithOrders {
	public Customer selectCustomerWithOrders(int id);
	
	
	public int insertOrder(Order order);


	public int deleteCustomer(int id);


	public int deleteOrdersWithCustomerId(int customerId);
}
