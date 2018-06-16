package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getdurationstring(70,50));
        System.out.println(getdurationstring(6945L));
    }

    public static String getdurationstring(long min, long sec) {
        if (min < 0 || (sec < 0 || sec > 59)) {
            return "Invalid value";
        }

            long hours=min/60;
            long remainingmin=min%60;
            return hours+" h "+ remainingmin+" m "+sec+" seconds ";

    }

    public static String getdurationstring(long sec) {
        if (sec < 0) {
            return "Invalid value";
        }

            long min=sec/60;
            long remainingsec=sec%60;
            return getdurationstring(min,sec);

    }
}
