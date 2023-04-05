package com.vmorg.vm;

import com.vmorg.RequestEngine;

import java.util.Date;

public class Machine {
    private String hostName;
    private String requestor;
    private int numberOfCPUs;
    private int numberOfRAMInGB;
    private int sizeOfHDInGB;
    private String date;

    private static int numberOfBuilds;



    public Machine(String hostName, String requestor, int numberOfCPUs, int numberOfRAMInGB, int sizeOfHDInGB, String date) {
        this.hostName = hostName;
        this.requestor = requestor;
        this.numberOfCPUs = numberOfCPUs;
        this.numberOfRAMInGB = numberOfRAMInGB;
        this.sizeOfHDInGB = sizeOfHDInGB;
        this.date = "20230405";
        numberOfBuilds++;
    }

    public Machine() {
    }
    public Machine(String requestor) {
        this.requestor = requestor;
    }

    public Machine(String hostName, String date) {
        this.date = date;
        numberOfBuilds++;
    }

    public String getHostName() {
        return hostName;
    }

    public String getRequestor() {
        return requestor;
    }

    public int getNumberOfCPUs() {
        return numberOfCPUs;
    }

    public int getNumberOfRAMInGB() {
        return numberOfRAMInGB;
    }

    public int getSizeOfHDInGB() {
        return sizeOfHDInGB;
    }

    public void setHostName(RequestEngine requestEngine) {
        this.hostName = requestEngine.generateHostName(this.hostName, this.date, numberOfBuilds );
    }

    public void setRequestor(String requestor) {
        this.requestor = requestor;
    }

    public void setNumberOfCPUs(int numberOfCPUs) {
        this.numberOfCPUs = numberOfCPUs;
    }

    public void setNumberOfRAMInGB(int numberOfRAMInGB) {
        this.numberOfRAMInGB = numberOfRAMInGB;
    }

    public void setSizeOfHDInGB(int sizeOfHDInGB) {
        this.sizeOfHDInGB = sizeOfHDInGB;
    }
}
