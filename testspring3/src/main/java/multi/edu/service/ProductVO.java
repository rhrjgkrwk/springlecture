package multi.edu.service;

import org.springframework.stereotype.Component;

//@Component
public class ProductVO {
	private int code;
	private String name;
	private int price;
	private double sale;
	private int coupon;
	public ProductVO() {
		// TODO Auto-generated constructor stub
	}
	public ProductVO(int code, String name, int price, double sale, int coupon) {
		super();
		this.code = code;
		this.name = name;
		this.price = price;
		this.sale = sale;
		this.coupon = coupon;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getSale() {
		return sale;
	}
	public void setSale(double sale) {
		this.sale = sale;
	}
	public int getCoupon() {
		return coupon;
	}
	public void setCoupon(int coupon) {
		this.coupon = coupon;
	}
	
}
