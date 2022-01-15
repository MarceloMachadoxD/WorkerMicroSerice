package com.github.marcelomachadoxd.hrpayrollms.feigncleints;

import com.github.marcelomachadoxd.hrpayrollms.entities.Worker;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(name = "hrworkerms", url = "http://localhost:8001", path = "/workers")
public interface WorkerFeignClient {

    @GetMapping("/{id}")
    public ResponseEntity<Worker> findById(@PathVariable Long id);



}
