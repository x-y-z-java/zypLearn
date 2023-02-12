package com.alllearn.one.service.impl;

import com.alllearn.goods.model.Goods;
import com.alllearn.one.mapper.GoodsMapper;
import com.alllearn.one.service.OneService;
import com.sun.media.jfxmedia.logging.Logger;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * zyp
 * 2022/7/2
 */
@Service
@Slf4j
public class OneServiceImpl implements OneService {
    @Resource
    private GoodsMapper goodsMapper;
    @Override
    public List<Goods> getGoodsList() {
        return  goodsMapper.selectAll();
    }

    @Override
    public String getZypString(String a) {
        log.info("参数进入：{}",a);
        return "返回";
    }

    public static void main(String[] args) {
        
    }
}
