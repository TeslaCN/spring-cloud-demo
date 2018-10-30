package ltd.scau.demo.cloud.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Weijie Wu
 */
@FeignClient("client-demo")
public interface FeignService {

    @GetMapping("/hi")
    String hello();

    @GetMapping("/hiv")
    String hello(@RequestParam(value = "v") String v);

    @GetMapping("/hi/{v}")
    String hellov(@PathVariable("v") String v);
}
