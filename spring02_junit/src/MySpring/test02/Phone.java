package MySpring.test02;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Phone {
	@Value("삼성")
	private String brand;
	
	@Value(value = "200000")
	private int price;

	public String getBrand() {
		return brand;
	}

	public int getPrice() {
		return price;
	}

	
}
