package com.zhl.ali.handler;

import com.alibaba.csp.sentinel.slots.block.BlockException;

/**
 * @author Administrator
 */
public class Myhandler {
    public static String dealBlockException(Object obj){
        System.out.println(obj.toString());
        return "全局异常处理";
    }
}
