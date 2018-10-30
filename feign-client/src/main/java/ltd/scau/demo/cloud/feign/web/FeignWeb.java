package ltd.scau.demo.cloud.feign.web;

import ltd.scau.demo.cloud.feign.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Weijie Wu
 */
@RestController
public class FeignWeb {

    @Autowired
    private FeignService feignService;

    @GetMapping("/hh")
    public String hh() {
        return feignService.hello();
    }

    @GetMapping("/hhv")
    public String hhv(String v) {
        return feignService.hello(v);
    }

    @GetMapping("/man")
    public String man(String v) {
        return feignService.hellov(v);
    }
}
