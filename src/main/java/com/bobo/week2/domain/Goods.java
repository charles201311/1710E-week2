package com.bobo.week2.domain;

import java.io.Serializable;
import java.math.BigDecimal;
/**
 * 
 * @ClassName: Goods 
 * @Description: TODO
 * @author: charles
 * @date: 2020年1月3日 上午9:15:39
 */
public class Goods implements Serializable {
	
	
	/**
	 * @fieldName: serialVersionUID
	 * @fieldType: long
	 * @Description: TODO
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	private BigDecimal price;
	private Integer sales;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public Integer getSales() {
		return sales;
	}
	public void setSales(Integer sales) {
		this.sales = sales;
	}
	

}
