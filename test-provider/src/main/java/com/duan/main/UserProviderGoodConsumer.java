package com.duan.main;

import com.duan.api.GoodsService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * 脚本方式启动提供服务
 * Created by duan2ping on 2017/11/9.
 */
public class UserProviderGoodConsumer {

    // 启动提供服务
    public static void main(String args[]) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"dubbo-demo-provider.xml"});
        context.start();
        while(true) {
            System.out.println("已开启提供用户服务，等待提供者提供物品服务...(按任意键开始执行)");
            System.in.read();
            GoodsService goodsService = (GoodsService) context.getBean("goodsService");
            System.err.println("调用物品服务获得物品："+goodsService.getGoods());
        }
    }

}
