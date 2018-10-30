package ltd.scau.demo.cloud.ribbon.web;

import ltd.scau.demo.cloud.ribbon.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Weijie Wu
 */
@RestController
public class Controller {

    @Autowired
    private DemoService demoService;

    @GetMapping("/hello")
    public String hello() {
        return demoService.get();
    }
}
