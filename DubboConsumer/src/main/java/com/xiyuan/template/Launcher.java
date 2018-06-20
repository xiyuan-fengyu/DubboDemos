package com.xiyuan.template;

import com.xiyuan.dubbo.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created by xiyuan_fengyu on 2018/6/20 16:10.
 */
@Component
public class Launcher {

    private final Logger logger = LoggerFactory.getLogger(Launcher.class);

    @Autowired
    private IUserService userService;

    public void execute() {
        System.out.println(userService.get());
    }

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "spring/applicationContext.xml",
                "spring/springServlet.xml"
        );
        context.getBean(Launcher.class).execute();
    }

}
