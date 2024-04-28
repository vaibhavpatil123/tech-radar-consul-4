package com.example.consul.distributed.lock.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DistributedLockController {

    @Autowired
    private ConsulLockManager lockService;

    @PostMapping("/acquire-lock")
    public boolean acquireLock() {
        String lockKey = "my_lock";
        return lockService.acquireLock(lockKey);
    }

    @PostMapping("/release-lock")
    public void releaseLock() {
        String lockKey = "my_lock";
        lockService.releaseLock(lockKey);
    }
}
