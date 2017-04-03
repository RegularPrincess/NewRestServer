package my.simple.web;

import my.simple.domain.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by jmfedorov on 31.03.17.
 */
@RestController
@RequestMapping("/app")
public class GreetingController {


    @Autowired

//, @RequestParam(value="name", required=false, defaultValue="World") String name

    @RequestMapping(value = "/room/{id-room}", method = RequestMethod.GET)
    public UserEntity greeting(@RequestAttribute(value = "id-room") int idRoom) {
        return null;
    }
}
