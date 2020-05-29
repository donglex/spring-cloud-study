package com.v.controller;

import com.v.service.RemoteCall;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RemoteCallController {
    @Autowired
    private RemoteCall remoteCall;

    @RequestMapping("main")
    public String remote() {
        return remoteCall.sayHello();
    }
}
