package com.vmorg.vm;

public class Desktop extends Machine{
    private String windowsVersion;
    private String buildNumber;

    public String getWindowsVersion() {
        return windowsVersion;
    }

    public void setWindowsVersion(String windowsVersion) {
        this.windowsVersion = windowsVersion;
    }

    public void setBuildNumber(String buildNumber) {
        this.buildNumber = buildNumber;
    }

    public String getBuildNumber() {
        return buildNumber;
    }

    public Desktop(String hostName, String requestor, int numberOfCPUs, int numberOfRAMInGB, int sizeOfHDInGB, String date, String windowsVersion, String buildNumber) {
        super(hostName, requestor, numberOfCPUs, numberOfRAMInGB, sizeOfHDInGB, date);
        this.windowsVersion = windowsVersion;
        this.buildNumber = buildNumber;
    }

    public void setNumberOfCPUs(int numberOfCPUs) {
        if (super.getNumberOfCPUs() == 2) {
            super.setNumberOfCPUs(2);
        }else {
            super.setNumberOfCPUs(1);
        }
    }

    public void setNumberOfRAMInGB(int numberOfRAMInGB) {
        super.setNumberOfRAMInGB(16);
    }

    public void setSizeOfHDInGB(int sizeOfHDInGB) {
        super.setSizeOfHDInGB(160);
    }
}
