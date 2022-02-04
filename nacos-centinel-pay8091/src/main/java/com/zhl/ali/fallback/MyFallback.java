package com.zhl.ali.fallback;

/**
 * @author Administrator
 */
public class MyFallback {

    public static  String dealfallback(Exception e){
        return "程序运行异常的全局处理";
    }
}
