package org.ly.service.impl;


import org.ly.dao.FoodInfoDao;
import org.ly.pojo.Foodinfo;
import org.ly.service.FoodInfoService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional
public class FoodInfoServiceImpl implements FoodInfoService {

    //注入底层数据
    @Resource
    private FoodInfoDao foodInfoDao;

    /**
     * 添加
     * @param food
     * @return
     */
    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public int insert(Foodinfo food) {
        return foodInfoDao.insert(food);
    }
}
