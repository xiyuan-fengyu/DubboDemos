package com.xiyuan.dubbo.service;

import com.xiyuan.dubbo.model.User;

import java.util.Map;

/**
 * Created by xiyuan_fengyu on 2018/5/14 18:07.
 */
public interface IUserService {

    User get();

    Map<String, Object> testMap();

}
