package com.zlq.dubbo;

import com.zlq.api.DemoDubboService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @ProjectName:dubbo-demo
 * @Package:com.zlq.dubboprivider
 * @ClassName: DemoDubboServiceImpl
 * @description:
 * @author: LiQun
 * @CreateDate:2022/7/28 18:28
 */
@DubboService
public class DemoDubboServiceImpl implements DemoDubboService {

    @Override
    public String sayHello() {
        return "hello";
    }
}
