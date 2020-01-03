package com.bobo.week2.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bobo.week2.dao.GoodsMapper;
import com.bobo.week2.domain.Goods;
import com.bobo.week2.service.GoodsService;
import com.bobo.week2.vo.GoodsVO;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class GoodsServiceImpl implements GoodsService {
	@Resource
	private GoodsMapper goodsMapper;

	@Override
	public PageInfo<Goods> selects(GoodsVO goodsVO,Integer page,Integer pageSize) {
		PageHelper.startPage(page, pageSize);
		List<Goods> list = goodsMapper.selects(goodsVO);
		return new PageInfo<Goods>(list);
	}

	@Override
	public int insert(List<Goods> goods) {
		
		return goodsMapper.insert(goods);
	}

}
