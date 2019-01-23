package com.tsystems.unite.vmregister;

import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class RegistrationService {

    Logger LOG = Logger.getLogger(getClass().getName());

    public void register(Registration registration) {
        LOG.severe(registration.toString());
    }
}
