package com.duan.api;

import java.util.List;
import java.util.Map;

/**
 * 提供用户服务接口
 * Created by duan2ping on 2017/11/9.
 */
public interface UserService {

    // 查询所有用户
    List<Map<String,Object>> getUsers();

    // 添加用户
    Integer add(String name,Integer age,String address);
}
