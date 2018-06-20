package com.xiyuan.template.controller;

import com.xiyuan.dubbo.model.User;
import com.xiyuan.dubbo.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TemplateController {

    private final Logger logger = LoggerFactory.getLogger(TemplateController.class);

    @Autowired
    private IUserService userService;

    @RequestMapping(value = "test")
    @ResponseBody
    public User test() {
        return userService.get();
    }

    @RequestMapping(value = "test/map")
    @ResponseBody
    public Object testMap() {
        return userService.testMap();
    }

}
