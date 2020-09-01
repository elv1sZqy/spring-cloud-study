package cn.study.feignproduct.controller;

import cn.study.feignproduct.feign.TestFeign;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TestController
 * @Author Elv1s
 * @Date 2020/8/30 9:33
 * @Description:
 */
@RestController
@RequestMapping("test")
public class TestController implements TestFeign {

    @Override
    public String test(String s) {
        return s;
    }
}
