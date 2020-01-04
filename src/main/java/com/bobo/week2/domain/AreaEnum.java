package com.bobo.week2.domain;

public enum AreaEnum {
	
	CHINA(0,"中国"),JAPEN(1,"日本"),ENGLISH(2,"英国");
	
	private Integer code;
	private String name;
    AreaEnum(Integer code,String name){
		this.code =code;
		this.name=name;
	}
    
    public static void main(String[] args) {
    	System.out.println(AreaEnum.CHINA);
    	
    
    	
	}
	
	
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
