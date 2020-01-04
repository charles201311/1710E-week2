package com.bobo.week2.domain;

public enum StatusEnum {
	UNCHECKED(0,"未审"),CHECKED(1,"已审"), REJECT(2,"驳回");
	

	StatusEnum(Integer code,String name){
		this.code=code;
		this.name=name;
	}
	private Integer code;
	private String name;
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
