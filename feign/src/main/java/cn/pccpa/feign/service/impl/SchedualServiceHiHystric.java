package cn.pccpa.feign.service.impl;

import cn.pccpa.feign.service.SchedualHiService;
import org.springframework.stereotype.Component;

/**
 * @author liukejie@pccpa.cn
 * @date 2019-02-11 15:50
 */
@Component
public class SchedualServiceHiHystric implements SchedualHiService {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
