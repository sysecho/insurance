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
import com.geestu.insurance.user.service.IUserService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InsuranceApplicationTests {

    @Autowired
    private IUserService userServiceImpl;

    @Test
    public void testSelect() {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.between(true, "age", 18, 30);
        IPage<User> page = userServiceImpl.page(new Page<>(1, 10), queryWrapper);
        page.getRecords().forEach(System.err::println);
    }
    
    @Test
    public void testAutoIncrement() {
      User entity = new User();
      entity.setName("sysecho");
      entity.setAge(Integer.valueOf(26));
      entity.setEmail("myword0523@gmail.com");
      userServiceImpl.save(entity);
      System.err.println(entity.getId());
    }
}

