package com.geestu.insurance.user.service.impl;

import com.geestu.insurance.user.entity.User;
import com.geestu.insurance.user.mapper.UserMapper;
import com.geestu.insurance.user.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xiaofei.xian
 * @since 2018-12-18
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
