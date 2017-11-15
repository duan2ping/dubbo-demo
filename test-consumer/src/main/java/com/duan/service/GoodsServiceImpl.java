package com.duan.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.duan.api.GoodsService;
import com.duan.entity.Goods;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 物品服务实现类
 * Created by duan2ping on 2017/11/9.
 */
@Service
public class GoodsServiceImpl implements GoodsService {
    private Logger logger = Logger.getLogger(GoodsServiceImpl.class);
    List<Goods> goodsList = new ArrayList<Goods>();

    // 初始化数据
    {
        goodsList.add(new Goods(1,"apple","水果",12.8));
        goodsList.add(new Goods(2,"banana","水果",10.2));
        goodsList.add(new Goods(3,"open","文具",0.8));
    }

    // 查询所有物品
    public List<Map<String,Object>> getGoods() {
        logger.info("------------------【物品服务被消费】 getGoods-----------");
        List<Map<String,Object>> result = new ArrayList<Map<String, Object>>();
        for(Goods goods : goodsList){
            Map<String,Object> currenGoods = new HashMap<String, Object>();
            currenGoods.put("id",goods.getId());
            currenGoods.put("name",goods.getName());
            currenGoods.put("type",goods.getType());
            currenGoods.put("price",goods.getPrice());
            result.add(currenGoods);
        }
        return result;
    }

    // 添加商品
    public Integer add(String name, String type, Double price) {
        try {
            Integer id = 0;
            for (int i = 0; i < goodsList.size(); i++) {
                id = goodsList.get(i).getId();
                if (i > 0) {
                    if (id < goodsList.get(i).getId()) {
                        id = goodsList.get(i).getId();
                    }
                }
            }
            id++;
            goodsList.add(new Goods(id, name, type, price));
        }catch (Exception e){
            logger.error("添加商品错误："+e.getMessage());
            return 0;
        }
        return 1;
    }

}
