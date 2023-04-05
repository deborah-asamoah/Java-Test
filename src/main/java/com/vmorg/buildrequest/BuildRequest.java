package com.vmorg.buildrequest;

import com.vmorg.build.SystemBuildService;
import com.vmorg.vm.Machine;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class BuildRequest implements SystemBuildService {
    ArrayList<Machine> machinesBuiltToday;
    private int failures;

    public BuildRequest() {
        this.machinesBuiltToday = new ArrayList<>();
    }

    @Override
    public String createNewMachine(Machine machine) {
        String built = "";
        if (machine.getHostName() == null) {
            machinesBuiltToday.add(machine);
            built = machine.getHostName();
        } else {
            failures++;
        }
        return machine.getHostName();
    }

    /**
     * Interface used to create VM build requests.
     * VMs that are successfully created are tracked for auditing on a daily basis, as are failed requests.
     * If the build is successful, add the machine to the collection of machines built today.
     * If the build fails, record the failure for daily report.
     * The API can retrieve the total number of successful build on a per-requestor basis (for cross-charging)
     * and the total number of all failed builds for a given day
     */

}
