package com.xiyuan.dubbo.service.impl;

import com.xiyuan.dubbo.model.User;
import com.xiyuan.dubbo.service.IUserService;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by xiyuan_fengyu on 2018/5/14 18:17.
 */
@Service
public class UserService implements IUserService {

    @Override
    public User get() {
        return new User(0L, "Tom");
    }

    @Override
    public Map<String, Object> testMap() {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("success", true);
        map.put("name", "Tome");
        return map;
    }

}
