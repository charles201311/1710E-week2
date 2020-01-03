package com.bobo.week2.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bobo.week2.domain.Goods;
import com.bobo.week2.service.GoodsService;
import com.bobo.week2.vo.GoodsVO;
import com.github.pagehelper.PageInfo;

@Controller
public class GoodsController {
	@Resource
	
	private GoodsService goodsService;

	@RequestMapping("selects")
	public String selects(GoodsVO goodsVO,Model model,@RequestParam(defaultValue = "1")Integer page,@RequestParam(defaultValue = "8")Integer pageSize) {
		PageInfo<Goods> info = goodsService.selects(goodsVO, page, pageSize);
		model.addAttribute("info", info);
		model.addAttribute("goodsVO", goodsVO);
		return "goods";
		
		
		
	}
}
