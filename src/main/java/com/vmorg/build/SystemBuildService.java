package com.vmorg.build;

import com.vmorg.vm.Machine;

public interface SystemBuildService {
    String createNewMachine(Machine machine);

//
//        If a host has been correctly created, the returned String will contain the hostname of the newly created machine.

//                If a build request fails, the String will be an empty String (but NOT null). This failed request should be noted. There is a requirement for a daily report specifying the count of failed builds. Hostnames used for failed requests are never reused for this report.
    }

