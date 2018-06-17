package com.company;

public class Motherboard {
    private  String model;
    private  String manuact;
    private  int ram;
    private int card;
    private  String bios;

    public Motherboard(String model, String manuact, int ram, int card, String bios) {
        this.model = model;
        this.manuact = manuact;
        this.ram = ram;
        this.card = card;
        this.bios = bios;
    }

    public String getModel() {
        return model;
    }

    public String getManuact() {
        return manuact;
    }

    public int getRam() {
        return ram;
    }

    public int getCard() {
        return card;
    }

    public String getBios() {
        return bios;
    }

    public void loadprogram(String progname)
    {
        System.out.println("Program "+progname+" is now loading ");
    }
}
