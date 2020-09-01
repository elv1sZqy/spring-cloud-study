package cn.study.ribbonconsumer.controller;

import cn.study.ribbonconsumer.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloController
 * @Author Elv1s
 * @Date 2020/8/29 9:20
 * @Description:
 */
@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @GetMapping("hello")
    public String sayHello() {
        return helloService.sayHello();
    }

}
