package com.v.service.serviceImpl;

import com.v.service.RemoteCall;
import org.springframework.stereotype.Service;

@Service
public class RemoteCallImpl implements RemoteCall{
    @Override
    public String sayHello() {
        return "断路器: \"success!\"";
    }
}
