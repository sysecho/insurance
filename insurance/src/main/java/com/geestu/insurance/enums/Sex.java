package com.geestu.insurance.enums;

import com.baomidou.mybatisplus.core.enums.IEnum;

public enum Sex implements IEnum<Integer> {
    MAILE(1, "男"),
    FEMAL(2, "女士");

    private Integer value;
    private String desc;

    Sex(final Integer value, final String desc) {
        this.value = value;
        this.desc = desc;
    }

    @Override
    public Integer getValue() {
        return this.value;
    }

    public String getDesc(){
        return this.desc;
    }
    
    
}