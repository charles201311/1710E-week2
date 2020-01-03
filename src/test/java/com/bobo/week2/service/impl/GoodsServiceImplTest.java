package com.bobo.week2.service.impl;

import static org.junit.Assert.fail;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bobo.week2.domain.Goods;
import com.bobo.week2.service.GoodsService;

import com.yangchunbo.util.NumberUtil;
import com.yangchunbo.util.StreamUtil;
import com.yangchunbo.util.StringUtil;
//启动spring容器
@ContextConfiguration(locations = "classpath:spring-beans.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class GoodsServiceImplTest {
	
	
	  @Resource
	  private GoodsService goodsService;
	 
	@Test
	public void testSelects() {
		fail("Not yet implemented");
	}

	@Test//导入数据
	public void testInsert() {
		
		List<Goods> goodsList =new ArrayList<Goods>();
	
		//调用工具类
		List<String> list = StreamUtil.readLine(this.getClass().getResourceAsStream("/data.txt"));
	  for (int j = 1; j < list.size(); j++) {
			 Goods goods = new Goods();
			 String[] s = list.get(j).split("\\==");
			 goods.setId(Integer.parseInt(s[0]));//封装ID
			 if(StringUtil.hasText(s[1]))
			 goods.setName(s[1]);
			 //处理价格
			 //判断是否有值
			 if(StringUtil.hasText(s[2])) {
				 String price=s[2].substring(1);//去掉¥
				 //判断是否是数字
				  if(NumberUtil.isNumber(price)) {
					 BigDecimal p = new BigDecimal(price);
					 goods.setPrice(p);
				  }
			 }
			 
			 
			 //处理百分比 。如果有值
			 if(s.length>3 &&StringUtil.hasText(s[3])) {
			 String sales =s[3].substring(0,s[3].length()-1);
			   goods.setSales(Integer.parseInt(sales));
			 }else {
				 //没有值，默认0
				 goods.setSales(0); 
			 }
			 
			 goodsList.add(goods);
			
		}
	  System.out.println(goodsList);
		
		
		goodsService.insert(goodsList);
		
		}

}
