package com.bobo.week2.service;

import java.util.List;

import com.bobo.week2.domain.Goods;
import com.bobo.week2.vo.GoodsVO;
import com.github.pagehelper.PageInfo;

public interface GoodsService {

	/**
	 * 
	 * @Title: selects 
	 * @Description: 多条件查询
	 * @param goodsVO
	 * @return
	 * @return: List<Goods>
	 */
	PageInfo<Goods> selects(GoodsVO goodsVO,Integer page,Integer pageSize);
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
