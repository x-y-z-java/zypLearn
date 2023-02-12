package com.alllearn.one.service;

import com.alllearn.goods.model.Goods;

import java.util.List;

/**
 * zyp
 * 2021/11/19
 */
public interface OneService {
    List<Goods> getGoodsList();

    String getZypString(String a);
}
