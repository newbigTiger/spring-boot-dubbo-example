package com.gupaoedu.springboot.dubbo.springbootdubbosampleprovider.services;


import com.gupaoedu.springboot.dubbo.ISayHelloService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * 俩版本，可以通过配置来切换使用
 **/

@DubboService(registry = {"shanghai","hunan"},version = "1.0")
public class SayHelloServiceImpl implements ISayHelloService {

    @Override
    public String sayHello(String msg) {
        System.out.println("version1   1");
        return "[version1.0]Hello,"+msg+" GuPaoEdu.cn";
    }
}
