package com.neo.remote;

import com.neo.remote.HelloRemote;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by summer on 2017/5/15.
 */
@Component
//创建HelloRemoteHystrix类继承与HelloRemote实现回调的方法
public class HelloRemoteHystrix implements HelloRemote{

    @Override
    public String hello(@RequestParam(value = "name") String name) {
        return "hello " +name+", this messge send failed ";
    }
}
