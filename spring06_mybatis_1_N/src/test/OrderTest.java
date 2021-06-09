package test;

import static org.junit.Assert.*;

import java.time.LocalDateTime;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import customer.Customer;
import mapper.CustomerWithOrders;
import order.Order;
import service.CustomerService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:config/springContext.xml")
public class OrderTest {

	@Autowired
	CustomerWithOrders customerWithOrders;
	
	@Autowired
	CustomerService customerService;
	
	@Ignore
	@Test
	public void test() {
//		assertNotNull(customerWithOrders);
		Customer c = customerWithOrders.selectCustomerWithOrders(3);
		System.out.println(c.getId());
		System.out.println(c.getName());
		System.out.println("-----주문 내역-----");
		for(Order o : c.getOrderList()) {
			System.out.println(o.getId());
			System.out.println(o.getName());
			System.out.println(o.getOrderDatetime());
			System.out.println("---------------");
		}
	}
	
	@Ignore
	@Test
	public void insertTest() {
		Order order = new Order(0, 2, "과자", LocalDateTime.now());
		
		int affectedRow = customerWithOrders.insertOrder(order);
		System.out.println("적용된 줄 수"+affectedRow);
		System.out.println(order);
	}
	
	@Test
	public void deleteTest() {
		try {
			customerService.deleteCustomerAndOrders(3);
		} catch (Exception e) {
			System.out.println("예외");
			e.printStackTrace();
		}
	}
}