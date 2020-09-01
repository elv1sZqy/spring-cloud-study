package cn.study.feignproduct.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @InterfaceName HelloFeign
 * @Author Elv1s
 * @Date 2020/8/29 16:35
 * @Description:
 */
@FeignClient(name = "FEIGN-PRODUCT", path = "/say")
public interface HelloFeign {

    @GetMapping("hello")
    String sayHello();

}
