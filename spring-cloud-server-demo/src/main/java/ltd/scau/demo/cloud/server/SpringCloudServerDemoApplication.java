package ltd.scau.demo.cloud.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@EnableConfigServer
@SpringBootApplication
public class SpringCloudServerDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudServerDemoApplication.class, args);
    }
}
