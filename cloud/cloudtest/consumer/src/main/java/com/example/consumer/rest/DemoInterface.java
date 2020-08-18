package com.example.consumer.rest;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value="provider")
@Component
public interface DemoInterface {
    @RequestMapping(value="/demo/{string}")
    String echo(@PathVariable String string);
}
