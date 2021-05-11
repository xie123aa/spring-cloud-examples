package com.neo.remote;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by summer on 2017/5/11.
 */
//name:远程服务名，及spring.application.name配置的名称
@FeignClient(name= "spring-cloud-producer")
public interface HelloRemote {
    //此类中的方法和远程服务中contoller中的方法名和参数需保持一致
    @RequestMapping(value = "/hello")
    public String hello(@RequestParam(value = "name") String name);


}
