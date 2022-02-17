package com.gupaoedu.springboot.dubbo.springbootdubbosampleprovider.services;


import com.gupaoedu.springboot.dubbo.ISayHelloService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * 版本控制切换
 **/

@DubboService(registry = {"shanghai","hunan"},version = "2.0")
public class SayHelloServiceImpl2 implements ISayHelloService {

    @Override
    public String sayHello(String msg) {
        System.out.println("version2   2");
        return "[Version2.0]Hello,"+msg+" GuPaoEdu.cn";
    }
}
