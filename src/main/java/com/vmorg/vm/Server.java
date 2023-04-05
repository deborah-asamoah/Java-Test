package com.vmorg.vm;

public class Server extends Machine{
    private String linuxName;
    private int majorNumber;
    private String kernelNumber;
    private String team;

    public Server(String hostName, String requestor, int numberOfCPUs, String date,  int numberOfRAMInGB, int sizeOfHDInGB, String linuxName, int majorNumber, String kernelNumber, String team) {
        super(hostName, requestor, numberOfCPUs, numberOfRAMInGB, sizeOfHDInGB, date);
        this.linuxName = linuxName;
        this.majorNumber = majorNumber;
        this.kernelNumber = kernelNumber;
        this.team = team;
    }

    public void setLinuxName(String linuxName) {
        this.linuxName = linuxName;
    }

    public void setMajorNumber(int majorNumber) {
        this.majorNumber = majorNumber;
    }

    public void setKernelNumber(String kernelNumber) {
        this.kernelNumber = kernelNumber;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getLinuxName() {
        return linuxName;
    }

    public int getMajorNumber() {
        return majorNumber;
    }

    public String getKernelNumber() {
        return kernelNumber;
    }

    public String getTeam() {
        return team;
    }

    public void setNumberOfCPUs(int numberOfCPUs) {
        if (super.getNumberOfCPUs() == 4) {
            super.setNumberOfCPUs(4);
        }else {
            super.setNumberOfCPUs(8);
        }
    }

    public void setNumberOfRAMInGB(int numberOfRAMInGB) {
        if (super.getNumberOfRAMInGB() == 64) {
            super.setNumberOfRAMInGB(64);
        }else {
            super.setNumberOfRAMInGB(128);
        }
    }

    public void setSizeOfHDInGB(int sizeOfHDInGB) {
        super.setSizeOfHDInGB(500);
    }
}
