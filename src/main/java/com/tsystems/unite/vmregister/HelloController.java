package com.tsystems.unite.vmregister;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class HelloController {

    private static final String template = "Grüazi # %d %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(value= "/hello", method=GET)
    @ResponseBody
    public String hello(@RequestParam(value="name", defaultValue="World") String name) {
        return String.format(template, counter.incrementAndGet(), name);
    }
}
