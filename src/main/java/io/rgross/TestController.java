package io.rgross;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ryan on 3/16/17.
 */
@RestController
@RequestMapping("/")
public class TestController {

    @RequestMapping(path = "/hello", method = RequestMethod.GET, produces = "application/json")
    public String helloWorld() {
        return "HelloWorld!";
    }
}
