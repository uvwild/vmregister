package com.tsystems.unite.vmregister;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * a rest service to receive
 */
@RestController
public class RegistrationController {

    private static final String regTemplate= "Registering %s %s %d!";
    private final AtomicLong registerCounter= new AtomicLong();

    @Autowired RegistrationService registrationService;

    @RequestMapping(value= "/register", method=GET)
    @ResponseBody
    public Registration register(@RequestParam(value="hostname", defaultValue="testvm", required=true) String hostname,
                                 @RequestParam(value="emeaId", defaultValue="ZFMBXXX", required=true) String emea,
                                 @RequestParam(value="email", defaultValue="john.doe@t-systems.com", required=true) String email,
                                 @RequestParam(value="ip", defaultValue="192.168.255.255", required=true) String ip,
                                 @RequestParam(value="mac", defaultValue="00:00:00:00:00:00", required=true) String mac,
                                 @RequestParam(value="lastUpdated", defaultValue="12345678", required=true) String lastUpdated) {
        Registration reg = new Registration();
        reg.id = registerCounter.incrementAndGet();
        reg.hostname = hostname;
        reg.emeaId = emea;
        reg.email = email;
        reg.ip = ip;
        reg.mac = mac;
        reg.lastUpdated = lastUpdated;
        reg.timestamp = new Date();
        registrationService.register(reg);
        return reg;
    }
}
