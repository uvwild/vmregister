package com.tsystems.unite.vmregister;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * a registration object for the developer VMs to support remote administration
 */
@ToString
public class Registration {

    @Getter
    @Setter
    long id;
    @Getter
    @Setter
    String emeaId;
    @Getter
    @Setter
    String email;
    @Getter
    @Setter
    String hostname;
    @Getter
    @Setter
    String ip;
    @Getter
    @Setter
    String mac;
    @Getter
    @Setter
    String lastUpdated;
    @Getter
    Date timestamp;

}
