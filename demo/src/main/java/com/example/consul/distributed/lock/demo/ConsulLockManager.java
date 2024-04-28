package com.example.consul.distributed.lock.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.consul.serviceregistry.ConsulServiceRegistry;
import org.springframework.stereotype.Service;

@Service
public class ConsulLockManager {

    @Autowired
    private ConsulServiceRegistry consulLockRegistry;

    public boolean acquireLock(String lockKey) {
        return true;
    }

    public void releaseLock(String lockKey) {

    }
}
