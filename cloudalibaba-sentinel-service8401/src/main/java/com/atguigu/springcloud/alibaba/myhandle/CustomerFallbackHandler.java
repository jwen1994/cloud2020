package com.atguigu.springcloud.alibaba.myhandle;

import com.atguigu.springcloud.entities.CommonResult;

public class CustomerFallbackHandler {
    public static CommonResult handlerFallback(Throwable exception) {
        return new CommonResult(2020, "自定义熔断处理信息....CustomerFallbackHandler");
    }
}
