package com.alllearn.commons;

/**
 * 常量类
 *
 */
public final class Constants {
    private Constants(){}
    //商品库存在Redis中的t统一Key前缀
    public static final String GOODS_STORE="GOODS_STORE:";
    //用户限购记录在Redis中的统一Key前缀
    public static final String PURCHASE_LIMITS="PURCHASE_LIMITS:";
    //服务器限流在Redis中的Key(计数器)
    public static final String CURRENT_LIMITING="CURRENT_LIMITING";
    //订单备份数据在Redis中的key
    public static final String ORDERS="ORDERS";
    //订单结果再Redis中的统一key前缀
    public static final String ORDERS_RESULT="ORDERS_RESULT:";
    //分布式锁在Redis中的统一key
    public static final String LOCK="LOCK:";


}
