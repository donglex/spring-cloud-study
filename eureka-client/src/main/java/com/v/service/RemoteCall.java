package com.v.service;


import com.v.service.serviceImpl.RemoteCallImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "user-server", fallback = RemoteCallImpl.class)
public interface RemoteCall {

    @RequestMapping("api/user/hello")
    public String sayHello();
}
