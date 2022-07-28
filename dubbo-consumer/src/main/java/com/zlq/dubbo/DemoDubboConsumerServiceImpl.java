package com.zlq.dubbo;

import com.zlq.api.DemoDubboService;
import com.zlq.dubbo.service.DemoDubboConsumerService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

/**
 * @ProjectName:dubbo-demo
 * @Package:com.zlq.dubbleconsumer
 * @ClassName: DemoDubbleConsumer
 * @description:
 * @author: LiQun
 * @CreateDate:2022/7/28 18:37
 */
@Service
public class DemoDubboConsumerServiceImpl implements DemoDubboConsumerService {
    @DubboReference
    private DemoDubboService demoDubboService;

    public String hello() {
        return demoDubboService.sayHello();
    }
}
