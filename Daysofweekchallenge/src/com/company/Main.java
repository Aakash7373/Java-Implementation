package com.company;

public class Main {

    public static void main(String[] args) {

        printdaysofweek(0);
        printdaysofweek(1);
        printdaysofweek(2);
        printdaysofweek(3);
        printdaysofweek(4);
        printdaysofweek(5);
        printdaysofweek(6);
        printdaysofweek(-1);
        printdaysofweek(7);

        System.out.println("************************");

        for(int i=2;i<50;i++)
        {
            if(isprime(i))
            {
                System.out.println(i);
            }
        }

    }

    public  static void printdaysofweek(int day)
    {
        switch(day)
        {
            case 0:
                System.out.println("Sunday");
                break;

            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;

            default:
                System.out.println("Invalid Day");
                break;




        }
    }

    public  static Boolean isprime(int num)
    {
        if(num==1) {
            return false;
        }
        for(int i=2;i<=num/2;i++)
        {
            if(num%i==0) {
                return false;
            }
        }
        return true;
    }
}
