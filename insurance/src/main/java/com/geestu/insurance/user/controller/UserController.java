package com.geestu.insurance.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.geestu.insurance.exception.BaseException;
import com.geestu.insurance.response.ResponseCode;
import com.geestu.insurance.user.entity.User;
import com.geestu.insurance.user.service.IUserService;
import freemarker.template.utility.StringUtil;

/**
* 类描述
* @author xiaofei.xian
* 日期：2018年12月19日 下午6:26:13
*/

@RestController
@RequestMapping("/user")
public class UserController {
  
  @Autowired
  private IUserService userServiceImpl;

  /**
   * 保存测试
   * @param user
   * @return
   * author:xiaofei.xian
   * 日期：2018年12月19日 下午6:52:08
   */
  @RequestMapping(method=RequestMethod.PUT) 
  public User user(@RequestBody User user) {
   if(StringUtils.isEmpty(user.getName())){
     throw new BaseException(ResponseCode.MISS_PARAMETER, "参数为空,data:"+user);
   }
   userServiceImpl.save(user);
   return user;
  }
}
