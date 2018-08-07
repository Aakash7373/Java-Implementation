package com.company;

public class Main {

    public static void main(String[] args) {
        printmegabytesandkilobytes(2050);
       isleapyear(2000);
    }

    public static void printmegabytesandkilobytes(int kilobytes) {
        if (kilobytes < 0) {
            System.out.println("Invalid value");
        }
        else
        {

            int megabyte = 1024;
            int  megabytes = (kilobytes / megabyte);
           int z = (kilobytes % megabyte);

            System.out.println(kilobytes + " kilobytes = " + megabytes + " megabytes " + z + " kilobytes ");
        }
    }

    public static void isleapyear(int year)
    {

        if(year<1 || year>9999) {
            //return false;
            System.out.println("Invalid range");
        }
        else{

            if(year%4==0 && year%100!=0)
            {

                    System.out.println(" leap year");
                }
                else if(year%4==0 && year%400==0){
                //    return true;
                    System.out.println("Leap year");
            }
            else
            {
                System.out.println("Not a leap year");
            }
            }
            }

        }



