package com.bobo.week2.domain;

import java.io.Serializable;
import java.math.BigDecimal;
/**
 * 
 * @ClassName: Goods 
 * @Description: TODO
 * @author: charles
 * @date: 2020��1��3�� ����9:15:39
 */
public class Goods implements Serializable {
	
	
	
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	private BigDecimal price;
	private Integer sales;
	
	private StatusEnum statusEnum;//状态属性
	
	
	
	public StatusEnum getStatusEnum() {
		return statusEnum;
	}
	public void setStatusEnum(StatusEnum statusEnum) {
		this.statusEnum = statusEnum;
	}
	private AreaEnum areaEnum;//区域。枚举类型
	
	
	
	
	public AreaEnum getAreaEnum() {
		return areaEnum;
	}
	public void setAreaEnum(AreaEnum areaEnum) {
		this.areaEnum = areaEnum;
	}
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
