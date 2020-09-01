package cn.study.feignproduct.controller;

import cn.study.feignproduct.feign.HelloFeign;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloService
 * @Author Elv1s
 * @Date 2020/8/29 16:39
 * @Description:
 */
@RestController
@RequestMapping("say")
public class HelloController implements HelloFeign {
    @Override
    public String sayHello() {
        System.out.println("jinlaile");
        return "hello world";
    }
}
