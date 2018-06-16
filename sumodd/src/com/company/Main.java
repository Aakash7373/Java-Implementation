package com.company;

public class Main {

    public static void main(String[] args) {
       int x= sumodd(1,100);
        System.out.println(x);

	  }


	  public static  boolean isodd(int num)
      {
          if(num<0)
              return false;

          if(num%2!=0) {
              return true;
          }

          return false;

      }

     public static int sumodd(int start,int end) {
          int sum = 0;
          if ((start>end) || (start<0) || (end<0)) {
                return -1;
          }
              for (int i = start; i <= end; i++) {
                  if (isodd(i)) {
                      sum = sum + i;
                  }
              }
                  return sum;

      }
}
