package com.fenfei.springcloud;

import java.io.Serializable;

/**
 * Created by zhangwet on 2017/9/14 0014.
 */
public class User implements Serializable {

    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
