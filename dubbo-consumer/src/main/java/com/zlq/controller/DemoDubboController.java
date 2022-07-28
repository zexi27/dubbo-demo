package com.zlq.controller;

import com.zlq.dubbo.service.DemoDubboConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName:dubbo-demo
 * @Package:com.zlq.controller
 * @ClassName: DemoDubboController
 * @description:
 * @author: LiQun
 * @CreateDate:2022/7/28 18:39
 */
@RestController
public class DemoDubboController {
    @Autowired
    private DemoDubboConsumerService demoDubboConsumer;

    @RequestMapping("/hello")
    public String sayHello(){
        return demoDubboConsumer.hello();
    }
}
