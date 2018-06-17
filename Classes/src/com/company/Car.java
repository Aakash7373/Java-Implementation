package com.company;

public class Car {

    private String name;
    private int price;
    private int wheels;
    public String person;

    public void setname(String name)
    {
        String lname = name.toLowerCase();
        if(lname.equals("bmw"))
        {
            this.name=name;
        }
        else{
            this.name="Unknown";
        }

    }

    public String getname()
    {
        return this.name;
    }
}
