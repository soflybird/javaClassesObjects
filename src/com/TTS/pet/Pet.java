package com.TTS.pet;

public class Pet {
    private String pName;
    private int pAge;
    private String pLocation;
    private String pType;

    private Pet(){
        pName = "default name";
        pAge = 0;
        pLocation = "location";
        pType = "type";
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public int getpAge() {
        return pAge;
    }

    public void setpAge(int pAge) {
        this.pAge = pAge;
    }

    public String getpLocation() {
        return pLocation;
    }

    public void setpLocation(String pLocation) {
        this.pLocation = pLocation;
    }

    public String getpType() {
        return pType;
    }

    public void setpType(String pType) {
        this.pType = pType;
    }


}



