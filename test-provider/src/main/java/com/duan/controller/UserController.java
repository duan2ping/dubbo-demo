package com.duan.controller;

import com.duan.api.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 用户请求处理类
 * Created by duan2ping on 2017/11/10.
 */
@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/query")
    public ModelAndView query(ModelAndView mv){
        mv.setViewName("usermanager");
        mv.addObject("ulist",userService.getUsers());
        return mv;
    }

    @RequestMapping(value = "add")
    public ModelAndView add(ModelAndView mv,String name,Integer age,String address){
        mv.setViewName("redirect:query");
        Integer result = userService.add(name,age,address);
        return mv;
    }

}
