package com.alllearn.one.controller;

import com.alllearn.commons.CodeEnum;
import com.alllearn.commons.ReturnObject;
import com.alllearn.goods.model.Goods;
import com.alllearn.one.service.OneService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.ws.rs.PUT;
import java.util.List;

/**
 * zyp
 * 2022/7/2
 */
@RestController
@Slf4j
public class OneController {
    @Resource
    private OneService oneService;

    @RequestMapping("/getGoodsList")
    public ReturnObject<List<Goods>> getGoodsList() {
        //获取商品列表，这个方法并发量可能很好因此必要是可以从Redis中获取数据
        List<Goods> goodsList = oneService.getGoodsList();
//        if(goodsList==null){
//            return  new ReturnObject<List<Goods>>(CodeEnum.ERROR,"失败了",null);
//        }
        return new ReturnObject<List<Goods>>(CodeEnum.OK, "查询成功", goodsList);
    }

    @RequestMapping("/testa")
    @ResponseBody
    public ReturnObject<String> testa(String a){
        String x=oneService.getZypString(a);
        log.info("x:{}",x);
        return new ReturnObject<String>(CodeEnum.OK,"查询成功",x);
    }
}
