package cn.pccpa.feign.service;

import cn.pccpa.feign.service.impl.SchedualServiceHiHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author liukejie@pccpa.cn
 * @date 2019-02-11 15:04
 */
//@FeignClient(value = "service-hi")
@FeignClient(value = "service-hi",fallback = SchedualServiceHiHystric.class)
public interface SchedualHiService {

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
