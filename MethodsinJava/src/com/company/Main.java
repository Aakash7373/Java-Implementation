package com.company;

public class Main {

    public static void main(String[] args)
    {
      boolean gameover=true;
      int score=1000;
      int bonus=50;
      int total=bonus+score;
      Calculatescore(gameover,score,bonus,total);

    }

    public static void Calculatescore(boolean gameover, int score, int bonus, int total)
    {
        gameover=true;
        score=1000;
        bonus=50;
        total=(bonus+score);

        if(gameover)
        {
            System.out.println("The total score is: "+ total);
        }
        else
        {
            System.out.println("Total score is: "+ 1000);
        }
    }
}
