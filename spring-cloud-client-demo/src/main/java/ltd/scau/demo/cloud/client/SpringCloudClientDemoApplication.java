package ltd.scau.demo.cloud.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaClient
@SpringBootApplication
@RestController
@RefreshScope
public class SpringCloudClientDemoApplication {

    private String format = "%d >> %s";

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudClientDemoApplication.class, args);
    }

    @Value("${hello.value}")
    private String value;

    @Value("${server.port}")
    private Integer port;

    @GetMapping("/hi")
    public String hello() {
        return String.format(format, port, value);
    }

    @GetMapping("/hiv")
    public String hello(String v) {
        return String.format(format, port, v);
    }

    @GetMapping("/hi/{v}")
    public String pathHello(@PathVariable String v) {
        return String.format(format, port, v);
    }

}
