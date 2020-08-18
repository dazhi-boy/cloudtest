package com.example.consumer.controller;

import com.example.consumer.rest.DemoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("demo")
public class DemoController {
    @Autowired
    DemoInterface demoInterface;

    @RequestMapping(value = "{string}", method = RequestMethod.GET)
    public String echo(@PathVariable String string) {
        return demoInterface.echo(string);
    }
}
