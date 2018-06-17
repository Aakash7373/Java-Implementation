package com.company;

public class Case {
    private  String model;
    private String manu;
    private String power;
    private Dimensions dImensions;

    public Case(String model, String manu, String power, Dimensions dImensions) {
        this.model = model;
        this.manu = manu;
        this.power = power;
        this.dImensions = dImensions;
    }

    public String getModel() {
        return model;
    }

    public String getManu() {
        return manu;
    }

    public String getPower() {
        return power;
    }

    public Dimensions getdImensions() {
        return dImensions;
    }

    public void powersupply()
    {
        System.out.println("Power button pressed ");
    }


}
