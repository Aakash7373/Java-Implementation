package com.company;

public class Main {

    public static void main(String[] args) {
//        int position = calculatehighscoreposition(1500);
//        displayhighscoreposition("Akash", position);
        {
            int position=calculatehighscoreposition(500);
            displayhighscoreposition("Tim",position);

        }
        checknumber(0);
    }
        public static void displayhighscoreposition (String name,int pos){

            System.out.println(name + " Managed to get into position " + pos + " on the high score table");
        }

        public static int calculatehighscoreposition(int score){
            if (score >= 1000) {
                return 1;
            } else if (score >= 500 && score < 1000) {
                return 2;
            } else if (score >= 100 && score < 500) {
                return 3;
            } else {
                return 4;
            }

        }

        public static void checknumber(int num)
        {
            if(num>0){
                System.out.println("Positive");
        }
        else if(num<0){
                System.out.println("Negative");
            }
            else
            {
                System.out.println("Zero");
            }
        }
    }