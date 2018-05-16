package multi.edu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("service")
@Component
public class ProductService30 implements ProductService{
	ProductService service;
	
	@Override
	public ProductVO sell(double sale, int coupon) {
		return service.sell(sale,coupon);
	}
}
