package com.alllearn.one.controller;

import com.alibaba.fastjson2.JSONObject;
import com.alllearn.commons.CodeEnum;
import com.alllearn.commons.ReturnObject;
import com.alllearn.config.ZypLogin;
import com.alllearn.goods.model.Goods;
import com.alllearn.one.service.OneService;
import com.fasterxml.jackson.databind.util.JSONPObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * zyp
 * 2022/7/2
 */
@RestController
@Slf4j
//@RequestMapping
public class OneController {
    @Autowired
    private OneService oneService;

    @PostMapping("/")
    public String show(Model model){
        log.info("model:{}",model);
        ReturnObject<List<Goods>> returnObject=oneService.getGoodsList();
        model.addAttribute("goodsList",returnObject.getResult());
        return "index";
    }

    @PostMapping("/testa")
//    @ZypLogin
    public ReturnObject testa(@RequestBody @RequestParam(name = "x") String a){
        log.info("进入");
        ReturnObject<List<Goods>> goodsList = oneService.getGoodsList();
//        model.addAttribute("b",b);
        JSONObject resultJson=new JSONObject();
        resultJson.put("凑数","搭子");
        ReturnObject newReturn=new ReturnObject<>(CodeEnum.OK,"新返回",goodsList);
        return newReturn;
    }
}
