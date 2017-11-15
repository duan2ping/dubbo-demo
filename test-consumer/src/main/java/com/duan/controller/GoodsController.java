package com.duan.controller;

import com.duan.api.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 物品请求处理类
 * Created by duan2ping on 2017/11/10.
 */
@Controller
@RequestMapping("/goods")
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    @RequestMapping("/query")
    public ModelAndView query(ModelAndView mv){
        mv.setViewName("goodsmanager");
        mv.addObject("glist",goodsService.getGoods());
        return mv;
    }

    @RequestMapping(value = "add")
    public ModelAndView add(ModelAndView mv,String name,String type,Double price){
        mv.setViewName("redirect:query");
        Integer result = goodsService.add(name,type,price);
        return mv;
    }

}
