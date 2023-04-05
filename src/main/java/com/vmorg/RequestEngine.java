package com.vmorg;

import com.vmorg.auth.AuthorisingServiceImpl;
import com.vmorg.vm.Machine;

import java.util.Date;

public class RequestEngine implements Frontend{
    Machine machine = new Machine();
    @Override
    public String generateHostName(String host, String date, int numberOfBuilds) {
        return host + date + numberOfBuilds;
    }

    @Override
    public String authenticateUser(String user) {
        return user;
    }

    public boolean authorisationRequest (AuthorisingServiceImpl a){
        if (a.isAuthorised(authenticateUser(machine.getRequestor()))) {
            return  true;
        }
        return  false;
    }
}
