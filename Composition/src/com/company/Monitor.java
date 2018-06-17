package com.company;

import javax.print.attribute.ResolutionSyntax;

public class Monitor {
    private  String model;
    private  String manu;
    private  int size;
    private Resolution resolution;

    public Monitor(String model, String manu, int size, Resolution resolution) {
        this.model = model;
        this.manu = manu;
        this.size = size;
        this.resolution = resolution;
    }

    public String getModel() {
        return model;
    }

    public String getManu() {
        return manu;
    }

    public int getSize() {
        return size;
    }

    public Resolution getResolution() {
        return resolution;
    }

    public void drawpixel(int x,int y,String color){
        System.out.println("Draw pixel at "+x+" , "+y+" at color "+color);
    }
}
