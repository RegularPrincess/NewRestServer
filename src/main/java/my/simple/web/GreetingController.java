package my.simple.web;

import my.simple.domain.UserEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by jmfedorov on 31.03.17.
 */
@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public UserEntity greeting(@RequestParam(value="name", required=false, defaultValue="World") String name) {
        return new UserEntity();
    }
}
