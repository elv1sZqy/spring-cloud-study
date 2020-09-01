package cn.study.feignconsumer.controller;

import cn.study.feignconsumer.feign.HelloRibbon;
import cn.study.feignproduct.feign.HelloFeign;
import cn.study.feignproduct.feign.TestFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloController
 * @Author Elv1s
 * @Date 2020/8/29 16:16
 * @Description:
 */
@RestController
public class HelloController {

    @Autowired
    HelloFeign helloFeign;

    @Autowired
    TestFeign testFeign;

    @Autowired
    HelloRibbon helloRibbon;

    @GetMapping("/hello")
    public String sayHello() {
        return helloFeign.sayHello();
    }

    @GetMapping("/test")
    public String test() {
        return testFeign.test("hello3333 world");
    }

    @GetMapping("/rb")
    public String tes2t() {
        return helloRibbon.sayHello();
    }
}
