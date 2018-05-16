package multi.edu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductDAO {
	ProductVO vo;

	public ProductVO sell(double sale, int coupon) {
		vo.setCoupon(coupon);
		vo.setSale(sale);
		return vo;
	}
}
