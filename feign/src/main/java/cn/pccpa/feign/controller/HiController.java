package cn.pccpa.feign.controller;

import cn.pccpa.feign.service.SchedualHiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liukejie@pccpa.cn
 * @date 2019-02-11 15:06
 */
@RestController
public class HiController {

    @Autowired
    SchedualHiService schedualHiService;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name) {
        return schedualHiService.sayHiFromClientOne(name);
    }

}
