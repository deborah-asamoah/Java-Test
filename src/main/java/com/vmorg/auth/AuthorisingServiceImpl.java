package com.vmorg.auth;

import com.vmorg.vm.Machine;

public class AuthorisingServiceImpl implements AuthorisingService{
    Machine machine = new Machine();

    @Override
    public boolean isAuthorised(String user) {
        if (machine.getRequestor() != null){
            return true;
        }
        return false;
    }
}
