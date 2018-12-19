package com.geestu.insurance.user.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
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
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class User {

    private static final long serialVersionUID = 1L;

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

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
      return "User [name=" + name + ", age=" + age + ", email=" + email + "]";
    }


}
