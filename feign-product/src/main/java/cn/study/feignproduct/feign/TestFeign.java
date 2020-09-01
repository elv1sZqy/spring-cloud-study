package cn.study.feignproduct.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @InterfaceName TestFeign
 * @Author Elv1s
 * @Date 2020/8/30 9:30
 * @Description:
 */
@FeignClient(name = "feign-product",path = "test")
public interface TestFeign {
    String path = "test";

    @GetMapping("/say")
    String test(@RequestParam("s") String s);
}
