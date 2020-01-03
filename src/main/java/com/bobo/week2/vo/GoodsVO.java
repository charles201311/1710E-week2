package com.bobo.week2.vo;

import java.io.Serializable;

/**
 * 
 * @ClassName: GoodsVO 
 * @Description: 封装前端查询条件
 * @author: charles
 * @date: 2020年1月3日 上午9:18:55
 */
public class GoodsVO  implements Serializable{
	
	
	/**
	 * @fieldName: serialVersionUID
	 * @fieldType: long
	 * @Description: TODO
	 */
	private static final long serialVersionUID = 1L;
	private String startPrice;
	private String endPrice;
	private String startSales;
	private String endSales;
	private String orderColum;//排序字段 价格，销售百分比
	private String orderMethod;//排序方法  asc ,desc
	public String getStartPrice() {
		return startPrice;
	}
	public void setStartPrice(String startPrice) {
		this.startPrice = startPrice;
	}
	public String getEndPrice() {
		return endPrice;
	}
	public void setEndPrice(String endPrice) {
		this.endPrice = endPrice;
	}
	public String getStartSales() {
		return startSales;
	}
	public void setStartSales(String startSales) {
		this.startSales = startSales;
	}
	public String getEndSales() {
		return endSales;
	}
	public void setEndSales(String endSales) {
		this.endSales = endSales;
	}
	public String getOrderColum() {
		return orderColum;
	}
	public void setOrderColum(String orderColum) {
		this.orderColum = orderColum;
	}
	public String getOrderMethod() {
		return orderMethod;
	}
	public void setOrderMethod(String orderMethod) {
		this.orderMethod = orderMethod;
	}
	
	

}
