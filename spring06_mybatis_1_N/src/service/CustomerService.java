package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mapper.CustomerWithOrders;

@Service
public class CustomerService {
	
	@Autowired
	CustomerWithOrders customerWithOrders;
	
	@Transactional(rollbackFor = Exception.class) //트랜젝션을 설정하고자 하는 메서드에 적용
	public int deleteCustomerAndOrders(int customerId) throws Exception {
		customerWithOrders.deleteCustomer(customerId);
		int num =1;
		if(num==1) {
		throw new Exception();
		}
		customerWithOrders.deleteOrdersWithCustomerId(customerId);
		
		
		return 0;
	}
	
}
