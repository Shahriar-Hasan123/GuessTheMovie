package com.cse;

public class CheckAndPrint {

    public int News(String letters, String Store, int wrong, String wrongStore,int check) {
        System.out.print("You are guessing:");
        for (int i = 0; i < letters.length(); i++) {
            char c = letters.charAt(i);
            if (Store.indexOf(c) == -1)
                System.out.print("_");
            else{
                System.out.print(c);check++;}
        }

        System.out.println();


        System.out.print("You have gussed (" + wrong + ") wrong letters:");
        for (int i = 0; i < wrongStore.length(); i++) {
            System.out.print(wrongStore.charAt(i) + " ");
        }
        System.out.println();
        return check;
    }


}
