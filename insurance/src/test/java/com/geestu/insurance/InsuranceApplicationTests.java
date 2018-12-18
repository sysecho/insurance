package com.geestu.insurance;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.geestu.insurance.user.entity.User;
import com.geestu.insurance.user.service.impl.UserServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InsuranceApplicationTests {

    @Autowired
    private UserServiceImpl userServiceImpl;

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.between(true, "age", 18, 20);
        IPage<User> page = userServiceImpl.page(new Page<>(1, 2), queryWrapper);
        page.getRecords().forEach(System.out::println);
    }
}

