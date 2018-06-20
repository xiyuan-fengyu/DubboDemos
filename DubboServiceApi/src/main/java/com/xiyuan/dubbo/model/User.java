package com.xiyuan.dubbo.model;

import java.io.Serializable;

/**
 * Created by xiyuan_fengyu on 2018/5/14 18:08.
 */
public class User implements Serializable {

    private static final long serialVersionUID = -2034526388179989503L;

    private Long id;

    private String name;

    public User(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
