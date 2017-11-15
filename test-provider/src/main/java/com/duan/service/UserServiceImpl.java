package com.duan.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.duan.api.UserService;
import com.duan.entity.User;
import org.apache.log4j.Logger;

import java.util.*;

/**
 * 提供服务的具体实现
 * Created by duan2ping on 2017/11/9.
 */
@Service
public class UserServiceImpl implements UserService{
    private Logger logger = Logger.getLogger(UserServiceImpl.class);
    List<User> ulist = new ArrayList<User>();

    // 初始化数据
    {
        ulist.add(new User(1,"admin",18,"beijing"));
        ulist.add(new User(2,"tom",20,"shanghai"));
        ulist.add(new User(3,"dingd",18,"hunan"));
    }

    // 查询所有用户
    public List<Map<String,Object>> getUsers() {
        logger.info("------------------【用户服务被消费】 getUsers-----------");
        List<Map<String,Object>> result = new ArrayList<Map<String, Object>>();
        for(User user : ulist){
            Map<String,Object> currenUser = new HashMap<String, Object>();
            currenUser.put("id",user.getId());
            currenUser.put("name",user.getName());
            currenUser.put("age",user.getAge());
            currenUser.put("address",user.getAddress());
            result.add(currenUser);
        }
        return result;
    }

    // 添加用户
    public Integer add(String name, Integer age, String address) {
        try {
            Integer id = 0;
            for (int i = 0; i < ulist.size(); i++) {
                id = ulist.get(i).getId();
                if (i > 0) {
                    if (id < ulist.get(i).getId()) {
                        id = ulist.get(i).getId();
                    }
                }
            }
            id++;
            ulist.add(new User(id, name, age, address));
        }catch (Exception e){
            logger.error("添加用户错误："+e.getMessage());
            return 0;
        }
        return 1;
    }
}
