package com.geestu.insurance.user.entity;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author xiaofei.xian
 * @since 2018-12-18
 */
@Data
@Accessors(chain = true)
public class User {

    /**
     * 主键
     */
    private Long id;
    
    /**
     * 姓名
     */
    private String name;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 邮箱
     */
    private String email;

}
