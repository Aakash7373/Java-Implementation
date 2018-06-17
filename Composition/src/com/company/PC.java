package com.company;

public class PC {

    private Case thecase;
    private Monitor monitor;
    private  Motherboard mother;

    public PC(Case thecase, Monitor monitor, Motherboard mother) {
        this.thecase = thecase;
        this.monitor = monitor;
        this.mother = mother;
    }


    public  void powerup()
    {
        thecase.powersupply();
        drawlogo();
    }

    public void drawlogo()
    {
        monitor.drawpixel(1500,1200,"Red");
    }
}
