package com.bobo.week2.dao;

import java.util.List;

import com.bobo.week2.domain.Goods;
import com.bobo.week2.vo.GoodsVO;

public interface GoodsMapper {
	/**
	 * 
	 * @Title: selects 
	 * @Description: 多条件查询
	 * @param goodsVO
	 * @return
	 * @return: List<Goods>
	 */
	List<Goods> selects(GoodsVO goodsVO);
	/**
	 * 
	 * @Title: insert 
	 * @Description: //批量增加
	 * @param goods
	 * @return
	 * @return: int
	 */
	int insert(List<Goods> goods);
	

}
