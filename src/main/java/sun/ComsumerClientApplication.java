package sun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * @program: springbootService
 * @description:
 * @author: Chixiaolin
 * @create: 2021-12-08 09:16
 **/
@SpringBootApplication
@ServletComponentScan
@EnableDiscoveryClient
//@RefreshScope
public class ComsumerClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(ComsumerClientApplication.class,args);
    }

}
