package ltd.scau.demo.cloud.ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author Weijie Wu
 */
@Service
public class DemoService {

    @Autowired
    private RestTemplate restTemplate;

    public String get() {
        return restTemplate.getForObject("http://CLIENT-DEMO/hi", String.class);
    }
}
