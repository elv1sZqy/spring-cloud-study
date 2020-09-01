package cn.study.ribbonproductor.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName HelloController
 * @Author Elv1s
 * @Date 2020/8/29 9:04
 * @Description:
 */
@RestController
public class HelloController {
    private Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    private DiscoveryClient discoveryClient;
    @Value("${spring.application.name}")
    private String applicationName;

    @GetMapping("/hello")
    public String sayHello() {
        try {
            TimeUnit.SECONDS.sleep(4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        List<ServiceInstance> instances = discoveryClient.getInstances(applicationName);
        logger.info("当前应用名称:{}, {}", applicationName, instances.get(discoveryClient.getOrder()));
        return "hello world";
    }

}
