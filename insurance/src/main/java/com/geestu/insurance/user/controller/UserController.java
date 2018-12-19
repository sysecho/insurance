package com.geestu.insurance.user.controller;


import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.geestu.insurance.user.entity.User;
import com.geestu.insurance.user.mapper.UserMapper;
import com.geestu.insurance.user.service.IUserService;
import com.geestu.insurance.user.service.impl.UserServiceImpl;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author xiaofei.xian
 * @since 2018-12-18
 */
@Controller  
public class UserController{
	
	@Autowired
    private IUserService userServiceImpl;
	
	@RequestMapping(value = "/hello",method = {RequestMethod.GET})
    public String helloHtml(HashMap<String, Object> map) {
		QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("age", 18);
        map.put("hello", userServiceImpl.getOne(queryWrapper));
        return "index";
    }
}
