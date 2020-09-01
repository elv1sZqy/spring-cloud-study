package cn.study.feignconsumer.feign;

import cn.study.feignconsumer.hystrixFallCack.HelloRibbonFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @ClassName HelloRibbon
 * @Author Elv1s
 * @Date 2020/8/29 16:13
 * @Description:
 */
@FeignClient(name = "RIBBON-PRODUCT", fallback = HelloRibbonFallBack.class)
public interface HelloRibbon {
    @GetMapping("hello")
    String sayHello();
}
