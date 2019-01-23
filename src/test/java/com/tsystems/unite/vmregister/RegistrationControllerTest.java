package com.tsystems.unite.vmregister;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class RegistrationControllerTest {

    @Test
    public void register() {
        RegistrationController regCtrl = new RegistrationController();
        RegistrationService regsvrMock = Mockito.mock(RegistrationService.class);
        regCtrl.registrationService = regsvrMock;
        Registration reg = regCtrl.register("hostname", "zmbfemea", "johndoe@mail", "12.34.56.78", "11:22:33:44:55:66", "12345");
        System.out.println(reg.toString());

    }
}