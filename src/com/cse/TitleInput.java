package com.cse;

import java.io.File;
import java.util.Random;
import java.util.Scanner;

public class TitleInput {

    public static String GameTittle() {
        String[] str = new String[25];
        int r=0,i;
     try {
         File fileText = new File("in.txt");
         Scanner keyBoardInput = new Scanner(fileText);
         for (i=0 ; keyBoardInput.hasNextLine(); i++) {
             str[i] = keyBoardInput.nextLine();
         }
         Random random = new Random();
          r = random.nextInt(i);

     }catch (Exception e){
         System.out.println("NOT FOUND");
     }
        return str[r];
    }

}
