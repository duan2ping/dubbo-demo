package com.duan.main;

import com.duan.api.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.io.IOException;

/**
 * 脚本方式启动服务
 * Created by duan2ping on 2017/11/9.
 */
public class UserConsumerGoodsProvider {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"dubbo-demo-consumer.xml"});
        context.start();
        while(true) {
            System.out.println("已开启提供物品服务，等待提供者提供用户服务...(按任意键开始执行)");
            System.in.read();
            UserService userService = (UserService) context.getBean("userService"); // 获取远程服务代理
            System.err.println("调用用户服务获得用户："+userService.getUsers());// 执行远程方法
        }
    }

}
