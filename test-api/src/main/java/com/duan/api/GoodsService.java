package com.duan.api;

import java.util.List;
import java.util.Map;

/**
 * 提供商品服务接口
 * Created by duan2ping on 2017/11/9.
 */
public interface GoodsService {

    // 查询所有商品
    List<Map<String,Object>> getGoods();

    // 添加商品
    Integer add(String name,String type,Double price);
}
