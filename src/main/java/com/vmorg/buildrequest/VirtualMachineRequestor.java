package com.vmorg.buildrequest;

import com.vmorg.vm.Machine;

import java.util.Map;

public interface VirtualMachineRequestor {

//    void createNewRequest(Machine machine) throws UserNotEntitledException, MachineNotCreatedException;

    Map<String, Map<String, Integer>> totalBuildsByUserForDay();

    int totalFailedBuildsForDay();
}
