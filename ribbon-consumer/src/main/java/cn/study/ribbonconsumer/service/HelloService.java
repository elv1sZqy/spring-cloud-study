package cn.study.ribbonconsumer.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName HelloService
 * @Author Elv1s
 * @Date 2020/8/29 11:31
 * @Description:
 */
@Service
public class HelloService {


    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "errorFunction")
    public String sayHello(){
        return restTemplate.getForEntity("http://RIBBON-PRODUCT/hello", String.class).getBody();
    }

    private String errorFunction() {
        return "error";
    }
}
