package cn.study.feignconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = {"cn.study.*", "cn.study.*.*"})
@EnableDiscoveryClient
@SpringBootApplication
public class FeignConsumerApplication {

  /*  @Bean
    public TestFeign getTestFeign() {
        return new TestFeign() {
            @Override
            public String test(String s) {
                return s;
            }
        };
    }*/

    public static void main(String[] args) {
        SpringApplication.run(FeignConsumerApplication.class, args);
    }

}
