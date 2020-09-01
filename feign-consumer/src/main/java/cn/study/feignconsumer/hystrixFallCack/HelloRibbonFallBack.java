package cn.study.feignconsumer.hystrixFallCack;

import cn.study.feignconsumer.feign.HelloRibbon;
import org.springframework.stereotype.Component;

/**
 * @ClassName HelloRibbonFallBack
 * @Author Elv1s
 * @Date 2020/8/30 11:05
 * @Description:
 */
@Component
public class HelloRibbonFallBack implements HelloRibbon {

    @Override
    public String sayHello() {
        return "error";
    }
}
