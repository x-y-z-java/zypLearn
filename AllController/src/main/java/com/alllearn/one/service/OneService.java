package com.alllearn.one.service;

import com.alllearn.commons.ReturnObject;
import com.alllearn.goods.model.Goods;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * zyp
 * 2021/11/19
 */
@FeignClient(name="zypLearn-one-service1")
public interface OneService {
    @RequestMapping("getGoodsList")
    ReturnObject<List<Goods>> getGoodsList();

    @RequestMapping("/testa")
    ReturnObject<String> testa(@RequestParam String a);
}
